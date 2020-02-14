public class Player
{
    private double xAxis; //x axis position of player
    private double yAxis; //y axis position of player
    private double speed; //speed of the player
    private double acceleration; //acc of player
    //private String color;     //player colour
    public Player(double x, double y, double h, double w, double acceleration){

        xAxis = x;
        yAxis = y;
        this.h = h;
        this.w = w;
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
    public double getHeight(){
        return Height;
    }

    public void setHight(double h){
        Height = h;
    }

    public double getWidth(){
        return Width;
    }

    public void setWidth(double w){
        Width = w;
    }

    public double getAcceleration(){
        return Acceleration;
    }
    public void setAcceleration(double a){
        Acceleration = a;
    }

}
