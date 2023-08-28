import Data.FullTimeTeacher;
import Data.PartTimeTeacher;
import Data.Student;
import Data.ClassCollege;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        //Init
        System.out.println("Bienvenido a la universidad numero UNO");
        Scanner scan = new Scanner(System.in);
        boolean finishTransaction = false;

        while(!finishTransaction){
            System.out.println("Seleccione una opción");
            System.out.println("1. Listado de los profesores con sus datos");
            System.out.println("2. Salir");

            int option = 0;
            option = scan.nextInt();
            scan = new Scanner(System.in);

            switch(option){
                case 1:
                    //bla bla bla
                    break;

                case 2:
                    finishTransaction = true;

                default:
                    System.out.println("Opción no disponible. Favor volver a intentar");
                    finishTransaction = false;
            }
        }
    }
}