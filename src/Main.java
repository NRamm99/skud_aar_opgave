import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        clearConsole();
        System.out.println("Indtast årstal.");
        int year = input.nextInt();

        System.out.println("Indtast måned.");
        int month = input.nextInt();

        clearConsole();
        if (skudAarChecker(year)) {
            System.out.println(year + " er skudår.");
        } else {
            System.out.println(year + " er ikke skudår");
        }

        System.out.println("I " + monthChecker(month) + ", " + year + ", var der " + antalDage(year, month) + " dage.");

    }

    public static boolean skudAarChecker(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public static int antalDage(int year, int month) {
        switch (month) {
            case 1: // jan
            case 3: // mar
            case 5: // maj
            case 7: // jul
            case 8: // aug
            case 10: // okt
            case 12: // dec
                return 31;

            case 4: // apr
            case 6: // jun
            case 9: // sep
            case 11: // nov
                return 30;

            case 2: // feb
                if (skudAarChecker(year)) {
                    return 29;
                } else {
                    return 28;
                }

            default:
                return -1; // ugyldig måned.
        }
    }

    public static String monthChecker(int month) {
        return switch (month) {
            case 1 -> "Januar";
            case 2 -> "Februar";
            case 3 -> "Marts";
            case 4 -> "April";
            case 5 -> "Maj";
            case 6 -> "Juni";
            case 7 -> "Juli";
            case 8 -> "August";
            case 9 -> "September";
            case 10 -> "Oktober";
            case 11 -> "November";
            case 12 -> "December";
            default -> "FEJL";
        };
    }

    public static void clearConsole() {
        for (int n = 0; n < 20; n++) {
            System.out.println();
        }
    }
}