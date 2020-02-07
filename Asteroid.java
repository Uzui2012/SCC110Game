import java.util.Random;
public class Asteroid
{
    private double size;
    private double xPos;
    private double yPos;
    private double xSpeed;
    private double ySpeed;


    public Asteroid()
    {
        Random rand = new Random();
        
        //Choose random left or right speed
        if(rand.nextInt(1) == 1) //Right
        {
            this.xSpeed = 25*rand.nextDouble();
            //Choose random up or down speed
            if(rand.nextInt(1) == 1) //Down
            {
                this.ySpeed = 25*rand.nextDouble();
            }else //Up
            {
                this.ySpeed = -25*rand.nextDouble();
            }
        }else //Left
        {
            this.xSpeed = -25*rand.nextDouble();
            //Choose random up or down speed
            if(rand.nextInt(1) == 1) //Down
            {
                this.ySpeed = 25*rand.nextDouble();
            }else //Up
            {
                this.ySpeed = -25*rand.nextDouble();
            }
        }        
              
    }


}