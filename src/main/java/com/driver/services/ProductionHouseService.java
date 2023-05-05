package com.driver.services;


import com.driver.EntryDto.ProductionHouseEntryDto;
import com.driver.model.ProductionHouse;
import com.driver.repository.ProductionHouseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductionHouseService {

    @Autowired
    ProductionHouseRepository productionHouseRepository;

    public Integer addProductionHouseToDb(ProductionHouseEntryDto productionHouseEntryDto){

        // Creating ProductionHouse Object & Setting it's all attribute
        ProductionHouse productionHouse=new ProductionHouse(productionHouseEntryDto.getName());

        // Saving it in DB
        productionHouseRepository.save(productionHouse);

        return  productionHouse.getId();
    }



}
