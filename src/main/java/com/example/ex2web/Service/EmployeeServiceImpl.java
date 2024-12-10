package com.example.ex2web.Service;

import com.example.ex2web.Model.Staff;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EmployeeServiceImpl implements EmployeeService {

    private static Map<Integer, Staff> staffs;

    static {
        staffs = new HashMap<>();
    }

    @Override
    public List<Staff> findAllStaff() {
        return new ArrayList<>(staffs.values());
    }

    @Override
    public void addStaff(Staff staff) {
        staffs.put(staff.getId(), staff);
    }

    @Override
    public Staff findStaffById(int id) {
        return staffs.get(id);
    }

    @Override
    public void updateStaff(int id, Staff staff) {
        staffs.put(id, staff);
    }

    @Override
    public void deleteStaff(int id) {
        staffs.remove(id);
    }
}

