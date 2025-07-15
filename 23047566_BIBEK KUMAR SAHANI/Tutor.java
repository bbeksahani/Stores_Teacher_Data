public class Tutor extends Teacher {
    private double salary;
    private String specialization;
    private String academicQualifications;
    private int performanceIndex;
    private boolean isCertified;

    // Constructor
    public Tutor(int teacherId, String teacherName, String address, String workingType, String employmentStatus,
                 int workingHours, double salary, String specialization, String academicQualifications, int performanceIndex) {
        super(teacherId, teacherName, address, workingType, employmentStatus);
        super.setWorkingHours(workingHours); // Using the setter method from the superclass
        this.salary = salary;
        this.specialization = specialization;
        this.academicQualifications = academicQualifications;
        this.performanceIndex = performanceIndex;
        this.isCertified = false;
    }

    // Accessor methods
    public double getSalary() {
        return salary;
    }

    public String getSpecialization() {
        return specialization;
    }

    public String getAcademicQualifications() {
        return academicQualifications;
    }

    public int getPerformanceIndex() {
        return performanceIndex;
    }

    public boolean isCertified() {
        return isCertified;
    }

    // Method to set salary and performanceIndex
    public void setSalaryAndPerformanceIndex(double newSalary, int newPerformanceIndex) {
        if (!isCertified) {
            if (newPerformanceIndex > 5 && getWorkingHours() > 20) {
                double appraisalPercentage;
                if (newPerformanceIndex >= 5 && newPerformanceIndex <= 7) {
                    appraisalPercentage = 0.05;
                } else if (newPerformanceIndex >= 8 && newPerformanceIndex <= 9) {
                    appraisalPercentage = 0.10;
                } else {
                    appraisalPercentage = 0.20;
                }

                double appraisalAmount = newSalary * appraisalPercentage;
                this.salary = newSalary + appraisalAmount;
                this.isCertified = true;
                this.performanceIndex = newPerformanceIndex;
            } else {
                System.out.println("Salary cannot be approved. Tutor has not been certified yet or does not meet criteria.");
            }
        } else {
            System.out.println("Salary cannot be updated. Tutor has already been certified.");
        }
    }

    // Method to remove the tutor
    public void removeTutor() {
        this.salary = 0;
        this.specialization = "";
        this.academicQualifications = "";
        this.performanceIndex = 0;
        }
    

    // Method to display tutor details
    public void displayTutorInfo() {
        // Call the displayTeacherInfo method from the superclass
        super.displayTeacherInfo();
        if (isCertified) {
            System.out.println("Salary: " + salary);
            System.out.println("Specialization: " + specialization);
            System.out.println("Academic Qualifications: " + academicQualifications);
            System.out.println("Performance Index: " + performanceIndex);
        } else {
            System.out.println("Tutor has not been certified yet.");
        }
    }
}