package metier;

import dao.Student;
import dao.StudentDAO;
import dao.StudentDAOInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class StudentManager implements MetierInterface{
   @Autowired
    @Qualifier("dao")

    StudentDAOInterface studentDAO ;

    public void setStudentDAO(StudentDAO studentDAO){
        this.studentDAO = studentDAO;
    }

    @Override
    public Student addstudent(Student student) {
        for (Student i : studentDAO.getAllStudents()){
            if(i.getEmail().equals(student.getEmail())){
                System.out.println("Email deja utiliser");
                return null;
            }
        }
        return studentDAO.addStudent(student);
    }

}
