package com.telran.jpaunihometask.controller;

import com.telran.jpaunihometask.dto.CompanyResponse;
import com.telran.jpaunihometask.model.Company;
import com.telran.jpaunihometask.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/company")
public class CompanyController {

    @Autowired
    private CompanyService companyService;

    @PostMapping
    public CompanyResponse save(@RequestBody Company company) {
        CompanyResponse companyResponse = companyService.save(company);
        return companyResponse;
    }

    @GetMapping("/{id}")
    public CompanyResponse getCompany(@PathVariable Long id) {

        CompanyResponse companyResponse = companyService.getCompany(id);
        return companyResponse;
    }

}
