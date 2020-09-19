import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Tali here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

    
   public class Tali extends Actor
{
    private GreenfootImage[] images = new GreenfootImage[10];
    private int jeda=8,num=0,speed=8;
    
    public Tali()
    {
        for (int i=0; i<images.length; i++) images[i] = new GreenfootImage("tali"+(i+1)+".png");
        setImage(images[0]);
        
    }
     
    public void act() 
    {
       
       if(jeda==0){ 
             Taman taman = (Taman)getWorld();
             speed=taman.speedtali;
             jeda=speed;}
        if(jeda==1){
            setImage(images[num]);
            num++;
            
            if(num==10){
             Taman taman = (Taman)getWorld();
             taman.getTouch();
             speed=taman.speedtali;
            }
            
            if(num>=images.length) {
                getWorld().addObject(new Tali2(), getX(), getY());
                getWorld().removeObject(this);   
                num=0;
            }   
        }
        if(jeda>0)jeda--;
        
        
    }
    
    
}
  
      
    

