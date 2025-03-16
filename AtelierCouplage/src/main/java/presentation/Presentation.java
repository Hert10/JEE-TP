package presentation;

import dao.Student;
import dao.StudentsDAODictionary;
import dao.StudentDAO;
import metier.StudentManager;

public class Presentation {
    public static void main(String[] args) {
        Student s1 = new Student(1, "Salah", 25, "Salah@gmail.com");
        Student s2 = new Student(2, "Mehdi", 25, "Mehdi@gmail.com");
        Student s3 = new Student(3, "Taha", 25, "Taha@gmail.com");
        Student s4 = new Student(4, "Hamid", 25, "Salah@gmail.com");

        StudentManager manager = new StudentManager(new StudentsDAODictionary());

        manager.addStudent(s1);
        manager.addStudent(s2);
        manager.addStudent(s3);
        manager.addStudent(s4);

        for (Student s : manager.getAllStudent()){
            System.out.println(s.getName() + " "+ s.getAge() + " "+ s.getEmail());
        }

        System.out.println("*************");

        manager.updateStudent(3, "Hakim", 23, "Hakim@example.com");
        for (Student s : manager.getAllStudent()){
            System.out.println(s.getName() + " "+ s.getAge() + " "+ s.getEmail());
        }
    }
}