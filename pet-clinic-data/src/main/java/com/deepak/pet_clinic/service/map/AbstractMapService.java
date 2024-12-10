package com.deepak.pet_clinic.service.map;

import com.deepak.pet_clinic.model.BaseEntity;

import java.util.*;

public abstract class AbstractMapService<T extends BaseEntity, ID extends Long> {

    protected Map<Long, T> hashMap = new HashMap<>();

    List<T> findAll(){
        return new ArrayList<>(hashMap.values());
    }

    T findById(ID id){
        return hashMap.get(id);
    }

    T save(T object){
        if(object != null){
            if(object.getId() == null){
                object.setId(generateId());
            }
            hashMap.put(object.getId(), object);
        }
        return object;
    }

    Long generateId(){
        Long id = null;
        try {
            id = Collections.max(hashMap.keySet()) + 1;
        } catch (NoSuchElementException e){
            id = 1L;
        }
        return id;
    }

    int size(){
        return hashMap.size();
    }

}
