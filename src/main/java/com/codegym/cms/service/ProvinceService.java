package com.codegym.cms.service;

import com.codegym.cms.model.Province;
import com.codegym.cms.repositories.ProvinceRepository;
import org.springframework.beans.factory.annotation.Autowired;


public class ProvinceService implements IProvinceService {

    @Autowired
    ProvinceRepository provinceRepository;
    @Override
    public Iterable<Province> findAll() {
        return provinceRepository.findAll();
    }

    @Override
    public Province findById(Long id) {
        return provinceRepository.findOne(id);
    }

    @Override
    public void save(Province province) {
        provinceRepository.save(province);
    }

    @Override
    public void remove(Long id) {
        provinceRepository.delete(id);
    }
}