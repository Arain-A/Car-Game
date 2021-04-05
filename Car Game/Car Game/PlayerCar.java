import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class PlayerCar extends Actor
{
    public void act() 
    {
        // Calling the methods
        movement();
    }    
    
    // Moving the car when keys are pressed
    public void movement()
    {
        if(Greenfoot.isKeyDown("w"))
        {
            move(3);
        }
        
        if(Greenfoot.isKeyDown("a"))
        {
            turn(-2);
        }
        
        if(Greenfoot.isKeyDown("d"))
        {
            turn(2);
        }
        
        if(Greenfoot.isKeyDown("s"))
        {
            move(-3);
        }
    }
}
