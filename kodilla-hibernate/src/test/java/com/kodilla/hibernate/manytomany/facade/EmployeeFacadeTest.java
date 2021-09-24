package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;

import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class EmployeeFacadeTest {

    @Autowired
    private EmployeeDao employeeDao;
    @Autowired
    private CompanyDao companyDao;
    @Autowired
    private EmployeeFacade employeeFacade;

    @Test
    void testFindCompanyByThree(){
        //Given
        Company company = new Company("BBBBCD");
        companyDao.save(company);
        //When
        List<Company> result = employeeFacade.findCompanyByThree("BBB");
        //Then
        Assertions.assertEquals(4,result.size());
        //clean
        companyDao.delete(company);

    }
// dopisac test
    @Test
    void testFindEmployeeByName(){
        //Given
        Employee employee = new Employee("John","Rambo");
        employeeDao.save(employee);
        //When
        List<Employee> result = employeeFacade.findEmployeeByName("Rambo");
        //Then
        Assertions.assertEquals(0,result.size());
        //clean
        employeeDao.delete(employee);
    }
}