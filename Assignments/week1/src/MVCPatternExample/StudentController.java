package MVCPatternExample;

public class StudentController {
    private Student student;
    private  StudentView studentView;
    public StudentController(Student student){
        this.student=student;
        this.studentView=new StudentView();
    }
    public void setStudentName(String name){
        student.setName(name);
    }
    public void setStudentId(int id){
        student.setId(id);
    }
    public void setStudentGrade(char grade){
        student.setGrade(grade);
    }
    public void updatedView(){
        studentView.displayStudentDetails(student.getName(), student.getId(), student.getGrade());
    }

}
