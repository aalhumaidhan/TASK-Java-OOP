package University;

public class Course {

    private String courseName;
    private String instructor;
    private int numStudents;

    public Course(String courseName, String instructor, int numStudents) {
        this.courseName = courseName;
        this.instructor = instructor;
        this.numStudents = numStudents;
    }

    public String getCourseName() {
        return courseName;
    }

    public int getNumStudents() {
        return numStudents;
    }

    public String getInstructor() {
        return instructor;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public void setInstructor(String instructor) {
        this.instructor = instructor;
    }

    public void setNumStudents(int numStudents) {
        this.numStudents = numStudents;
    }

    @Override
    public String toString() {
        return "Course " +
                courseName +
                " is taught by instructor " + instructor +
                " and has " + numStudents +
                " students.";
    }
}
