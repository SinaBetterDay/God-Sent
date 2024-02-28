/*Given main(), define a Course base class with methods to set and get private fields of the following types:

String to store the course number
String to store the course title
Define Course's PrintInfo() method that outputs the course number and title.

Then, define a derived class OfferedCourse with methods to set and get private fields of the following types:

String to store the instructor's name
String to store the location
String to store the class time
Ex. If the input is:

ECE287
Digital Systems Design
ECE387
Embedded Systems Design
Mark Patterson
Wilson Hall 231
WF: 2-3:30 pm
the output is:

Course Information:
   Course Number: ECE287
   Course Title: Digital Systems Design
Course Information:
   Course Number: ECE387
   Course Title: Embedded Systems Design
   Instructor Name: Mark Patterson
   Location: Wilson Hall 231
   Class Time: WF: 2-3:30 pm*/


/////////////////////////////////////////////// Course.java
import java.util.Scanner;

public class Course {
    private String courseNumber;
    private String courseTitle;

    public void setCourseNumber(String number) {
        courseNumber = number;
    }

    public String getCourseNumber() {
        return courseNumber;
    }

    public void setCourseTitle(String title) {
        courseTitle = title;
    }

    public String getCourseTitle() {
        return courseTitle;
    }

    public void printInfo() {
        System.out.println("Course Information:");
        System.out.println("   Course Number: " + getCourseNumber());
        System.out.println("   Course Title: " + getCourseTitle());
    }
}


////////////////////////////////////////////////// OfferedCourse.java
import java.util.Scanner;

public class OfferedCourse extends Course {
    private String instructorName;
    private String location;
    private String classTime;

    public void setInstructorName(String instructor) {
        instructorName = instructor;
    }

    public String getInstructorName() {
        return instructorName;
    }

    public void setLocation(String loc) {
        location = loc;
    }

    public String getLocation() {
        return location;
    }

    public void setClassTime(String time) {
        classTime = time;
    }

    public String getClassTime() {
        return classTime;
    }
}
