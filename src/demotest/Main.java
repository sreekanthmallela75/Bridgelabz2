package demotest;

public class Main {
    private int[] balls;
    private int count;

    public static void main(String[] args) {
        Bag bag = new Bag();
        Main ob = new Main();


        Ball b1 =new Ball();
        b1.setColour("Red");
        bag.addBalls(b1);

        Ball b2 =new Ball();
        b2.setColour("Red");
        bag.addBalls(b2);

        Ball b3 =new Ball();
        b3.setColour("Red");
        bag.addBalls(b3);

        Ball b4 =new Ball();
        b4.setColour("Blue");
        bag.addBalls(b4);

        Ball b5 =new Ball();
        b5.setColour("Blue");
        bag.addBalls(b5);

        Ball b6 =new Ball();
        b6.setColour("Blue");
        bag.addBalls(b6);

        Ball b7 =new Ball();
        b7.setColour("Yellow");
        bag.addBalls(b7);

        Ball b8 =new Ball();
        b8.setColour("Yellow");
        bag.addBalls(b8);

        Ball b9 =new Ball();
        b9.setColour("Yellow");
        bag.addBalls(b9);

        Ball b10 =new Ball();
        b10.setColour("Green");
        bag.addBalls(b10);

        Ball b11 =new Ball();
        b11.setColour("Green");
        bag.addBalls(b11);

        Ball b12 =new Ball();
        b12.setColour("Green");
        bag.addBalls(b12);

        ob.print(bag.getBalls());
    }
    public void print(Ball[] b){
        for (int i=0; i< b.length;i++){
            System.out.println(b[i]);
        }
    }
    public void addBall(Ball b){
        if(b.colour.equals("green")){
            for (int ball : this.balls) {
                System.out.println("green ball is added");
                Object Green;

            }


        }

    }

}



