import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Level3 extends World
{
    public int shotDelay0 = 0;
    public int shotDelay1 = 0;
    public int shotDelay2 = 0;
    public int shotDelay3 = 0;
    public int shotDelay4 = 0;
    public int shotDelay5 = 0;
    public int shotDelay6 = 0;
    public int shotDelay7 = 0;
    public int shotDelay8 = 0;
    public int shotDelay9 = 0;
    public Level3()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 600, 1);
        
        // Calling the methods
        prepare();
    }
    
    public void act()
    {
        car1();
        car2();
        car3();
        car4();
        p1();
        p2();
        p3();
        p4();
        p5();
        p6();
    }
    
    // Continuously spawning an enemy with a delay
    public void car1()
    {
        if(shotDelay0 >= 160)
              {
                   addObject(new EnemyCar1(), 156, 1);
                   shotDelay0 = 0;
              }
        shotDelay0++;
    }
    
    // Continuously spawning an enemy with a delay
    public void car2()
    {
        if(shotDelay1 >= 160)
              {
                   addObject(new EnemyCar2(), 220, 599);
                   shotDelay1 = 0;
              }
        shotDelay1++;
    }
    
    // Continuously spawning an enemy with a delay
    public void car3()
    {
        if(shotDelay2 >= 160)
              {
                   addObject(new EnemyCar4(), 779, 1);
                   shotDelay2 = 0;
              }
        shotDelay2++;
    }
    
    // Continuously spawning an enemy with a delay
    public void car4()
    {
        if(shotDelay3 >= 160)
              {
                   addObject(new EnemyCar3(), 847, 599);
                   shotDelay3 = 0;
              }
        shotDelay3++;
    }
       // Continuously spawning an enemy with a delay
    public void p1()
    {
         if(shotDelay4 >= 230)
              {
                   addObject(new EnemyPedestrian(), 102, 599);
                   shotDelay4 = 0;
              }
         shotDelay4++;
    }
    
    public void p2()
    {
         if(shotDelay5 >= 230)
              {
                   addObject(new EnemyPedestrian2(), 689, 1);
                   shotDelay5 = 0;
              }
         shotDelay5++;
    }
       // Continuously spawning an enemy with a delay
    public void p3()
    {
         if(shotDelay6 >= 230)
              {
                   addObject(new EnemyPedestrian(), 401, 599);
                   shotDelay6 = 0;
              }
         shotDelay6++;
    }
    
    public void p4()
    {
         if(shotDelay7 >= 230)
              {
                   addObject(new EnemyPedestrian2(), 689, 1);
                   shotDelay7 = 0;
              }
         shotDelay7++;
    }
       // Continuously spawning an enemy with a delay
    public void p5()
    {
         if(shotDelay8 >= 230)
              {
                   addObject(new EnemyPedestrian(), 560, 599);
                   shotDelay8 = 0;
              }
         shotDelay8++;
    }
    
    public void p6()
    {
         if(shotDelay9 >= 230)
              {
                   addObject(new EnemyPedestrian2(), 726, 1);
                   shotDelay9 = 0;
              }
         shotDelay9++;
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
        FinishLine3 finishline3 = new FinishLine3();
        addObject(finishline3,952,305);
        finishline3.setLocation(987,300);
        finishline3.setLocation(986,300);
        TextLevel3 textlevel3 = new TextLevel3();
        addObject(textlevel3,40,20);
        Crossroad crossroad3 = new Crossroad();
        addObject(crossroad3,291,305);
        Crossroad crossroad4 = new Crossroad();
        addObject(crossroad4,588,304);
        Crossroad crossroad5 = new Crossroad();
        addObject(crossroad5,867,309);
        crossroad3.setLocation(288,300);
        crossroad4.setLocation(584,300);
        crossroad5.setLocation(866,300);
        crossroad3.setLocation(182,300);
        crossroad4.setLocation(481,300);
        crossroad5.setLocation(814,300);
        crossroad5.setLocation(805,300);
        EnemyCar1 enemycar12 = new EnemyCar1();
        addObject(enemycar12,156,44);
        EnemyCar4 enemycar42 = new EnemyCar4();
        addObject(enemycar42,779,42);
        EnemyCar2 enemycar22 = new EnemyCar2();
        addObject(enemycar22,220,570);
        EnemyCar3 enemycar32 = new EnemyCar3();
        addObject(enemycar32,847,573);
        PedestrianCrossing pedestriancrossing = new PedestrianCrossing();
        addObject(pedestriancrossing,109,306);
        PedestrianCrossing pedestriancrossing2 = new PedestrianCrossing();
        addObject(pedestriancrossing2,109,306);
        pedestriancrossing2.setLocation(106,300);
        pedestriancrossing2.setLocation(401,300);
        pedestriancrossing.setLocation(102,300);
        PedestrianCrossing pedestriancrossing3 = new PedestrianCrossing();
        addObject(pedestriancrossing3,576,317);
        pedestriancrossing3.setLocation(562,300);
        PedestrianCrossing pedestriancrossing4 = new PedestrianCrossing();
        addObject(pedestriancrossing4,718,309);
        pedestriancrossing4.setLocation(726,300);
        EnemyPedestrian enemypedestrian = new EnemyPedestrian();
        addObject(enemypedestrian,109,419);
        enemypedestrian.setLocation(102,420);
        EnemyPedestrian enemypedestrian2 = new EnemyPedestrian();
        addObject(enemypedestrian2,401,169);
        enemypedestrian2.setLocation(560,169);
        EnemyPedestrian2 enemypedestrian22 = new EnemyPedestrian2();
        addObject(enemypedestrian22,401,194);
        enemypedestrian22.setLocation(560,194);
        enemypedestrian2.setLocation(401,412);
        enemypedestrian22.setLocation(560,412);
        PlayerCar playercar = new PlayerCar();
        addObject(playercar,50,309);
        playercar.setLocation(40,300);
    }
}
