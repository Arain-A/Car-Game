import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class EnemyCar4 extends Actor
{
    public void act() 
    {
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
    // Automatically moving the car upwards
    public void movement()
    {
        setLocation(getX(), getY()+2);
    }
}
