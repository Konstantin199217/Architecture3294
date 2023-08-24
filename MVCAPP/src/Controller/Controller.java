package Controller;

import Model.Domen.Student;
import Model.Model;
import View.View;

import java.util.List;

public class Controller implements iGetController{
    private iGetModel model;
    private iGetView view;

    private List<Student> students;


    public Controller(iGetModel model, iGetView view) {
        this.model = model;
        this.view = view;
    }

    private boolean testData(List<Student> studs) {
        if (studs.size() > 0) {
            return true;
        } else {
            return false;
        }
    }

    public void update() {
        //MVP
        students = model.getAllStudents();

        if (testData(students)) {
            view.printAllStudent(students);
        } else {
            System.out.println("Lost");
        }

        //MVC
        view.printAllStudent(model.getAllStudents());
    }
}
