import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class CurbTop extends Actor
{
    public void act() 
    {
       // Car crashes when it hits the curb and plays a sound
       Actor car;
       car = getOneIntersectingObject(PlayerCar.class);
       if (car !=null)
       {
            World world = getWorld();
            world.removeObject(car);
            Greenfoot.playSound("Crash.mp3");
            Greenfoot.setWorld(new Crash());
       }
    }    
}
