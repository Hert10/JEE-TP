package dao;

import java.util.List;

public interface StudentDAOInterface {
    Student addStudent(Student student);
    List<Student> getAllStudents();
    Student updateStudent(int id, String name, int age, String email);
}
