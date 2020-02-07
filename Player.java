public class Player{
    private double xAxis; //x axis position of player
    private double yAxis; //y axis position of player
    private double speed; //speed of the player
    private double acceleration; //acc of player
    //private String color;     //player colour
    private player(double x, double y, double speed, double acceleration){
        xAxis = x;
        yAxis = y;
        this.speed = speed;
        acceleration = acc;
    }
    private double getX(){
        return xAxis;
    }
    private double getY(){
        return yAxis;
    }
}
