import java.lang.Math;

public class Bullet 
{
    // Coords start from top left corner
    private double xPosition;       // The X position of the bullet
    private double yPosition;       // The Y position of the bullet
    private int speed;              // The speed of the bullet
    private String colour;          // Colour of the bullet
    private int orientation;        // Orientation of the bullet, will be the same as the player
    private GameArena gameArena;    // GameArena instance which parents the bullet
    private double width;           // Width of the bullet in pixels (default 5)
    private double height;          // Height of the bullet in pixels (default 20)
    private double dx;              // X increment
    private double dy;              // Y increment

    /** 
     * Create new instance of Bullet 
     * @param x The X Coordinate of the Bullet, in pixels
     * @param y The Y Coordinate of the Bullet, in pixels
     * @param speed The speed of the Bullet
     * @param ga GameArena instance to which the bullet will be added to
    */
    public Bullet(double x, double y, int speed, GameArena ga) {
        xPosition = x;
        yPosition = y;
        this.speed = speed;
        colour = "darkgrey";
        gameArena = ga;
        width = 5;      // Default width
        height = 20;    // Default height
        calculateIncrements();
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

    public void setWidth(int w) {
        width = w;
    }

    public double getWidth() {
        return width;
    } 
    
    public void setHeight(int h) {
        height = h;
    }

    public double getHeight() {
        return height;
    }

    /*public void addTo(GameArena ga) {
        // Add rectangles
    }*/

    public void draw() {
        Rectangle r = new Rectangle(xPosition, yPosition, width, height, colour);
        gameArena.addRectangle(r);
    }

    public void calculateIncrements() {
        dx = speed * Math.cos(Math.toRadians(orientation));
        dy = speed * Math.sin(Math.toRadians(orientation));
    }

    public void move() {
        xPosition += dx;
        yPosition += dy;
    }
}