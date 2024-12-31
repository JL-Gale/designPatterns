package src.main;

import src.facade.CheckFacade;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        CheckFacade usario1 = new CheckFacade();
        usario1.buscar("31/12/2024","19/1/2024","Bogota","Santa Marta");

        CheckFacade usario2 = new CheckFacade();
        usario2.buscar("31/12/2024","19/1/2024","Bogota","Cartagena");
    }
}