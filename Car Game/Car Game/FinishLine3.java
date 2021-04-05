import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class FinishLine3 extends Actor
{
    public void act() 
    {
        // Calling the methods
        endGame();
    }    
    
    // Moves onto the next level when the car reaches the end
    public void endGame()
    {
        Actor car = getOneIntersectingObject(PlayerCar.class);
        
        if(car != null)
        {
            World world = getWorld();
            Greenfoot.setWorld(new EndGame());
            world.removeObject(car);
        }
    }
}
