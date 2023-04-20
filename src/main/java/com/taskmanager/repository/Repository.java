package com.taskmanager.repository;

import java.util.List;
import java.util.Optional;

public interface Repository<T> {

    List<T> findAll();
    T findById(Long id);
    T create(T t);
    T update(T t);
    void delete(T t);
}
