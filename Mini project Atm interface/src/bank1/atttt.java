package bank1;

import java.util.Scanner;

public class atttt {

	public static void main(String[] args) {
        int balance = 5000, withdraw, deposit; 
        String name;
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to ABC BANK");
        System.out.println("Enter your name");
        name = sc.next();
        
        while(true)
        {
            System.out.println("Automated Teller Machine");
            System.out.println("press 1 for Withdraw");
            System.out.println("press 2 for Deposit");
            System.out.println("press 3 for Check Balance");
            System.out.println("press 4 for EXIT");
            System.out.print("Enter your choice");
            int ch = sc.nextInt();
            switch(ch) 
            {
                case 1:
                System.out.print("Enter money to be withdrawn:");
                withdraw = sc.nextInt();
                if(balance >= withdraw)
                {
                    balance = balance - withdraw;
                    System.out.println("Please collect your money");
                    System.out.println("Thanks"+" "+name+" for banking with us");
                }
                else
                {
                    System.out.println("Insufficient Balance");
                    System.out.println("Thanks"+" "+name+" for banking with us");
                }
                System.out.println("");
                break;
 
                case 2:
                System.out.print("Enter money to be deposited:");
                deposit = sc.nextInt();
                balance = balance + deposit;
                System.out.println("Your Money has been successfully depsited");
                System.out.println("Thanks"+" "+name+" for banking with us");
                System.out.println("");
                break;
 
                case 3:
                System.out.println("Balance : "+balance);
                System.out.println("Thanks"+" "+name+" "+" for banking with us");
                System.out.println("");
                break;
 
                case 4: 
            
                System.out.println("Thanks"+" "+name+"for banking with us");
                System.exit(0);
   
            }
        }
    }

	}

