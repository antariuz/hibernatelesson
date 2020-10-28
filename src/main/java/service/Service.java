package service;

import java.util.List;

public interface Service<X> {

    List<X> getAll();

    Long add(X x);

    X getByID(Long id);

    void update(X x);

    void deleteByID(Long id);

}
