package com.vn.mvnsample.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Service;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Employee {
    private String empId;
    private String firstName;
    private String lastName;
    private String emailId;
    private String gender;
    private String contactNo;


}
