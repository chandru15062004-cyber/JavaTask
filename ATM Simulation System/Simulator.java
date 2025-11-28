package atm.org;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.sound.midi.SysexMessage;

public class Simulator {
    static long MainBalance = 10000;
    static int pin = 1234;
    static int attempts = 3;

    public static void main(String[] args) {
        System.out.println("Welcome to ATM");
        List<String> History = new ArrayList();//Create List to Store Transaction History
        Scanner ATM = new Scanner(System.in);//Create a Scanner
        while (attempts > 0) {//if attempts id greater than 0 Tell the user to enter the pin
            System.out.println("Enter the PIN: ");
            int PIN = ATM.nextInt();//Get pin from the user
            if (pin == PIN) {//if the entered pin is matches then show menu
                System.out.println("Access Granted");
                System.out.println("ATM Menu");
                System.out.println("1.Withdraw");
                System.out.println("2.Deposit");
                System.out.println("3.Check Balance");
                System.out.println("4.Mini Statement");
                System.out.println("5.Exit");
                int Options = ATM.nextInt();
                if (Options<1 || Options>5){
                    System.out.println("Please enter valid option");
                    continue;
                }
                switch (Options) {//User enters the options
                    case 1:
                        System.out.println("Enter the amount you want to withdraw");
                        long withdrawAmount = ATM.nextLong();//Enter the withdrawal amount here
                        if (withdrawAmount <= MainBalance) {//if entered amount is greater than main balance then minus that amount from main balance
                            MainBalance -= withdrawAmount;
                            System.out.println("Your Withdraw Amount is: " + withdrawAmount);
                            System.out.println("Transaction Successful");

                        } else {//if entered amount is greater than mainbalance then show insuffient
                            System.out.println("Insufficient Balance");
                        }
                        //now add that transaction to list for ministatement
                        History.add("Your Withdraw Amount is: " + withdrawAmount );
                        break;
                    case 2:
                        System.out.println("Enter the amount you want to deposit:");
                        long DepositedAmount = ATM.nextLong();
                        System.out.println("Your Deposited Amount is: " + DepositedAmount);
                         MainBalance += DepositedAmount;
//                        System.out.println("Your Total Amount is: " + MainBalance);
                       History.add("Your Deposited Amount is: " + DepositedAmount );
                        break;
                    case 3:
//                        float Balance = float MainBalance;
                        System.out.println("Your Balance is : " +MainBalance);
                        break;
                    case 4:
                        if (History.isEmpty()) {//if there is no transactions yet
                            System.out.println("No Transaction Yet");
                        } else {
                            System.out.println("Mini Statement of Last 5 Transactions is: ");
                            for (int i = Math.max(0, History.size() - 5); i < History.size(); i++) {//Math.max->compares the two numbers and takes the higher values.
                                // if there are  more than 5 transactions just minus total transactions by five then Starts from that Transaction & print last 5 transactions.
                                // If the transactions are <5 then Stars from 0 and prints 5 transactions because if suppose if there is only 3 transactions are done totally (3-5=-2) 0 is greater than negative values so it starts from 0
                                System.out.println(History.get(i));
                            }
                        }
                        break;
                    case 5:
                   

                            System.out.println("Thank you for visiting the ATM. Visite Again");
                            ATM.close();
                            return;
                }
            }
             else{
                attempts--;
                System.out.println("Wrong PIN Attempts Left" + attempts);
            }
        }
    }
    }

