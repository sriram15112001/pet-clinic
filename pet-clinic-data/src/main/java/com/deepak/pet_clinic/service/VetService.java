package com.deepak.pet_clinic.service;

import com.deepak.pet_clinic.model.Vet;

import java.util.List;

public interface VetService {
    Vet findById(long id);

    List<Vet> findAll();

    Vet save(Vet vet);
}
