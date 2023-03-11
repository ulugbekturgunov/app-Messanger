package org.example.service;

/*
    T - requestDto
    R - responseDto
    I - UUID
    E - model
*/

import java.util.List;

public interface BaseService<T, I, R, E> {
    boolean create(T t);
    R get(I id);
    List<R> getList();
    boolean delete(I id);
    boolean update (I id, T t);
    List<E> getData();
    boolean writeData(List<E> data);
    E getEntity (I id);
}
