import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String play1 = "";
        String play2 = "";


        play1 = getPlayerMove(scanner, "Player 1");


        play2 = getPlayerMove(scanner, "Player 2");


        if (play1.equals("R")) {
            if (play2.equals("R")) {
                System.out.println("Rock vs Rock - It's a TIE!");
            } else if (play2.equals("P")) {
                System.out.println("Paper covers Rock - Player 2 wins!");
            } else { // play2 is Scissors
                System.out.println("Rock smashes Scissors - Player 1 wins!");
            }
        } else if (play1.equals("P")) {
            if (play2.equals("R")) {
                System.out.println("Paper covers Rock - Player 1 wins!");
            } else if (play2.equals("P")) {
                System.out.println("Paper vs Paper - It's a TIE!");
            } else { // play2 is Scissors
                System.out.println("Scissors cut Paper - Player 2 wins!");
            }
        } else { // play1 is Scissors
            if (play2.equals("R")) {
                System.out.println("Rock smashes Scissors - Player 2 wins!");
            } else if (play2.equals("P")) {
                System.out.println("Scissors cut Paper - Player 1 wins!");
            } else { // play2 is Scissors
                System.out.println("Scissors vs Scissors - It's a TIE!");
            }
        }

        scanner.close();
    }

    private static String getPlayerMove(Scanner scanner, String playerName) {
        String move;
        while (true) {
            System.out.print(playerName + ", enter your move [R/P/S]: ");
            move = scanner.nextLine().trim().toUpperCase();
            if (move.equals("R") || move.equals("P") || move.equals("S")) {
                break; // valid move entered
            } else {
                System.out.println("Invalid move! Please enter R, P, or S.");
            }
        }
        return move;
    }
}