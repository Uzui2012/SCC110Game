import java.util.Random;
public class Asteroid
{
    private double size;
    private double xPos;
    private double yPos;
    private double xSpeed;
    private double ySpeed;

    public Asteroid(){
        Random rand = new Random();

        //Choose random left or right speed
        if(rand.nextInt(1) == 1){ //Right
            xSpeed = 25*rand.nextDouble();
            //Choose random up or down speed
            if(rand.nextInt(1) == 1){ //Down
                ySpeed = 25*rand.nextDouble();
            }else{ //Up
                ySpeed = -25*rand.nextDouble();
            }
        }else{ //Left
            xSpeed = -25*rand.nextDouble();
            //Choose random up or down speed
            if(rand.nextInt(1) == 1){//Down
                ySpeed = 25*rand.nextDouble();
            }else{ //Up
                ySpeed = -25*rand.nextDouble();
            }
        }
    }

    public void updatePos(){
        xPos = xPos + xSpeed;
        yPos = yPos + ySpeed;
    }

    public void drawAsteroid(){

    }

}