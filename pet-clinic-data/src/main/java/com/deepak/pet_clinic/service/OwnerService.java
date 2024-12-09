package com.deepak.pet_clinic.service;

import com.deepak.pet_clinic.model.Owner;

import java.util.List;

public interface OwnerService {
    Owner findById(long id);

    List<Owner> findAll();

    Owner save(Owner owner);
}
