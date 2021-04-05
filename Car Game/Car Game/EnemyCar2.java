import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class EnemyCar2 extends Actor
{
    public void act() 
    {
        // Calling the methods
       movement();
       
       // Car crashes when it hits the car and plays a sound
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
    
    // Automaticalling moving the car downwards
    public void movement()
    {
        setLocation(getX(), getY()-3);
        
        // Settiong the retation of the car
        setRotation(180);
    }
}
