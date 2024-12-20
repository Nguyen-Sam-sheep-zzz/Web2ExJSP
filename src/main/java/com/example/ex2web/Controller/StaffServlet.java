package com.example.ex2web.Controller;

import com.example.ex2web.Model.Staff;
import com.example.ex2web.Service.EmployeeService;
import com.example.ex2web.Service.EmployeeServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "StaffServlet", value = "/staffs")
public class StaffServlet extends HttpServlet {
    private final EmployeeService employeeService = new EmployeeServiceImpl();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        req.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html; charset=UTF-8");
        resp.setCharacterEncoding("UTF-8");

        String action = req.getParameter("action");

        if (action == null) {
            action = "";
        }
        switch (action) {
            case "add":
                addStaff(req, resp);
                break;
            case "delete":
                deleteStaff(req, resp);
                break;
            case "update":
                updateStaff(req, resp);
                break;
            default:
                break;
        }
    }

    private void deleteStaff(HttpServletRequest req, HttpServletResponse resp) {
        int id = Integer.parseInt(req.getParameter("id"));
        Staff staff = this.employeeService.findStaffById(id);
        RequestDispatcher dispatcher;

        if (staff == null) {
            dispatcher = req.getRequestDispatcher("/staff/error-404.jsp");
        } else {
            this.employeeService.deleteStaff(id);
            try {
                resp.sendRedirect("/staffs");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private void updateStaff(HttpServletRequest req, HttpServletResponse resp) {
        String name = req.getParameter("name");
        int age = Integer.parseInt(req.getParameter("age"));
        String position = req.getParameter("position");
        String department = req.getParameter("department");
        double salary = Double.parseDouble(req.getParameter("salary"));
        int id = Integer.parseInt(req.getParameter("id"));

        Staff staff = this.employeeService.findStaffById(id);
        System.out.println(staff);
        RequestDispatcher dispatcher;

        if (staff == null) {
            dispatcher = req.getRequestDispatcher("/staff/error-404.jsp");
        } else {

            staff.setName(name);
            staff.setAge(age);
            staff.setPosition(position);
            staff.setDepartment(department);
            staff.setSalary(salary);
            staff.setId(id);

            this.employeeService.updateStaff(id, staff);
            req.setAttribute("staff", staff);
            req.setAttribute("message", "Staff information was updated");
            dispatcher = req.getRequestDispatcher("staff/update.jsp");

            try {
                dispatcher.forward(req, resp);
            } catch (ServletException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }

    private void addStaff(HttpServletRequest req, HttpServletResponse resp) {
        String name = req.getParameter("name");
        int age = Integer.parseInt(req.getParameter("age"));
        String position = req.getParameter("position");
        String department = req.getParameter("department");
        double salary = Double.parseDouble(req.getParameter("salary"));
        int id = (int) (Math.random() * 10000);

        Staff staff = new Staff(id, name, age, position, department, salary);
        this.employeeService.addStaff(staff);
        RequestDispatcher dispatcher = req.getRequestDispatcher("/staff/add.jsp");
        req.setAttribute("message", "New staff was added successfully");

        try {
            dispatcher.forward(req, resp);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String action = req.getParameter("action");

        if (action == null) {
            action = "";
        }
        switch (action) {
            case "add":
                showAddForm(req, resp);
                break;
            case "update":
                showUpdateForm(req, resp);
                break;
            case "delete":
                showDeleteForm(req, resp);
                break;
            case "view":
                viewStaff(req, resp);
                break;
            default:
                listStaff(req, resp);
                break;
        }
    }

    private void listStaff(HttpServletRequest req, HttpServletResponse resp) {
        List<Staff> staffs = this.employeeService.findAllStaff();
        req.setAttribute("staffs", staffs);
        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/staff/list.jsp");

        try {
            dispatcher.forward(req, resp);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void viewStaff(HttpServletRequest req, HttpServletResponse resp) {
        int id = Integer.parseInt(req.getParameter("id"));
        Staff staff = this.employeeService.findStaffById(id);
        RequestDispatcher dispatcher;

        if (staff == null) {
            dispatcher = req.getRequestDispatcher("staff/error-404.jsp");
        } else {
            req.setAttribute("staff", staff);
            dispatcher = req.getRequestDispatcher("staff/view.jsp");
        }

        try {
            dispatcher.forward(req, resp);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void showUpdateForm(HttpServletRequest req, HttpServletResponse resp) {
        int id = Integer.parseInt(req.getParameter("id"));
        Staff staff = this.employeeService.findStaffById(id);
        RequestDispatcher dispatcher;

        if (staff == null) {
            dispatcher = req.getRequestDispatcher("staff/error-404.jsp");
        } else {
            req.setAttribute("staff", staff);
            dispatcher = req.getRequestDispatcher("staff/update.jsp");
        }

        try {
            dispatcher.forward(req, resp);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private void showDeleteForm(HttpServletRequest req, HttpServletResponse resp) {
        int id = Integer.parseInt(req.getParameter("id"));
        Staff staff = this.employeeService.findStaffById(id);
        RequestDispatcher dispatcher;

        if (staff == null) {
            dispatcher = req.getRequestDispatcher("staff/error-404.jsp");
        } else {
            req.setAttribute("staff", staff);
            dispatcher = req.getRequestDispatcher("staff/delete.jsp");
        }
        try {
            dispatcher.forward(req, resp);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void showAddForm(HttpServletRequest req, HttpServletResponse resp) {
        RequestDispatcher dispatcher = req.getRequestDispatcher("staff/add.jsp");

        try {
            dispatcher.forward(req, resp);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


