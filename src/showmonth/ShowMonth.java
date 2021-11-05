/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package showmonth;

import java.util.Scanner;

/**
 *
 * @author AhmedTawfik
 */
public class ShowMonth {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);

        System.out.println("Please, enter the month number: ");

        int monthNumber = input.nextInt();

        switch (monthNumber) {
            case 1: {
                System.out.println("The month name is January");
                break;
            }
            case 2: {
                System.out.println("The month name is February");
                break;
            }
            case 3: {
                System.out.println("The month name is March");
                break;
            }
            case 4: {
                System.out.println("The month name is April");
                break;
            }
            case 5: {
                System.out.println("The month name is May");
                break;
            }
            case 6: {
                System.out.println("The month name is June");
                break;
            }
            case 7: {
                System.out.println("The month name is July");
                break;
            }
            case 8: {
                System.out.println("The month name is August");
                break;
            }
            case 9: {
                System.out.println("The month name is September");
                break;
            }
            case 10: {
                System.out.println("The month name is October");
                break;
            }
            case 11: {
                System.out.println("The month name is November");
                break;
            }
            case 12: {
                System.out.println("The month name is December");
                break;
            }
            default: {
                System.out.println("Please, enter the number between 1 and 12");
            }

        }

    }

}
