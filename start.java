import greenfoot.*;
import java.io.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class start here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class start extends World
{

    /**
     * Constructor for objects of class start.
     * 
     */
   
    public start()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(700, 495, 1); 
        prepare();

    }
   
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        dialog2 dialog2 = new dialog2();
        addObject(dialog2,601,323);
        dialog2.setLocation(598,318);
        dialog3 dialog3 = new dialog3();
        addObject(dialog3,487,343);
        dialog3.setLocation(486,334);
        dialog3.setLocation(475,335);

        startbutton startbutton = new startbutton();
        addObject(startbutton,343,218);
        startbutton.setLocation(343,175);
        startbutton.setLocation(342,147);
        rules rules = new rules();
        addObject(rules,394,188);
        rules.setLocation(362,220);
        startbutton.setLocation(372,116);
        rules.setLocation(375,209);
        ayo ayo = new ayo();
        addObject(ayo,550,221);
        dialog1 dialog1 = new dialog1();
        addObject(dialog1,205,381);
        dialog3.setLocation(363,405);
        dialog1.setLocation(218,375);
        asktoni asktoni = new asktoni();
        addObject(asktoni,278,312);
        asktoni.setLocation(277,302);
        ayo.setLocation(446,301);
        dialog2.setLocation(565,385);
    }
}
