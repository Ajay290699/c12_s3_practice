package org.niit.config;

import org.niit.domain.Department;
import org.niit.domain.Employee;
import org.springframework.context.annotation.Bean;

public class AppConfig {

    @Bean
    public Employee getEmployeeDetails(){
        Employee e = new Employee();
        e.setEmployeeId(111);
        e.setEmployeeName("Ajay Chavan");
        e.setEmployeeAddress("Navi Mumbai");
        e.setEmployeePhone(7526393211l);
        return e;
    }

    @Bean
    public Department getDepartmentDetails(){
        Department d = new Department();
        d.setDepartmentID(2116);
        d.setDepartmentName("Software/IT");
        return  d;
    }
}
