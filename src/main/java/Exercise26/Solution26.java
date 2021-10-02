/*
 *  UCF COP3330 Fall 2021 Assignment 26 Solutions
 *  Copyright 2021 Garrett Adams
 */

package Exercise26;

//Main Class Solution 26
public class Solution26 {
    public static void main(String[] args) {

        //Sets TimeToPay equal to the return of PaymentCalculator.calculateMonthsUntilPaidOff
        int TimeToPay = PaymentCalculator.calculateMonthsUntilPaidOff();
        //Prints out the final input
        System.out.println("It will take you " + TimeToPay + " months to pay off this card.");
    }
}
