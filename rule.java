import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class rule here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class rule extends World
{

    /**
     * Constructor for objects of class rule.
     * 
     */
    public rule()
    {    
        super(700, 495, 1);
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        back back = new back();
        addObject(back,605,433);
    }
}
