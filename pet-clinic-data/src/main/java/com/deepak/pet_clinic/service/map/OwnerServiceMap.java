package com.deepak.pet_clinic.service.map;

import com.deepak.pet_clinic.model.Owner;
import com.deepak.pet_clinic.service.OwnerService;

import java.util.List;

public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements OwnerService {
    @Override
    public Owner findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Owner save(Owner owner) {
        return super.save(owner);
    }

    @Override
    public List<Owner> findAll() {
        return super.findAll();
    }

    @Override
    public int size() {
        return super.size();
    }

}
