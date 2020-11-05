package homework03;

public class C13_13 {
    public static void main(String[] args) throws CloneNotSupportedException {
        Course course = new Course("Math");
        Course course2 = (Course) course.clone();
        System.out.println(course2.getCourseName());
    }

}