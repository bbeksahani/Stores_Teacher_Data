import java.util.*;

//Lecturer is subclass of Teacher
class Lecturer extends Teacher
{
    //attributes of lecturer class
    private String department;
    private int yearsOfExperience;   //camelcase
    private int gradedScore;
    private boolean hasGraded;
    
    //constructor method (parameterized constructor)
    Lecturer(int teacherId, String teacherName, String address, String workingType, String employmentStatus, String department, int yearsOfExperience, int gradedScore)
    {
        //constructor of super class 
        super(teacherId, teacherName, address, workingType, employmentStatus);
        super.setWorkingHours(0);  //Initialize working hours to 0(not assigned)
        this.department = department;
        this.yearsOfExperience = yearsOfExperience;
        this.gradedScore = gradedScore;
        this.hasGraded = false;   //initially, assignments have not been graded yet
    }
    
    //getter method
    public String getDepartment() {
        return department;
    }
    
     public int getYearsOfExperience() {
        return yearsOfExperience;
    }
    
     public int getGradedScore() {
        return gradedScore;
    }
    
     public boolean hasGraded() {
        return hasGraded;
    }
    
    //setter method
    public void setGradedScore(int gradedScore) {
        this.gradedScore = gradedScore;
    }
    
    //Additional method for grading assignments
    public void gradeAssignment(int gradedScore, String studentDepartment, int studentYearsOfExperience)
    {
        if (!hasGraded && yearsOfExperience >= 5 && department.equals(studentDepartment))
        {
            if (gradedScore >= 70) {
                this.gradedScore = gradedScore;
                System.out.println("Grade: A");
            }
            else if (gradedScore >= 60) {
                this.gradedScore = gradedScore;
                System.out.println("Grade: B");
            }
            else if (gradedScore >= 50) {
                this.gradedScore = gradedScore;
                System.out.println("Grade: C");
            }
            else if (gradedScore >= 40) {
                this.gradedScore = gradedScore;
                System.out.println("Grade: D");
            }
            else {
                System.out.println("Grade: E");
            }
            //set graded to true
            this.hasGraded = true;
        } 
        else {
            System.out.println("Not Graded(NG)");
        }
    }
    
    //method to display
    public void displayLecturerInfo()
    {
        super.displayTeacherInfo();  //display method of the superclass call
        
        System.out.println("Lecturer:");
        System.out.println("Department: " + department);
        System.out.println("Years of Experience: " + yearsOfExperience);
        
        if (hasGraded) {
            System.out.println("Graded Score: " + gradedScore);
        }
        else {
            System.out.println("Not Graded(NG)");
        }
    }
    
    //example usage with user input
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Getting user input for creating a object of lecturer
        System.out.println("Enter Teacher ID:");
        int teacherId = sc.nextInt();
        sc.nextLine(); // use the newline character

        System.out.println("Enter Teacher Name:");
        String teacherName = sc.nextLine();

        System.out.println("Enter Address:");
        String address = sc.nextLine();

        System.out.println("Enter Working Type:");
        String workingType = sc.nextLine();

        System.out.println("Enter Employment Status:");
        String employmentStatus = sc.nextLine();

        System.out.println("Enter Department:");
        String department = sc.nextLine();

        System.out.println("Enter Years of Experience:");
        int yearsOfExperience = sc.nextInt();
        
        // Creating object in lecturer
        Lecturer lecturer = new Lecturer(teacherId, teacherName, address, workingType, employmentStatus, department, yearsOfExperience, 0);

        // Displaying information of lecturer
        lecturer.displayLecturerInfo();
    
        // Closing the scanner (sc)
        sc.close();
    }
}