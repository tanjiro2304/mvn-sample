package com.vn.mvnsample.modules;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.spring.annotation.SpringComponent;
import com.vaadin.flow.spring.annotation.UIScope;
import com.vaadin.flow.theme.Theme;
import com.vaadin.flow.theme.lumo.Lumo;
import com.vn.mvnsample.configuration.Config;
import com.vn.mvnsample.models.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;


import javax.annotation.Resource;
import java.util.List;

@Route("/employee-info")
@Theme(value = Lumo.class, variant = Lumo.DARK)
@UIScope
@SpringComponent
public class ViewImpl extends VerticalLayout implements View{

    private Grid<Employee> employeeGrid;

    private Button b1;
    private Presenter presenterImpl;

    @Autowired
    ViewImpl(Presenter presenterImpl){
        this.presenterImpl = presenterImpl;

        employeeGrid = new Grid<>();

        employeeGrid.addColumn(Employee::getFirstName).setHeader("First Name");
        employeeGrid.addColumn(Employee::getLastName).setHeader("Last Name");
        employeeGrid.addColumn(Employee::getGender).setHeader("Gender Name");
        employeeGrid.addColumn(Employee::getEmailId).setHeader("Email Id");
        employeeGrid.addColumn(Employee::getContactNo).setHeader("Contact No");
        b1 = new Button("Refresh");
        b1.addClickListener(event -> loadDataIntoGrid());
//        employeeGrid.setItems(presenterImpl.findAllEmployee());

        add(employeeGrid,b1);
    }

    private void loadDataIntoGrid() {
        presenterImpl.findAllEmployee();
    }


    @Override
    public void setItemsInEmployeeGrid(List<Employee> employeeList) {
        employeeGrid.setItems(employeeList);
    }
}
