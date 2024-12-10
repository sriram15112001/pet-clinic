package com.deepak.pet_clinic.service.map;

import com.deepak.pet_clinic.model.Vet;
import com.deepak.pet_clinic.service.VetService;

import java.util.List;

public class VetServiceMap extends AbstractMapService<Vet, Long> implements VetService {
    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Vet save(Vet vet) {
        return super.save(vet);
    }

    @Override
    public List<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public int size() {
        return super.size();
    }
}
