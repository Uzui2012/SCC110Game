public class Player
{
    private double xAxis; //x axis position of player
    private double yAxis; //y axis position of player
    private double height, width; 
    private double acceleration; //acc of player
    //private String color;     //player colour
    public Player(double x, double y, double h, double w, double acceleration){

        xAxis = x;
        yAxis = y;
        this.height = h;
        this.width = w;
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
        return height;
    }

    public void setHeight(double h){
        height = h;
    }

    public double getWidth(){
        return width;
    }

    public void setWidth(double w){
        width = w;
    }

    public double getAcceleration(){
        return acceleration;
    }
    public void setAcceleration(double a){
        acceleration = a;
    }

}
