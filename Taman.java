import greenfoot.*;

  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Taman extends World
{
    int enemyCount = 0,coinCount = 0,botolCount=0;
    counter count = new counter();
    Human human = new Human();
    Live[] liveArray ={new Live(),new Live(),new Live()};
    int i=0,n=0,speed=150,min=0,speedtali=8;
    GreenfootSound backsound = new GreenfootSound("backsound.mp3");
   
    
    public Taman()
    {    
        
        super(700, 495, 1);
        
        addObject(new Tali2(),335,getHeight()-195);
        addObject(human,335,getHeight()-125);
        setPaintOrder(Tali.class,Human.class);
        addObject(new count(),57,30);
        addObject (count,53,33);
        addObject(new teman2(),488,298);
        addObject(new teman1(),167,304);
        backsound.playLoop();
       
        for (int i = 0; i< 3; i++)
        {
            addObject(liveArray[i],(550+(57*i)), 43);
        }
        
    }
    
    
    public void act(){
        
        getLeaf();
        getCoin();
        
         
       }
   
   
    public void getLeaf(){
        enemyCount++;
         if(enemyCount >(speed)){
            addObject(new daun(),200+Greenfoot.getRandomNumber(300),0);
            enemyCount=0;
        }  
    }
   
    public void getCoin(){
        coinCount++;
        if(coinCount > (speed+50)){
            addObject(new coin(),200+Greenfoot.getRandomNumber(300),0);
            coinCount=0;
        }
       
    }
   

    public int getCounter(int i)
    {
        n=count.Count(i);
         if((n+1)%10 == 0 ){
            speed-=25;
            if(speed<1){
            speed = 30;
            }
         }
          if((n+1)%15 == 0 ){
            speedtali-=1;
            if(speedtali<3){
            speed = 2;
            }
         }
        
        return n;
    }

    
    public void getTouch(){
        human.touch();
    }
    
    public void removeLive(int r){
        removeObject(liveArray[i]);
        i=i+r;
        if(i==3){
        backsound.stop();
  
        Greenfoot.playSound("gameover.wav");
        Greenfoot.delay(12);
        Greenfoot.setWorld(new itsover(n));
        }
    }

   
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Live live = new Live();
        addObject(live,666,41);
        Live live2 = new Live();
        addObject(live2,611,47);
        live2.setLocation(607,43);
        Live live3 = new Live();
        addObject(live3,554,52);
        live3.setLocation(550,43);
    }
}

