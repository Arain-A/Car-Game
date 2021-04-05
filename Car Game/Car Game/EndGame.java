import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class EndGame extends World
{
    public EndGame()
    {    
        // Create a new world with 1000x600 cells with a cell size of 1x1 pixels.
        super(1000, 600, 1); 
    }
    
    public void act()
    {
        // Sends back to main screen when enter is pressed
        if(Greenfoot.isKeyDown("enter"))
         Greenfoot.setWorld(new MainMenu());
    }
}
