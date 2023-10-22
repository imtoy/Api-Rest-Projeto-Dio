package me.dio.domain.repository;


import me.dio.domain.model.Company;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompanyRepository extends JpaRepository<Company, Long> {

    static boolean findById() {
        return false;
    }

    boolean existsByName(String name);
}