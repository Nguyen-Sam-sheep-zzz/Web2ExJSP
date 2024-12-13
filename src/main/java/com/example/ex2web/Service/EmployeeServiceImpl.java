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
        staffs.put(1,new Staff(1,"Sâm",20,"Vua","Cung điện",99999999));
        staffs.put(2,new Staff(2,"Khánh",20,"Rô lốc","Chuồng chó",0));
        staffs.put(3,new Staff(3,"Chí Anh",20,"Tật","Chuồng chó",0));
        staffs.put(4,new Staff(4,"Nhân",20,"Nhặng","Chuồng chó",0));
        staffs.put(5,new Staff(5,"Tâm",20,"Rô lốc","Chuồng chó",0));
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

