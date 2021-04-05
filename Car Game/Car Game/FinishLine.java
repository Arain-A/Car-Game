import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class FinishLine extends Actor
{
    public void act() 
    {
        // Calling the methods
        moveToLevel2();
    }
    
    // Moves onto the next level when the car reaches the end
    public void moveToLevel2()
    {
        Actor car = getOneIntersectingObject(PlayerCar.class);
        
        if(car != null)
        {
            World world = getWorld();
            Greenfoot.setWorld(new Level2());
            world.removeObject(car);
        }
    }
}
