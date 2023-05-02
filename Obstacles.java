import java.util.Random;

public class Obstacles {

    private int x;
    private int y;
    private int width;
    private int height;

    private static int START_X = Constants.WINDOW_WIDTH/5;

    public Obstacles(int x,int y){
        Random random = new Random();
        this.x = START_X;
        this.y = y;
        this.height = random.nextInt(Constants.MIN_OBSTACLE_HEIGHT, Constants.WINDOW_HEIGHT/2 - Constants.BIRD_HEIGHT/2-Constants.DISTANCE_OBSTACLE/2);
        this.width = Constants.OBSTACLE_WIDTH;

    }

    public void paint(){

    }

}
