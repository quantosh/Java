
import java.util.Scanner;

public class Menu {

    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);

        // 
        int menu;
        do {
            System.out.println("Bienvenido a Improve, selecciona una opción");
            System.out.println("1- Crear un nuevo hábito");
            System.out.println("2- Calendario // Agenda");
            System.out.println("3- Eventos de hoy");
            System.out.println("4- Salir");
            menu = lectura.nextInt();
            
            switch (menu) {

                case 1:
                    // Opción 1
                    System.out.println("¿Qué hábito deseas crear?");
                    break;
                case 2:
                    // Opción 2
                    System.out.println("Calendario - Agenda");
                    break;
                case 3:
                    // Opción 3
                    System.out.println("Tu día");
                        // Esta opción muestra los eventos del día y te pregunta al final del dia que tal ha sido tu día y que escribas el por que
                        // Condición si hay eventos muestra eventos else no tienes eventos en el día de hoy
                        int tudia;
                        tudia = lectura.nextInt();
                        switch(tudia){
                            case 1:
                                System.out.println("😔🙁😕😊😄");
                            break;
                        }
                        
                    break;
                case 4:
                    // Opción 4
                    System.out.println("Hasta otra");
                    break;

            }
        } while (menu != 4);
    }
}
