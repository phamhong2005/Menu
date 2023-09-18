package Manager;

import java.util.ArrayList;

public interface IManager <E>{
    void add(E e);
    void delete(int id);
    int findIndexByid(int id);
    void update(int id , E e);
    ArrayList<E> findAll();
}
