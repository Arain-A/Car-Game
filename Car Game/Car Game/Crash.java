import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Crash here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Crash extends World
{

    /**
     * Constructor for objects of class Crash.
     * 
     */
    public Crash()
    {    
        // Create a new world with 1000x600 cells with a cell size of 1x1 pixels.
        super(1000, 600, 1); 
    }
    
    public void act()
    {
        // Restarts the game when enter is pressed
        if(Greenfoot.isKeyDown("enter"))
        Greenfoot.setWorld(new Level1());
    }
}
