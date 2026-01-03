package atm.org;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Simulator {
    private double balance;
    private int pin;
    private double transaction;

        public void bankAccount(double balance,int pin) {
            this.balance = balance;
            this.pin = pin;
            this.transaction = 0;
        }
        public int getPin() {
            return pin;
        }
        public double getBalance() {
            return balance;
        }
        public double getTransaction() {
            return transaction;
        }
        public String toString(){
            return pin+" "+balance+" "+transaction;
        }
public class History{
            File F=new File("History.txt");
            private static ArrayList<History> history=new ArrayList<History>();

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Pin");
        short Pin = sc.nextShort();
        short pin=Pin;
        if(true){
            System.out.println("<-Valid Pin->");
            System.out.println("1.Withdraw");
            System.out.println("2.Deposit");
            System.out.println("3.Check Balance");
            System.out.println("4.Mini Statement");
            System.out.println("5.Exit");
        }
        else{
            System.out.println("Invalid Pin");
            System.out.println("Re-try");
        }

    }
}

}
