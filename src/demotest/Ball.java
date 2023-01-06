package demotest;

public class Ball {
    String colour ;



    public Ball setColour(String colour) {
        this.colour = colour;
        return null;
    }

    @Override
    public String toString() {
        return "BallClass{" +
                "colour='" + colour + '\'' +
                '}';
    }
}


