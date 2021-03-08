
import java.util.Calendar;
import java.util.Scanner;

public class GymTonificate {

    public static void main(String[] args) {
        // Scanner lectura = new Scanner(System.in);
        Calendar mifecha = Calendar.getInstance();
        mifecha.set(1990, 11, 11);

        System.out.println(Persona.getEdad(mifecha));
    }
}
