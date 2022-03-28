package com.kodilla.hibernate.manytomany.facade;


import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompanyFacade {

    private final CompanyDao companyDao;
    private final EmployeeDao employeeDao;

    @Autowired
    public CompanyFacade(CompanyDao companyDao, EmployeeDao employeeDao) {
        this.companyDao = companyDao;
        this.employeeDao = employeeDao;
    }


    public void saveCompany(Company company) {
        companyDao.save(company);
    }

    public void deleteCompanyById(int id) {
        companyDao.deleteById(id);
    }

    public List<Company> searchCompanyNameByAnyLetters(String key) {
        key = "%" + key + "%";
        System.out.println(key);
        return companyDao.retrieveCompWithAnyLetters(key);
    }

    public List<Employee> searchEmployeeNameByAnyLetters(String key) {
        key = "%" + key + "%";
        return employeeDao.retrieveEmployeeWithNameByAnyLetters(key);
    }


}
