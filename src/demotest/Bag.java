package demotest;

public class Bag {
    private Ball[] balls = new Ball[12];
    private int count = 0;
          int green=0;
          int red = 0;
          int yellow = 0;

    public Ball[] getBalls() {
        return balls;
    }

    public void addBalls(Ball balls) {
        this.balls[count++] = balls;
        System.out.println("Green ball is added");
        green++;

    }

}



