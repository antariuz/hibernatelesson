package dao;

import java.util.List;

public interface DAO<X> {

    List<X> getAll();

    Long add(X x);

    X getByID(Long id);

    void update(X x);

    void deleteByID(Long id);

}
