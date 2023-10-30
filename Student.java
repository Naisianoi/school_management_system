package shool.management.system;

/**
 * Student class - id, name, grade, fees paid, fees total fields
 * /

public class Student {

    private int id;
    private String name;
    private int grade;
    private int feesPaid;
    private int feesTotal;
    
    /**
     * Constructor
     * /
     
     public Student(int id, String name, int grade) {
         
         this.feesPaid=0;
         this.feesTotal=30000;
         this.id=id;
         this.name=name;
         this.grade=grade;
     }
     
    /**
     * Update the students' grade.
     * /
      
     public void setGrade(int grade) {
         this.grade=grade;
     }
      
    /**
     * Update the fees paid.
     * Update totalMoneyEarned by the school.
     * /
       
     public void payFees(int fees) {
         feesPaid+=fees;
         School.updateTotalMoneyEarned(feesPaid);
     }
     
    /**
     * Return id, name, grade, feesPaid, feesTotal and remainingFees
     * /
     
     public int getId() {
         return id;
     }
     
     public String getName() {
         return name;
     }
     
     public int getGrade() {
         return grade;
     }
     
     public int getFeesPaid() {
         return feesPaid;
     }
     
     public int getFeesTotal() {
         return feesTotal;
     }
     
     public int getRemainingFees() {
         return feesTotal-feesPaid;
     }
     
     @Override
     public String toString() {
         return "Student's name: "+name+ "Total fees paid so far $"+feesPaid;
     }
}