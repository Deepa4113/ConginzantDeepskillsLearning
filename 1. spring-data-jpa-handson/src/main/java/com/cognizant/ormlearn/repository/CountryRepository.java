package com.cognizant.ormlearn.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cognizant.ormlearn.model.Country;

// Extending JpaRepository gives us findAll(), findById(), save(), deleteById(), etc.
// for free - no boilerplate Hibernate Session/Transaction code required.
@Repository
public interface CountryRepository extends JpaRepository<Country, String> {

}
