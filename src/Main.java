import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Indtast årstal.");
        int year = input.nextInt();

        System.out.println("Indtast måned.");
        int month = input.nextInt();

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

    public static String monthChecker(int month){
        switch (month){
            case 1:
                return "Januar";
            case 2:
                return "Februar";
            case 3:
                return "Marts";
            case 4:
                return "April";
            case 5:
                return "Maj";
            case 6:
                return "Juni";
            case 7:
                return "Juli";
            case 8:
                return "August";
            case 9:
                return "September";
            case 10:
                return "Oktober";
            case 11:
                return "November";
            case 12:
                return "December";
            default:
                return "FEJL";
        }
    }
}