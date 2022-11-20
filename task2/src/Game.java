import java.util.Random;
import java.util.Scanner;

public class Game {

    private Player computer, human;
    private int randomCard;

    public Game(Player computer, Player human) {
        this.computer = computer;
        this.human = human;
    }

    public void start() {

        /*
         * Computer picks a card first
         */
        computer.setPickedCard(shuffle());

        /**
         * Now the human player can choose a card
         */

        randomCard = shuffle();
        human.setPickedCard(randomCard);
        System.out.println("Your card number is: " + randomCard);

        Scanner s = new Scanner(System.in);

        while (human.getSelectionsLeft() > 0) {

            System.out.println("Do you want a different card (y/n)?");
            String str = s.next();
            if (!str.equalsIgnoreCase("y")) {
                // No other card
                break;
            } else {
                // Other card
                randomCard = shuffle();
                human.setPickedCard(randomCard);
                human.reduceSelects();
                System.out.println("---------------");
                System.out.println("Selections left: " + human.getSelectionsLeft());
                System.out.println("Your new card number is: " + randomCard);
            }

        }
        evaluate();
    }

    public int shuffle() {
        Random rand = new Random();
        int randInt = rand.nextInt(100);
        return randInt + 1;
    }

    public void evaluate() {
        System.out.println("---------------");
        System.out.println("Computer: " + computer.getPickedCardU());
        System.out.println("You: " + human.getPickedCardU());
        System.out.println("Selections left: " + human.getSelectionsLeft());
        if (computer.getPickedCardU() > human.getPickedCardU()) {
            System.out.println("You lost :( Try it another time...");
        } else if (computer.getPickedCardU() < human.getPickedCardU()) {
            System.out.println("!!!You win!!! :D");
        } else {
            System.out.println("You and the computer have the same card number");
        }
    }

}
