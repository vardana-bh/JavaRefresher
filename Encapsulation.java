/**
 * Encapsulation
 */

class Student {
    private String rollNumber;
    private boolean studying;
    private boolean isResident;

    // Default constructor
    Student() {
        System.out.println("Creating a student!!");
    }

    Student(String rollNumber, boolean isResident) {
        this.rollNumber = rollNumber;
        this.isResident = isResident;
    }

    public void setStudying(boolean studying) {
        this.studying = studying;
    }

    public boolean getStudying() {
        return studying;
    }

    public String getRollNumber() {
        return rollNumber;
    }

    public boolean getIsResident() {
        return isResident;
    }

    public void setIsResident(boolean isResident) {
        this.isResident = isResident;
    }

    public void setRollNumber(String rollNumber) {
        this.rollNumber = rollNumber;
    }

    public void printStudentDetails() {
        System.out.println(rollNumber + " : is Resident : " + isResident + " : is studying : " + studying);
    }

}

public class Encapsulation {

    public static void main(String[] args) {
        // 1st Student 
        Student student = new Student("1NX10CS555", true);
        student.setStudying(true);
        
        // 2nd Student
        Student student2 = new Student("1NX10CS556", false);

        student.printStudentDetails();
        student2.printStudentDetails();
    }
}