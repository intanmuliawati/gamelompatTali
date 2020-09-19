import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class itsover here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class itsover extends World
{
   
    /**
     * Constructor for objects of class itsover.
     * 
     */
    public itsover(int score)
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(700, 495, 1);
        prepare();
        
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        again again = new again();
        addObject(again,359,444);
       
    }
}
