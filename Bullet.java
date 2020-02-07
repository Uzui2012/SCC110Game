public class Bullet {
    private double xPosition;       // The X position of the bullet
    private double yPosition;       // The Y position of the bullet
    private int speed;              // The speed of the bullet
    private String colour;          // Colour of the bullet

    /** 
     * Create new instance of Bullet 
     * @param x The X Coordinate of the Bullet, in pixels
     * @param y The Y Coordinate of the Bullet, in pixels
     * @param speed The speed of the Bullet
    */
    public Bullet(double x, double y, int speed) {
        xPosition = x;
        yPosition = y;
        this.speed = speed;
        colour = "darkgrey";
    }

    public double getXPosition() {
        return xPosition;
    }

    public void setXPosition(double x) {
        xPosition = x;
    }

    public double getYPosition() {
        return yPosition;
    }

    public void setYPosition(double y) {
        yPosition = y;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(int s) {
        speed = s;
    }

    public String getColour() {
        return colour;
    }
    
    public void setColour(String c) {
        colour = c;
    }
}