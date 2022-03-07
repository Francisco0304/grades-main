package test;

import GUI.MainWindow;
import GUI.fff;
import GUI.pruevas;

import javax.swing.*;

public class Runner {
    public static void main(String[] args) {

       MainWindow mywindow = new MainWindow("Inscripcion de Estudiantes");
        mywindow.setVisible(true);

        pruevas pb = new pruevas();
        pb.setVisible(true);


        fff vv = new fff();
        vv.init();
        vv.setVisible(true);

    }
}
