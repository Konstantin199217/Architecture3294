package Controller;

import Model.Domen.Student;

import java.util.List;

public interface iGetView {
    public void printAllStudent(List<Student> students);
    public void setController(iGetController controller);
}
