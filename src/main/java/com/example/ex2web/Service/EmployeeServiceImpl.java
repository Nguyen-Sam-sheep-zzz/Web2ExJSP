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
        staffs.put(1,new Staff(1,"sam",20,"hello","asdf",30));
        staffs.put(2,new Staff(2,"Khanh",20,"hello","asdf",30));
        staffs.put(3,new Staff(3,"Quy",20,"hello","asdf",30));
        staffs.put(4,new Staff(4,"Hell",20,"hello","asdf",30));
        staffs.put(5,new Staff(5,"Chanh",20,"hello","asdf",30));
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

