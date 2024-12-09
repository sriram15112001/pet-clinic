package com.deepak.pet_clinic.service;

import com.deepak.pet_clinic.model.Pet;

import java.util.List;

public interface PetService {
    Pet findById(long id);

    List<Pet> findAll();

    Pet save(Pet pet);

}
