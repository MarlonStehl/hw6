public class App {
    public static void main(String[] args) throws Exception {

        Player computer = new Player(1);
        Player human = new Player(5);

        Game bet_more = new Game(computer, human);
        bet_more.start();

    }
}
