package com.vn.mvnsample.modules;

import com.vn.mvnsample.models.Employee;
import org.springframework.stereotype.Service;

import java.util.List;


public interface View {

    public void setItemsInEmployeeGrid(List<Employee> employeeList);

    public interface Presenter {
        List<Employee> findAllEmployee();
    }

}
