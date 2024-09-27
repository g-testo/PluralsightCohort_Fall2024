package com.ps;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

//        Calculator 1: A mortgage calculator - it is used to calculate out how
//        much a monthly payment for a loan would be (minus any insurance or taxes), as
//        well as how much interest you would pay over the life of the loan.
//        a. It would accept the principal, interest rate, and loan length from the user
//        b. It would display the expected monthly payment and total interest paid


//        Example: A $53,000 loan at 7.625% interest for 15 years would have a $495.09 /
//        mo payment with a total interest of $36,115.99
//        This calculator would use a compounded interest formula.

        // Inputs
        // initial loan - 53,000
        // rate - 7.625
        // loanLength - 15 years

        // P is 53,000
        // i is .07625/12 (.006354166)
        // l is 15*12 (180 months)

        float initialLoan = 53_000;
        float rate = 7.625f;
        float loanLength = 15;

        float monthlyRate = rate/12/100;
        float monthlyLoanLength = loanLength*12;

        double monthlyPayment = initialLoan*(monthlyRate/(1-(Math.pow(1+monthlyRate, -monthlyLoanLength))));

        double totalInterest = monthlyPayment*monthlyLoanLength - initialLoan;
        System.out.printf("Monthly Payment: $%.2f, Total Interest: $%.2f", monthlyPayment, totalInterest);

        // Outputs
        // monthly payment - 495.09
        // total interest - 36,115.99

    }
}