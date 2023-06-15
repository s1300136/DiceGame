import java.util.Scanner;
import java.util.Random;

public class DiceGame{
    public static void main(String[] args) {
        System.out.print("What is your name? ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("Hello, " + name + "!");

        System.out.println("Rolling dice...");
        
        // 1から6までのランダムな数を生成
        Random random = new Random();
        int die1 = random.nextInt(6) + 1;
        int die2 = random.nextInt(6) + 1;
        
        System.out.println("Die 1: " + die1);
        System.out.println("Die 2: " + die2);
	int totalValue = die1 + die2;
        System.out.println("Total value: " + totalValue);
	
	 if (totalValue > 7) {
            System.out.println("You won");
        } else {
            System.out.println("You lost");
        }

        scanner.close();
    }
}

