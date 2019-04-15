package com.company;

public class ModelViewController {
    public static void main(String[] args)
    {
        //Creating an model class object
        GraduateStudent model  = new GraduateStudent();
        model.setName("Phani Teja");
        model.setID(38691);
        //Creating an view class object
        StudentView view = new StudentView();

        //Giving the model and view object to the controller
        StudentController controller = new StudentController(model, view);

        controller.printDetails();

        controller.setStudentName("Phani Teja kesha");

        controller.printDetails();
    }
}

//The class which is used for the model and has implementations
class GraduateStudent{
    int id;
    String name;
    public String getName(){
        return name;
    }
    public int getIdNumber(){
        return id;
    }
    public void setName(String sN){
        name = sN;
    }
    public void setID(int newID){
        id = newID;
    }
}

//The view class which is used to print the details
class StudentView{
    public void printDetails(String name,int id){
        System.out.println(name);
        System.out.println(id);
    }
}

//The controller class which is like a bridge between the view and model
class StudentController{
    private GraduateStudent model;
    private StudentView view;
    StudentController(GraduateStudent model1,StudentView view1){
        model = model1;
        view = view1;
    }
    public void setStudentName(String studentName){
        model.setName(studentName);
    }
    public void getStudentName(){
        System.out.println(model.getName());
    }
    public void setIdNumber(int idNum){
        model.setID(idNum);
    }
    public void getIdNumber(){
        System.out.println(model.getIdNumber());
    }
    public void printDetails(){
        view.printDetails(model.getName(),model.getIdNumber());
    }
}

