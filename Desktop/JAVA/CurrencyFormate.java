import java.util.*;
import java.text.*;
public class CurrencyFormatter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();
        Locale.setDefault(new Locale("en", "IN"));
        String india = NumberFormat.getCurrencyInstance().format(payment);

        Locale uslocale = new Locale.Builder().setLanguage("en").setRegion("US").build();
        NumberFormat usformat = NumberFormat.getCurrencyInstance(uslocale);
        System.out.println("US: " + usformat.format(payment));

        System.out.println("India: " + india);

        Locale.setDefault(Locale.CHINA);
        String china = NumberFormat.getCurrencyInstance().format(payment);
        System.out.println("China: " + china);

        Locale.setDefault(Locale.FRANCE);
        String france = NumberFormat.getCurrencyInstance().format(payment);
        System.out.println("France: " + france);
    }

}