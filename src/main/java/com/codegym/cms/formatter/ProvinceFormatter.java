package com.codegym.cms.formatter;

import com.codegym.cms.model.Province;
import com.codegym.cms.service.IProvinceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.Formatter;
import org.springframework.stereotype.Component;

import java.text.ParseException;
import java.util.Locale;

@Component
public class ProvinceFormatter implements Formatter<Province> {

    private IProvinceService iProvinceService;

    @Autowired
    public ProvinceFormatter(IProvinceService iProvinceService) {
        this.iProvinceService = iProvinceService;
    }

    @Override
    public Province parse(String text, Locale locale) throws ParseException {
        return iProvinceService.findById(Long.parseLong(text));
    }

    @Override
    public String print(Province object, Locale locale) {
        return "[" + object.getId() + ", " +object.getName() + "]";
    }
}