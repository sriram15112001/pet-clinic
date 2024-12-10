package com.deepak.pet_clinic.service.map;

import com.deepak.pet_clinic.model.Pet;
import com.deepak.pet_clinic.service.PetService;

import java.util.List;

public class PetServiceMap extends AbstractMapService<Pet, Long> implements PetService {
    @Override
    public Pet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Pet save(Pet pet) {
        return super.save(pet);
    }

    @Override
    public List<Pet> findAll() {
        return super.findAll();
    }

    @Override
    public int size() {
        return super.size();
    }
}
