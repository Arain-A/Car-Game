import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class FinishLine2 extends Actor
{
    public void act() 
    {
        // Calling the methods
        moveToLevel3();
    }    
    
    // Moves onto the next level when the car reaches the end
    public void moveToLevel3()
    {
        Actor car = getOneIntersectingObject(PlayerCar.class);
        
        if(car != null)
        {
            World world = getWorld();
            Greenfoot.setWorld(new Level3());
            world.removeObject(car);
        }
    }
}
