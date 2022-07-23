package com.man.spring.service;

import com.man.spring.model.Registry;
import com.man.spring.repository.RegistryRepository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class RegistryService {
    private RegistryRepository repo;
    public void save(Registry registry){
        repo.save(registry);
    }

}
