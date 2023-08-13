package Logics;

import Logics.Interface.IPaintDiagramm;
import Logics.Interface.ISendMail;
import Logics.Interface.Iservise;

public class RepoServise implements ISendMail, IPaintDiagramm {

    public void makeRepo(Iservise adapter){
        //
    }

    @Override
    public String sendEmail(String email) {
        String s = "Send";
        return s;
    }

    @Override
    public IPaintDiagramm paint() {
        return null;
    }
}
