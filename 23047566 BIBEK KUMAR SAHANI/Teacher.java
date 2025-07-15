import java.util.*;

public class Teacher
{
    private int teacherId; 
    private String teacherName;  //camelcase
    private String address;
    private String workingType; 
    private String employmentStatus; 
    private int workingHours; 
    
    //constructor method (Parameterized constructor)
    Teacher(int teacherId,String teacherName, String address, String workingType, String employmentStatus)
    {
    //this.string = string;   (for reference)
    this.teacherId = teacherId;
    this.teacherName = teacherName;
    this.address = address;
    this.workingType = workingType;
    this.employmentStatus = employmentStatus;
    this.workingHours = 0;   //indicating not assigned
    }
    
    //accessor method (getter method)
    public int getTeacherId() {
        return teacherId;
    }
    
    public String getAddress() {
        return address;
    }
    
    public String getWorkingType() {
        return workingType;
    }
    
    public String getEmploymentStatus() {
        return employmentStatus;
    }
    
    public int getWorkingHours() {
        return workingHours;
    }
    
    //method to set working hours (setter method)
    public void setWorkingHours (int newWorkingHours) {
        this.workingHours = newWorkingHours;
    }
    
    //method to display teacher information
    public void displayTeacherInfo()
    {
        System.out.println("Teacher ID: "+ this.teacherId);
        System.out.println("Teacher Name: " + this.teacherName);
        System.out.println("Address: "+ this.address);
        System.out.println("Working Type: " + this.workingType);
        System.out.println("Employment Status: " + this.employmentStatus);
        
        if (workingHours != 0) {
            System.out.println("Working Hours: " + workingHours);
        } else {
            System.out.println("Working Hours: Not assigned");
        }
    }
    
    public static void main(String[] args) {
        // Creating a Teacher object using Scanner(sc)
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Teacher ID:");
        int teacherId = sc.nextInt();
        sc.nextLine(); // use newline character

        System.out.println("Enter Teacher Name:");
        String teacherName = sc.nextLine();

        System.out.println("Enter Address:");
        String address = sc.nextLine();

        System.out.println("Enter Working Type:");
        String workingType = sc.nextLine();

        System.out.println("Enter Employment Status:");
        String employmentStatus = sc.nextLine();

        // Creating a object of teacher
        Teacher teacher = new Teacher(teacherId, teacherName, address, workingType, employmentStatus);

        // Displaying the informations of teacher
        teacher.displayTeacherInfo();

        // Setting working hours using Scanner(sc)
        System.out.println("Enter Working Hours:");
        int newWorkingHours = sc.nextInt();

        // Setting working hours for the teacher
        teacher.setWorkingHours(newWorkingHours);

        // Displaying the information of teacher after setting workinghours
        teacher.displayTeacherInfo();

        // Closing the scanner(sc)
        sc.close();
    }
}

