import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Human here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Human extends Actor
{
    /**
     * Act - do whatever the Human wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private final int gravity = 1;
    private int v;
   
    
    public Human() {
        v =0;
        
    }
   
    public void act() 
    {
        
       fall();
       if ( Greenfoot.isKeyDown("space")&& getY() > getWorld().getHeight()-143){
           jump();Greenfoot.playSound("boin.wav");
        }
       move();
       
       Actor Enemy;
       Enemy = getOneObjectAtOffset(0,0,daun.class);
       if(Enemy!=null)
       {
           Taman taman = (Taman)getWorld();
           taman.removeObject(Enemy);
          taman.removeLive(1);
       }
       
       Actor coin;
       coin = getOneObjectAtOffset(0,0,coin.class);
       if(coin!=null)
       {
          Greenfoot.playSound("coin2.wav");
          Taman taman = (Taman)getWorld();
          taman.removeObject(coin);
          taman.getCounter(1);
       }
    } 
    public void fall(){
        setLocation(getX(),getY()+v);  
        if (getY() > getWorld().getHeight()-125) v=0;
        else v += gravity;
    }
    public void jump(){
        v=-14;
    }
    public void move(){
        int y=getY();
        int x=getX();
        if (Greenfoot.isKeyDown("Left") && getX()>180){ setImage("bocah1.png"); x=x-4;}
        if(Greenfoot.isKeyDown("Right") && getX()<500){setImage ("bocah3.png"); x=x+4;}
        setLocation(x,y); 
    }
    public void touch(){
        Taman taman = (Taman)getWorld();
        if (getY() >= getWorld().getHeight()-125){
          Greenfoot.delay(7);
          taman.removeLive(1);
          taman.getCounter(0);
        }
        else{
        taman.getCounter(1);
        }
       
    }
    
   
 
    
    
    
    
}
