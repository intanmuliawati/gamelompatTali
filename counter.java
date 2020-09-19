import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class counter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class counter extends Actor
{
    public int total = 0;
    public counter() 
    {
        setImage(new GreenfootImage("SCORE = 0",20,Color.GREEN,Color.WHITE));
    }    
   
    
    public int Count(int amount)
    {
    total+=amount;
    setImage(new GreenfootImage("SCORE = "+total,20,Color.GREEN,Color.WHITE));
    return total;
    }
  
}
