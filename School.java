package school.management.system;

import java.util.ArrayList;
import java.util.List;

/**
 * ArrayList to input infinite numbers of teachers and students
 * /
 
public class School {
    private List<Teacher> teachers;
    private List<Student> students;
    private static int totalMoneyEarned;
    private static int totalMoneySpent;
    
    public School(List<Teacher> teachers, List<Student> students) {
        this.teachers = teachers;
        this.students = students;
        totalMoneyEarned=0;
        totalMoneySpent=0;
    }
    
    /**
     * Getters and Setters
     * /
    
    public List<Teacher> getTeachers() {
        return teachers;
    }
    
    /**
     * Adds an element (teacher) to the ArrayList (teachers)
     * /
     
    public void addTeacher(Teacher teacher) {
        teachers.add(teacher);
    }
    
    public List<Student> getStudents() {
        return students;
    }
    
    public void addStudent(Student student) {
        students.add(student);
    }
    
    
    public int getTotalMoneyEarned() {
        return totalMoneyEarned;
    }
    
    /**
     * Adds/Updates the totalMoneyEarned
     * /
    
    public static void updateTotalMoneyEarned(int moneyEarned) {
        totalMoneyEarned += moneyEarned;
    }
    
    public int getTotalMoneySpent() {
        return totalMoneySpent;
    }
    
    public static void updateTotalMoneySpent(int moneySpent) {
        totalMoneyEarned -= moneySpent;
    }
}