package com.deepak.pet_clinic.config;

import com.deepak.pet_clinic.service.OwnerService;
import com.deepak.pet_clinic.service.PetService;
import com.deepak.pet_clinic.service.VetService;
import com.deepak.pet_clinic.service.map.OwnerServiceMap;
import com.deepak.pet_clinic.service.map.PetServiceMap;
import com.deepak.pet_clinic.service.map.VetServiceMap;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PetClinicConfiguration {

    @Bean
    public OwnerService ownerService(){
        return new OwnerServiceMap();
    }

    @Bean
    public PetService petService(){
        return new PetServiceMap();
    }

    @Bean
    public VetService vetService(){
        return new VetServiceMap();
    }
}
