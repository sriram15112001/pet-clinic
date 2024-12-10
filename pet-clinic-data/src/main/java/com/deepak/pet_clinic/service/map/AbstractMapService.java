package com.deepak.pet_clinic.service.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class AbstractMapService<T, ID> {

    protected Map<ID, T> hashMap = new HashMap<>();

    List<T> findAll(){
        return new ArrayList<>(hashMap.values());
    }

    T findById(ID id){
        return hashMap.get(id);
    }

    T save(ID id, T object){
        hashMap.put(id, object);
        return object;
    }

}
