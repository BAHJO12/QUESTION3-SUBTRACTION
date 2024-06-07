/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */



import java.util.Scanner;
import java.util.Random;

public class Subtraction {
    public static void main(String[] args) {
       
        Random rand = new Random();
        int number1 = rand.nextInt(10); 
        int number2 = rand.nextInt(10); 
        
        if (number1 < number2) {
            int temp = number1;
            number1 = number2;
            number2 = temp;
        }
        
        System.out.println("What is " + number1 + " - " + number2 + "?");
        Scanner input = new Scanner(System.in);
        int studentAnswer = input.nextInt();
        int correctAnswer = number1 - number2;
        if (studentAnswer == correctAnswer) {
            System.out.println("Correct!");
        } else {
            System.out.println("Incorrect. The correct answer is " + correctAnswer + ".");
        }
        
        input.close();
    }
}
    

