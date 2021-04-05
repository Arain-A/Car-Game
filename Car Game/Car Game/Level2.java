import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Level2 extends World
{
    // Creating the variables
    public int shotDelay4 = 0;
    public int shotDelay1  = 0;
    public int shotDelay2  = 0;
    public int shotDelay3  = 0;
    public int shotDelay5 = 0;
    public int shotDelay6 = 0;
    public Level2()
    {    
        // Create a new world with 1000x600 cells with a cell size of 1x1 pixels.
        super(1000, 600, 1);
        
        // Calling the methods
        prepare();
    }
    
    public void act()
    {
        // Calling the methods
        car1();
        car2();
        car3();
        car4();
        p1();
        p2();
    }
    
    // Continuously spawning an enemy with a delay
    public void car1()
    {
        if(shotDelay1 >= 160)
              {
                   addObject(new EnemyCar4(), 338, 1);
                   shotDelay1 = 0;
              }
        shotDelay1++;
    }
    // Continuously spawning an enemy with a delay
    public void car2()
    {
        if(shotDelay2 >= 160)
              {
                   addObject(new EnemyCar2(), 403, 599);
                   shotDelay2 = 0;
              }
        shotDelay2++;
    }
    // Continuously spawning an enemy with a delay
    public void car3()
    {
        if(shotDelay3 >= 160)
              {
                   addObject(new EnemyCar1(), 739, 1);
                   shotDelay3 = 0;
              }
        shotDelay3++;
    }
    // Continuously spawning an enemy with a delay
    public void car4()
    {
        if(shotDelay4 >= 160)
              {
                   addObject(new EnemyCar3(), 807, 599);
                   shotDelay4 = 0;
              }
        shotDelay4++;
    }
    
    // Continuously spawning an enemy with a delay
    public void p1()
    {
         if(shotDelay5 >= 230)
              {
                   addObject(new EnemyPedestrian(), 284, 599);
                   shotDelay5 = 0;
              }
         shotDelay5++;
    }
    
    public void p2()
    {
         if(shotDelay6 >= 230)
              {
                   addObject(new EnemyPedestrian2(), 689, 1);
                   shotDelay6 = 0;
              }
         shotDelay6++;
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
        FinishLine2 finishline2 = new FinishLine2();
        addObject(finishline2,952,305);
        finishline2.setLocation(987,300);
        finishline2.setLocation(986,300);
        TextLevel2 textlevel2 = new TextLevel2();
        addObject(textlevel2,40,20);
        Crossroad crossroad = new Crossroad();
        addObject(crossroad,362,307);
        Crossroad crossroad2 = new Crossroad();
        addObject(crossroad2,767,308);
        crossroad2.setLocation(767,300);
        crossroad.setLocation(362,300);
        PedestrianCrossing pedestriancrossing = new PedestrianCrossing();
        addObject(pedestriancrossing,293,303);
        PedestrianCrossing pedestriancrossing2 = new PedestrianCrossing();
        addObject(pedestriancrossing2,847,330);
        pedestriancrossing.setLocation(284,300);
        pedestriancrossing2.setLocation(689,300);
        EnemyCar2 enemycar2 = new EnemyCar2();
        addObject(enemycar2,338,43);
        EnemyCar4 enemycar4 = new EnemyCar4();
        addObject(enemycar4,403,561);
        EnemyCar1 enemycar1 = new EnemyCar1();
        addObject(enemycar1,739,44);
        EnemyCar3 enemycar3 = new EnemyCar3();
        addObject(enemycar3,807,565);
        PlayerCar playercar = new PlayerCar();
        addObject(playercar,50,309);
        playercar.setLocation(40,300);
        enemycar2.setLocation(397,427);
        enemycar4.setLocation(325,38);
        enemycar2.setLocation(397,562);
        EnemyPedestrian enemypedestrian = new EnemyPedestrian();
        addObject(enemypedestrian,289,457);
        enemypedestrian.setLocation(283,457);
        EnemyPedestrian enemypedestrian2 = new EnemyPedestrian();
        addObject(enemypedestrian2,694,169);
        enemypedestrian2.setLocation(688,169);
        EnemyPedestrian2 enemypedestrian22 = new EnemyPedestrian2();
        addObject(enemypedestrian22,694,194);
        enemypedestrian22.setLocation(689,194);
    }
}
