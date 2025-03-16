package presentation;

import dao.Student;
import metier.MetierInterface;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PresSpringAnnotation {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext("metier" , "dao");
        MetierInterface metier = (MetierInterface) applicationContext.getBean(MetierInterface.class);

        Student s1 = new Student(1, "Salah", 25, "Salah@gmail.com");
        Student s2 = new Student(2, "Mehdi", 25, "Mehdi@gmail.com");
        Student s3 = new Student(3, "Taha", 25, "Taha@gmail.com");
        Student s4 = new Student(4, "Hamid", 25, "Salah@gmail.com");

        metier.addstudent(s1);
        metier.addstudent(s2);
        metier.addstudent(s3);
        metier.addstudent(s4);


    }
}
