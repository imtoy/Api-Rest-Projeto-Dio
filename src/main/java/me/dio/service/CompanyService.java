package me.dio.service;

import me.dio.domain.model.Company;

public interface CompanyService {
    Company findById(Long id);

    Company create(Company companyToCreate);
}