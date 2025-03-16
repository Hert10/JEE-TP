package metier;

import dao.Student;
import dao.StudentDAO;
import dao.StudentDAOInterface;

import java.util.List;

public class StudentManager {
    StudentDAOInterface studentDAO ;

    public StudentManager(StudentDAOInterface dao) {
        this.studentDAO = dao;
    }

    public Student addStudent(Student student){
        for (Student i : studentDAO.getAllStudents()){
            if(i.getEmail().equals(student.getEmail())){
                System.out.println("Email deja utiliser");
                return null;
            }
        }
        return studentDAO.addStudent(student);
    }
    public List<Student> getAllStudent(){
        return studentDAO.getAllStudents();
    }
    public Student updateStudent(int id, String name, int age, String email) {
        return studentDAO.updateStudent(id, name, age, email);
    }
}
