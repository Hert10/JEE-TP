package dao;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class StudentDAO implements StudentDAOInterface {
    List <Student> students;

    public StudentDAO(){
        students= new ArrayList<>();
    }

    public Student addStudent(Student student) {
        students.add(student);
        return student;
    }

    public List<Student> getAllStudents() {

        return students;
    }
    @Override
    public Student updateStudent(int id, String name, int age, String email) {
        for (Student student : students) {
            if (student.getId() == id) {
                student.setName(name);
                student.setAge(age);
                student.setEmail(email);
                return student;
            }
        }
        return null;
    }
}
