import comp102x.project.control.GameEngine;
import comp102x.project.model.GameModel;
import comp102x.project.task.AimListener;
import comp102x.project.view.GameScreen;
import comp102x.project.view.PlayGameView;
import comp102x.project.view.StartGameView;
import java.util.Random;
public class Main {

    public static void main(String[] args) {
        Random r = new Random();
        GameScreen gs = new GameScreen();
        GameModel gm = new GameModel(r);
        GameEngine ge = new GameEngine(gs, gm);

        ge.startGame();
    }

}
