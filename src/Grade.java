public class Grade {
    private String course;
    private String grade;

    public Grade(String course, String grade){
        this.course = course;
        this.grade = grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getGrade(){
        return this.grade;
    }

    public String toString(){
        return "Course:" + course + ", Grade: " + grade;
    }
}
