package me.dio.service.impl;

import me.dio.domain.model.Company;
import me.dio.domain.repository.CompanyRepository;
import me.dio.service.CompanyService;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public class CompanyServiceImpl implements CompanyService {

    private final CompanyRepository companyRepository;

    public CompanyServiceImpl(CompanyRepository companyRepository) {
        this.companyRepository = companyRepository;
    }

    @Override
    public Company findById(Long id) {
        return companyRepository.findById(id).orElseThrow(NoSuchElementException::new);
    }


    @Override
    public Company create(Company CompanyToCreate) {
        if (CompanyRepository.findById()) {
            throw new IllegalArgumentException("This Company number already exists.");
        }
        return companyRepository.save(CompanyToCreate);  }
}