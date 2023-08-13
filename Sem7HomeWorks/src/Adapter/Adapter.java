package Adapter;

import DataBase.ReportRepo;
import Logics.Interface.Iservise;

public class Adapter implements Iservise {

    @Override
    public Iservise inputResponse(String response) {
        return null;
    }

    @Override
    public Iservise answer(ReportRepo repo) {
        return null;
    }
}
