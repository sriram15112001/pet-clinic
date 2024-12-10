package com.deepak.pet_clinic.service;

import java.util.List;

public interface CrudService <T, ID>{

    T findById(ID id);

    List<T> findAll();

    T save(T t);

}
