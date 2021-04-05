import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class MainMenu extends World
{
    
    public MainMenu()
    {    
        // Create a new world with 100x600 cells with a cell size of 1x1 pixels.
        super(1000, 600, 1);
    }
    
    public void act()
    {
        // Starting the game when enter is pressed
        if(Greenfoot.isKeyDown("enter"))
         Greenfoot.setWorld(new Level1());
        
        // Playing music when enter is pressed
        if(Greenfoot.isKeyDown("enter"))
        Greenfoot.playSound("Music.mp3");
    }
}
