//package util;
import java.util.Scanner;

public class Input {
    private Scanner scanner;
    public Input(){
        this.scanner = new Scanner(System.in);
    }

    public String getString(){
        String input = this.scanner.nextLine();
        return input;
    };

    public boolean yesNo(){
        System.out.println("yes or no?");
        String answer = this.scanner.nextLine();
        if(answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("y")){
            return true;
        } else {
            return false;
        }
//        return answer;
//        return input;
    }

    public int getInt(int min, int max){
//        System.out.println("Enter a number between " + min + " and " + max);

        while(true){
            int userInput = this.scanner.nextInt();
            if(userInput <= max && userInput >= min){
                return userInput;
            }
        }
    }

    public int getInt(){
//        String userInput = getString();

        int number;

        try {
            number = Integer.valueOf(getString());
            return number;
        } catch (Exception e){
            System.out.println("We have a problem: " + e.getMessage());
            System.out.println("Try again.");
            return getInt();
        }


    }

    public double getDouble(double min, double max){
        double userInput = this.scanner.nextInt();
        if(userInput > max || userInput < min){
            System.out.println("Try again");
            getDouble(min, max);
        }
        System.out.println("Success " + userInput);
        return userInput;
    }

    public double getDouble(){
        double userInput;

        try {
            userInput = Double.valueOf(getString());
            return userInput;
        } catch (Exception e){
            System.out.println("We have a problem: " + e.getMessage());
            System.out.println("Try again.");
            return getDouble();
        }



    }


}