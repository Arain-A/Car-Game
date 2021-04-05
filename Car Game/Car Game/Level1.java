import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class Level1 extends World
{
    
    GreenfootSound backgroundMusic = new GreenfootSound("Music.mp3");
    // Creating the variables
    public int shotDelay = 0;
    public int shotDelay1  = 0;
    public int shotDelay2  = 0;
    public int shotDelay3  = 0;
    public Level1()
    {    
        // Create a new world with 1000x600 cells with a cell size of 1x1 pixels.
        super(1000, 600, 1);
        
        // Calling the methods
        prepare();
        
        backgroundMusic.playLoop();
    }
    
    public void act()
    {
        // Calling the methods
        car1();
        car2();
        p1();
        p2();
        
    }
    
    // Continuously spawning an enemy with a delay
    public void car1()
    {
        if(shotDelay1 >= 160)
              {
                   addObject(new EnemyCar1(), 470, 1);
                   shotDelay1 = 0;
              }
        shotDelay1++;
    }
    
    // Continuously spawning an enemy with a delay
    public void car2()
    {
         if(shotDelay >= 160)
              {
                   addObject(new EnemyCar2(), 530, 599);
                   shotDelay = 0;
              }
         shotDelay++;
    }
    
    // Continuously spawning an enemy with a delay
    public void p1()
    {
         if(shotDelay2 >= 230)
              {
                   addObject(new EnemyPedestrian(), 420, 599);
                   shotDelay2 = 0;
              }
         shotDelay2++;
    }
    
    // Continuously spawning an enemy with a delay
    public void p2()
    {
         if(shotDelay3 >= 230)
              {
                   addObject(new EnemyPedestrian2(), 580, 1);
                   shotDelay3 = 0;
              }
         shotDelay3++;
    }
    
    // The mothod for spaning all the Actors in set locations
    private void prepare()
    {
        CurbBottom curbbottom = new CurbBottom();
        addObject(curbbottom,498,380);
        curbbottom.setLocation(500,379);
        CurbTop curbtop = new CurbTop();
        addObject(curbtop,491,205);
        curbtop.setLocation(499,222);
        FinishLine finishline = new FinishLine();
        addObject(finishline,952,305);
        finishline.setLocation(987,300);
        finishline.setLocation(986,300);
        TextLevel1 textlevel1 = new TextLevel1();
        addObject(textlevel1,40,20);
        Crossroad crossroad = new Crossroad();
        addObject(crossroad,355,241);
        crossroad.setLocation(500,300);
        EnemyCar1 enemycar1 = new EnemyCar1();
        addObject(enemycar1,471,47);
        enemycar1.setLocation(471,47);
        enemycar1.setLocation(471,47);
        enemycar1.setLocation(471,47);
        enemycar1.setLocation(471,47);
        enemycar1.setLocation(471,47);
        enemycar1.setLocation(470,150);
        EnemyCar2 enemycar2 = new EnemyCar2();
        addObject(enemycar2,538,560);
        enemycar2.setLocation(530,470);
        PedestrianCrossing pedestriancrossing = new PedestrianCrossing();
        addObject(pedestriancrossing,434,338);
        pedestriancrossing.setLocation(420,300);
        PedestrianCrossing pedestriancrossing2 = new PedestrianCrossing();
        addObject(pedestriancrossing2,596,302);
        pedestriancrossing2.setLocation(580,300);
        PlayerCar playercar = new PlayerCar();
        addObject(playercar,50,309);
        playercar.setLocation(40,300);
        EnemyPedestrian enemypedestrian = new EnemyPedestrian();
        addObject(enemypedestrian,429,590);
        enemypedestrian.setLocation(420,479);
        enemypedestrian.setLocation(421,477);
    }
}
