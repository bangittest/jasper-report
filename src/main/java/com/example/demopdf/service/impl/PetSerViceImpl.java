package com.example.demopdf.service.impl;

import com.example.demopdf.entity.Pet;
import com.example.demopdf.repository.PetRepository;
import com.example.demopdf.service.PetService;
import net.sf.jasperreports.engine.JRException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.FileNotFoundException;
import java.util.List;

@Service
public class PetSerViceImpl implements PetService {
    @Autowired
    private PetRepository repository;
    @Override
    public List<Pet> findAll() {
        return repository.findAll();
    }

    @Override
    public Pet findById(Long id) {
        return null;
    }

    @Override
    public Pet save(Pet pet) {
        return null;
    }

    @Override
    public void deleteById(Long id) {

    }

    @Override
    public byte[] exportPdf() throws JRException, FileNotFoundException {
        return new byte[0];
    }

    @Override
    public byte[] exportXls() throws JRException, FileNotFoundException {
        return new byte[0];
    }
}
