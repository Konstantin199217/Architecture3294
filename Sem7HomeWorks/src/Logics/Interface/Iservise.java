package Logics.Interface;

import DataBase.ReportRepo;

public interface Iservise {
    Iservise inputResponse(String response);
    Iservise answer(ReportRepo repo);
}
