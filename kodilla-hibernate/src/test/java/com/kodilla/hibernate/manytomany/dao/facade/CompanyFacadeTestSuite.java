package com.kodilla.hibernate.manytomany.dao.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.facade.CompanyFacade;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class CompanyFacadeTestSuite {

    @Autowired
    private CompanyFacade companyFacade;

    @Test
    void testSearchCompanyAndEmployeesByAnyLetters() {

        //Given
        Employee johnSmith = new Employee("John", "Smith");
        Employee stephaniePodolsky = new Employee("Stephanie", "Podolsky");
        Employee lindaKovalsky = new Employee("Linda", "Kovalsky");

        Company softwareMachine = new Company("Software Machine");
        Company dataMaesters = new Company("Data Maesters");
        Company greyMatter = new Company("Grey Matter");

        softwareMachine.getEmployees().add(johnSmith);
        dataMaesters.getEmployees().add(stephaniePodolsky);
        dataMaesters.getEmployees().add(lindaKovalsky);
        greyMatter.getEmployees().add(johnSmith);
        greyMatter.getEmployees().add(lindaKovalsky);

        johnSmith.getCompanies().add(softwareMachine);
        johnSmith.getCompanies().add(greyMatter);
        stephaniePodolsky.getCompanies().add(dataMaesters);
        lindaKovalsky.getCompanies().add(dataMaesters);
        lindaKovalsky.getCompanies().add(greyMatter);

        //When

        companyFacade.saveCompany(softwareMachine);
        int softwareMachineId = softwareMachine.getId();
        companyFacade.saveCompany(dataMaesters);
        int dataMaestersId = dataMaesters.getId();
        companyFacade.saveCompany(greyMatter);
        int greyMatterId = greyMatter.getId();

        List<Company> resultCompanyList = companyFacade.searchCompanyNameByAnyLetters("at");

        List<Employee> resultEmployeeList = companyFacade.searchEmployeeNameByAnyLetters("sky");

        //Then
        assertEquals(2, resultCompanyList.size());
        assertEquals(2, resultEmployeeList.size());

        //CleanUp
        try {
            companyFacade.deleteCompanyById(softwareMachineId);
            companyFacade.deleteCompanyById(dataMaestersId);
            companyFacade.deleteCompanyById(greyMatterId);
        } catch (Exception e) {
            //do nothing
        }
    }



}
