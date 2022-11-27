package com.vn.mvnsample.modules;

import com.vaadin.flow.spring.annotation.SpringComponent;
import com.vaadin.flow.spring.annotation.UIScope;
import com.vn.mvnsample.models.Employee;
import org.atmosphere.config.service.UUIDProviderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;


@SpringComponent
public class PresenterImpl implements View.Presenter {
    private List<Employee> listOfEmployee;

    @Lazy
    @Resource
    View viewImpl;

    public PresenterImpl(){



    }
    @PostConstruct
    private void fillData(){
        listOfEmployee = new ArrayList<>();
        listOfEmployee.add(new Employee("3456788",
                "Barbara",
                "Gordan",
                "barbara@gcpd.com",
                "Female",
                "7854568944"));

        listOfEmployee.add(new Employee("3456789",
                "Clark",
                "Kent",
                "clark@kent.com",
                "Male",
                "9875515321"));

        listOfEmployee.add(new Employee("3456790",
                "Anton",
                "Chigurh",
                "anton@company.com",
                "Male",
                "9965452518"));

        listOfEmployee.add(new Employee("3456791",
                "Diana",
                "Peterson",
                "diana@amazon.com",
                "Female",
                "9563216321"));

        listOfEmployee.add(new Employee("3456792",
                "Peggy",
                "Olsen",
                "peggy@company.com",
                "Female",
                "9885614577"));

        listOfEmployee.add(new Employee("3456793",
                "Bruce",
                "Wayne",
                "bruce@wayne.com",
                "Male",
                "9874453787"));

        listOfEmployee.add(new Employee("3456794",
                "Leslie",
                "Knope",
                "leslie@company.com",
                "Female",
                "9649115793"));
    }

    @Override
    public List<Employee> findAllEmployee() {
        viewImpl.setItemsInEmployeeGrid(listOfEmployee);
        return listOfEmployee;
    }
}
