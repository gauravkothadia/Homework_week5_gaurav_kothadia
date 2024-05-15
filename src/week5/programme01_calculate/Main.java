package week5.programme01_calculate;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean response = true;
        while(response) {
            System.out.print("Enter first number:");
            int num1 = scanner.nextInt();
            System.out.print("Enter second number:");
            int num2 = scanner.nextInt();
            System.out.println("Please enter one of symbol +,-,*,/:");
            char operator = scanner.next().charAt(0);
            Calculator calc = new Calculator();
            calc.calculateResult(num1, num2, operator);
            System.out.print("Would you like to do more calculation Please enter \"Y\" or \"N\" :");
            char input = scanner.next().charAt(0);
            if(input=='Y'||input=='y'){
                response=true;
            }else if(input=='N'||input=='n'){
                response=false;
            }else{
                System.out.println("Invalid option selected.");
                break;
            }
        }
        scanner.close();
    }
}
