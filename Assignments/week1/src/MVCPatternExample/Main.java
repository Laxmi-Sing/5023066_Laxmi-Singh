package MVCPatternExample;

public class Main {
    public static void main(String[] args) {
        Student student=new Student("Aryan Singh",1076,'A');
        StudentController studentController=new StudentController(student);
        studentController.updatedView();
        studentController.setStudentId(100);
        studentController.updatedView();
    }
}
