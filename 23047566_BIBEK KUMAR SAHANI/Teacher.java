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
}

