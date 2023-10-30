package school.management.system;

import java.util.ArrayList;
import java.util.List;

/**
 * Main class - to test and run 
 * /

public class Main {
    public static void main(String[] args) {
        Teacher lizzy = new Teacher(id:1,name:"Lizzy",salary:500);
        Teacher melissa = new Teacher(id:2,name:"Melissa",salary:700);
        Teacher vanderhorn = new Teacher(id:3,name:"Vanderhorn",salary:600);
        
        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(lizzy);
        teacherList.add(melissa);
        teacherList.add(vanderhorn);
        
        Student tamasha = new Student(id:1,name:"Tamasha",grade:4);
        Student rakshith = new Student(id:2,name:"Rakshith",grade:12);
        Student rabbi = new Student(id:3,name:"Rabbi",grade:5);
        
        List<Student> studentList = new ArrayList<>();
        studentList.add(tamasha);
        studentList.add(rakshith);
        studentList.add(rabbi);
        
        School ghs = new School(teacherList,studentList);
        
        /**
         * To add a new teacher or student.
         * /
        
        Teacher megan = new Teacher(id:4,name:"Megan",salary:900);
        ghs.addTeacher(megan);
        
        tamasha.payFees(fees:5000);
        System.out.println("GHS has earned $"+ghs.getTotalMoneyEarned());
        
        lizzy.receiveSalary(lizzy.getSalary());
        System.out.println("GHS has spent for salary to " + lizzy.getName() +" and now has $" + ghs.getTotalMoneyEarned());
        
        /**
         * @Override
         * /
        
        System.out.println(rakshith);
    }
}