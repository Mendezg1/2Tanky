import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Instrucciones here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Instrucciones extends World
{
    Click click = new Click();
    public Instrucciones()
    {    
        super(1083, 700, 1); 
        addObject(click, 1083/2,680);
    }
    public void act(){//Es una imagen creada para explicar los controles, la función permite continuar con un click.
        if(Greenfoot.mouseClicked(click))
            Greenfoot.setWorld(new Menu2());
    }
}
