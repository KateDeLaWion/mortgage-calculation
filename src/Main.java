import java.awt.*;
import java.text.NumberFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {

    //    According wikiHow,
//    MonthlyMortgage = Principal * (  monthlyInterestRate * (1+monthlyInterestRate)^numberOfPayment  )
//                      / (  (1+monthlyInterestRate)^numberOfPayment  -  1  )
    public static void main(String[] args) {
        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Principal: ");
        int principal = scanner.nextInt();

        System.out.print("Annual Interest Rate: ");
        float annualInterest = scanner.nextFloat();
        float monthlyInterest = annualInterest / PERCENT / MONTHS_IN_YEAR;

        System.out.print("Period (Years of payment back): ");
        byte years = scanner.nextByte();
        int numberOfPayments = years * MONTHS_IN_YEAR;

        double mortgage = principal * ( monthlyInterest * Math.pow(1+monthlyInterest,numberOfPayments))
                / ( Math.pow(1+monthlyInterest,numberOfPayments) -1);

        // one way to write is:
//        NumberFormat numberFormat = NumberFormat.getCurrencyInstance();
//        System.out.println("Mortgage per month: " + numberFormat.format(mortgage));

        // shorter way to write is:
        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Mortgage per month: " + mortgageFormatted);






    }

}
