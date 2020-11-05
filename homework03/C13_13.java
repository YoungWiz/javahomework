package homework03;

public class C13_13 {
    public static void main(String[] args) throws CloneNotSupportedException {
        Course course = new Course("Math");
        course.addStudent("Lisa");
        course.addStudent("Katty");
        Course course2 = (Course) course.clone();
        System.out.println(course2.getCourseName());
        String[] students = course2.getStudents();
        System.out.println(students[0] + " " + students[1]);
    }

}