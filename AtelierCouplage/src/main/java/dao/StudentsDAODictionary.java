package dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StudentsDAODictionary implements StudentDAOInterface {
    Map<Integer, Student> studentsMap;

   public StudentsDAODictionary(){
       studentsMap= new HashMap<>();
   }
 @Override
   public Student addStudent(Student student){
       studentsMap.put(student.getId(),student);
        return student;
    }

    @Override
    public List<Student> getAllStudents() {
        return new ArrayList<>(studentsMap.values());
    }

    @Override
    public Student updateStudent(int id, String name, int age, String email) {
       Student student=studentsMap.get(id);
       if(student!=null){
           student.setName(name);
           student.setAge(age);
           student.setEmail(email);
       }
       return null;
    }
}
