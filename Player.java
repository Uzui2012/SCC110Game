public class Player
{
    private double xAxis; //x axis position of player
    private double yAxis; //y axis position of player
    private double speed; //speed of the player
    private double acceleration; //acc of player
    //private String color;     //player colour
    public Player(double x, double y, double speed, double acceleration){

        xAxis = x;
        yAxis = y;
        this.speed = speed;
        this.acceleration = acceleration;
    }
    //obtain current x position of player
    public double getX(){
        return xAxis;
    }
    //obtain current y position of player
    public double getY(){
        return yAxis;
    }
    //set x position of player
    public void setX(double x){
        this.xAxis = x;
    }
    //set y position of player
    public void setY(double y){
        this.yAxis = y;
    }

}
