package View;

import Controller.Controller;
import Model.Domen.Student;
import Controller.iGetView;
import Controller.iGetController;

import java.util.List;

public class View implements iGetView {
    iGetController cont;

    public void setController(iGetController cont){
        this.cont = cont;
    }
    public void printAllStudent(List<Student> students){
        for (Student s:students){
            System.out.println(s);
        }
    }
}
