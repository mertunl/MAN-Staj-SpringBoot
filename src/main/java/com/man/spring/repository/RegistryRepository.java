package com.man.spring.repository;

import com.man.spring.model.Registry;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RegistryRepository extends JpaRepository <Registry,Long> {

}
