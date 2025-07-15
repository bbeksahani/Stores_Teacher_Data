import java.util.*;

//tutor is subclass of teacher
public class Tutor extends Teacher
{
    //attributes of tutor class
    private double salary;
    private String specialization;
    private String academicQualification;   //camelcase
    private int performanceIndex;
    private boolean isCertified;
    
    //constructor method (Parameterized constructor)
    public Tutor(int teacherId, String teacherName, String address, String workingType, String employmentStatus, int workingHours, double salary, String specialization,
                String academicQualification, int performanceIndex) {
        super(teacherId, teacherName, address, workingType, employmentStatus);      
        this.salary = salary;
        this.specialization = specialization;
        this.academicQualification = academicQualification;
        this.performanceIndex = performanceIndex;
        this.isCertified = false;  //is set to be false as mentioned in question
    }
    
    //getter method
    public double getSalary() {
        return salary;
    }
    
    public String getSpecialized() {
        return specialization;
    }
    
    public String getAcademicQualification () {
        return academicQualification;
    }
    
    public int getPerformanceIndex () {
        return performanceIndex;
    }
    
    public boolean getIsCertified() {
        return isCertified;
    }
    
    //setter method
    public void setSalaryAndCertification(double newSalary, int newPerformanceIndex) {
        if (newPerformanceIndex > 5 && getWorkingHours() >20) {
            double appraisal = 0.00;
            if (newPerformanceIndex >= 5 && newPerformanceIndex <=7) {
                appraisal = 0.05;
            }
            else if
                (newPerformanceIndex >= 8 && newPerformanceIndex <=9) {
                    appraisal = 0.1;
                }
                else if 
                    (newPerformanceIndex == 10) {
                        appraisal = 0.2;
                    }
            this.salary = newSalary + (appraisal * newSalary);
            this.isCertified = true;
                }
                else {
                    System.out.println("Salary is not approved by tutor.");
                }
                }
                
    //removal method
    public void removeTutor () {
        if (!isCertified) {
            this.salary = 0;
            this.specialization = "";
            this.academicQualification = "";
            this.performanceIndex = 0;
            this.isCertified = false;
        }
                }
             
    //method to display            
    public void displayTutorInfo () {
        if (isCertified) {
            System.out.println("Tutor Details:");
            System.out.println("Salary: " + salary);
            System.out.println("Specialization: " + specialization);
            System.out.println("Academic Qualification:" + academicQualification);
            System.out.println("Performance Index:" + performanceIndex);
            super.displayTeacherInfo();
        }
        else {
            super.displayTeacherInfo();
        }
        }
        
    // Example Usage with user input:
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       // Getting user input for creating a object of tutor
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

        System.out.println("Enter Working Hours:");
        int workingHours = sc.nextInt();

        System.out.println("Enter Salary:");
        double salary = sc.nextDouble();

        sc.nextLine(); // use the newline character

        System.out.println("Enter Specialization:");
        String specialization = sc.nextLine();

        System.out.println("Enter Academic Qualifications:");
        String academicQualifications = sc.nextLine();

        System.out.println("Enter Performance Index:");
        int performanceIndex = sc.nextInt();

        // Creating a object of tutor
        Tutor tutor = new Tutor(teacherId, teacherName, address, workingType, employmentStatus,
                workingHours, salary, specialization, academicQualifications, performanceIndex);

        // Displaying information of tutor
        tutor.displayTutorInfo();

        // Updating salary and performanceIndex using Scanner (sc) for user input
        System.out.println("Enter New Salary:");
        double newSalary = sc.nextDouble();

        System.out.println("Enter New Performance Index:");
        int newPerformanceIndex = sc.nextInt();

        tutor.setSalaryAndCertification(newSalary, newPerformanceIndex);

        // Displaying tutor information after update
        tutor.displayTutorInfo();

        // Removing the tutor using Scanner(sc)
        System.out.println("Do you want to remove the tutor? (Enter 'yes' or 'no')");
        sc.nextLine(); // Consume the newline character
        String removeDecision = sc.nextLine().toLowerCase();

        if (removeDecision.equals("yes")) {
            tutor.removeTutor();
            System.out.println("Tutor has been removed.");
        } else {
            System.out.println("Tutor has not been removed.");
        }

        // Displaying tutor information after removal
        tutor.displayTutorInfo();

        // Closing the scanner(sc)
        sc.close();
    }  
    }