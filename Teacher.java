package school.management.system;

/**
 * Teacher class = id, name, salary fields
 * /

public class Teacher {
    
    private int id;
    private String name;
    private int salary;
    private int salaryEarned;
    
    /**
     * Constructor
     * /
     
     public Teacher(int id, String name, int salary) {
         this.id=id;
         this.name=name;
         this.salary=salary;
         this.salaryEarned=0;
     }
     
     public int getId() {
         return id;
     }
     
     public String getName() {
         return name;
     }
     
     public int getSalary() {
         return salary;
     }
     
    /**
     * Set or Update the salary.
     * /
     
     public void setSalary(int salary) {
         this.salary=salary;
     }
     
    /**
     * Adds to salaryEarned.
     * Removes from the totalMoneyEarned by the school.
     * /
     
     public void receiveSalary(int salary) {
         salaryEarned+=salary;
         School.updateTotalMoneySpent(salary);
     }
}