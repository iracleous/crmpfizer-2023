package gr.codehub.crmpfizer2023.repository;

import java.util.List;

public interface CrmRepository<T,K> {
    //CRUD

    T create(T t);
    List<T> readAll();
    T readByKey(K k);

    T update(T t, K key);

    boolean delete(K key);

}
