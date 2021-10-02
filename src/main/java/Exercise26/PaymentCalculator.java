/*
 *  UCF COP3330 Fall 2021 Assignment 26 Solutions
 *  Copyright 2021 Garrett Adams
 */

package Exercise26;

//Imports all java util
import java.util.*;

//PaymentCalculator Class
public class PaymentCalculator {

    //Method calculateMonthsUntilPaidOff
    public static int calculateMonthsUntilPaidOff() {

        //Sets up variables we will be using here
        double UserAPR;
        double UserBalance;
        double MonthlyPayment;
        //Sets up the scanner
        Scanner ScanWord = new Scanner(System.in);
        //Prompts user for input
        System.out.println("What is your balance? ");
        //Scans user input to UserBalance
        UserBalance = ScanWord.nextDouble();

        //Prompts user for input
        System.out.println("What is the APR on the card (as a percent)? ");
        //Scans user input to UserAPR
        UserAPR = ScanWord.nextDouble();

        //Prompts user for input
        System.out.println("What is the monthly payment you can make? ");
        //Scans user input to balance
        MonthlyPayment = ScanWord.nextDouble();

        //Calculates UserAPR daily and accounts for percentage
        UserAPR = (UserAPR / 100)/365;
        //Calculates the time to pay
        return (int) Math.ceil((-1 / 30.0) * Math.log(1 + UserBalance / MonthlyPayment * (1 - Math.pow(1 + UserAPR, 30))) / Math.log(1 + UserAPR));

    }
}
