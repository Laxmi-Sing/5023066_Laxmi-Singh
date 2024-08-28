package MVCPatternExample;

public class Student {
    private String name;
    private int id;
    private char grade;

    public Student(String name, int id, char grade) {
        this.name = name;
        this.id = id;
        this.grade = grade;
    }
    protected String getName(){
        return this.name;
    }
    protected int getId(){
        return this.id;
    }
    protected char getGrade(){
        return this.grade;
    }
    protected void setName(String name){
        this.name=name;
    }
    protected void setId(int id){
        this.id=id;
    }
    protected void setGrade(char grade){
        this.grade=grade;
    }

}
