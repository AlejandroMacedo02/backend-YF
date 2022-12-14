/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.yanaforun.service.impl;

import com.example.yanaforun.entity.Materiales;
import com.example.yanaforun.repository.MaterialesRepository;
import com.example.yanaforun.service.MaterialesService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author crnv_
 */
@Service
public class MaterialesServiceImpl implements MaterialesService {
    @Autowired
    private MaterialesRepository materialesRepository;

    @Override
    public List<Materiales> findAll() {
        return (List<Materiales>) materialesRepository.findAll();
    }

    @Override
    public Materiales findById(Long id) {
        return materialesRepository.findById(id).orElse(null);
    }

    @Override
    public Materiales save(Materiales materiales) {
        return materialesRepository.save(materiales);
    }

    @Override
    public void delete(Materiales materiales) {
        materialesRepository.delete(materiales);
    }

    @Override
    public void deleteById(Long id) {
        materialesRepository.deleteById(id);
    }
}