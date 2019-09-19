package work.java_learn.$pattern.$22Template;

public class Main {

    public static void main(String[] args) {

        Poker game = new Poker();
        game.run();
    }
}


abstract class Game {
    abstract void startGame();
    abstract void playGame();
    abstract void closeGame();

    void run(){
        startGame();
        playGame();
        closeGame();
    }

}

class Poker extends Game {

    @Override
    void startGame() {
        System.out.println("get cards");
    }

    @Override
    void playGame() {
        System.out.println("second step");
    }

    @Override
    void closeGame() {
        System.out.println("third step");
    }
}