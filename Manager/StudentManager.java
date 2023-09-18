package Manager;

import Model.Student;

import java.util.ArrayList;

public class StudentManager implements IManager<Student>{
    ArrayList<Student> list ;
    public StudentManager(){
        this.list = new ArrayList<>();
    }
    @Override
    public void add(Student student) {
        this.list.add(student);
    }

    @Override
    public void delete(int id) {
        int index = findIndexByid(id);
        this.list.remove(index);
    }

    @Override
    public int findIndexByid(int id) {
        for (Student student:list) {
            if (student.getId()==id){
                return id;
            }
        }
        return -1;
    }

    @Override
    public void update(int id, Student student) {
            int index = findIndexByid(id);
            list.set(index,student);
    }

    @Override
    public ArrayList<Student> findAll() {
        return this.list;
    }
}
