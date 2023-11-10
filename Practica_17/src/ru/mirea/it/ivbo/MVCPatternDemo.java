package ru.mirea.it.ivbo;

public class MVCPatternDemo {
    public static void main(String[] args){
        Student model = retriveStudentFromDatabase();
        StudentView view = new StudentView();
        StudentController controller = new StudentController(model, view);
        controller.updateView();
        controller.setStudentName("Sasha");
        controller.setStudentRollNo("666");
        controller.updateView();
    }
    public static Student retriveStudentFromDatabase(){
        Student student = new Student();
        student.setName("Alex");
        student.setRollNo("1000");
        return student;
    }
}
