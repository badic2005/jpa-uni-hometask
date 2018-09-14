package com.telran.jpaunihometask.service;

import com.telran.jpaunihometask.dto.CompanyResponse;
import com.telran.jpaunihometask.model.Company;
import com.telran.jpaunihometask.repository.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CompanyServiceImpl implements CompanyService {

    @Autowired
    private CompanyRepository companyRepository;

    @Override
    public CompanyResponse save(Company company) {
        Company companyNew = companyRepository.save(company);

        CompanyResponse companyResponse = CompanyResponse.builder()
                .companyName(companyNew.getCompanyName())
                .build();

        return companyResponse;

    }

    @Override
    public CompanyResponse getCompany(Long id) {

        Company company = companyRepository.getOne(id);

        CompanyResponse companyResponse = CompanyResponse.builder()
                .companyName(company.getCompanyName())
                .build();

        return companyResponse;
    }
}
