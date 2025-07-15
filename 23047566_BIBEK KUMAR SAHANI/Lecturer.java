//Lecturer is subclass of Teacher
class Lecturer extends Teacher
{
    //attributes of lecturer class
    private String department;
    private int yearsOfExperience;   //camelcase
    private int gradedScore;
    private boolean hasGraded;
    private int workingHour;
    
    //constructor method (parameterized constructor)
    Lecturer(int teacherId, String teacherName, String address, String workingType, String employmentStatus, String department, int yearsOfExperience, int workingHours)
    {
        //constructor of super class 
        super(teacherId, teacherName, address, workingType, employmentStatus);
        super.setWorkingHours(workingHours);  
        this.department = department;
        this.yearsOfExperience = yearsOfExperience;
        this.hasGraded = false;   //initially, assignments have not been graded yet
    }
    
    //getter method
    public String getDepartment() {
        return department;
    }
    
     public int getYearsOfExperience() {
        return yearsOfExperience;
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
        System.out.println("Department: " + department);
        System.out.println("Years of Experience: " + yearsOfExperience);
        
        if (hasGraded) {
            System.out.println("Graded Score: " + gradedScore);
        }
        else {
            System.out.println("Not Graded(NG)");
        }
    }
}