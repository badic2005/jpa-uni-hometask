package com.telran.jpaunihometask.service;

import com.telran.jpaunihometask.dto.CompanyResponse;
import com.telran.jpaunihometask.model.Company;

public interface CompanyService {
    CompanyResponse save(Company company);

    CompanyResponse getCompany(Long id);
}
