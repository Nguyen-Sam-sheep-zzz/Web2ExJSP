package com.example.ex2web.Service;

import com.example.ex2web.Model.Staff;

import java.util.List;

public interface EmployeeService {
    List<Staff> findAllStaff();

    void addStaff(Staff staff);

    Staff findStaffById(int id);

    void updateStaff(int id, Staff staff);

    void deleteStaff(int id);
}
