import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class bala here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class bala extends Mover
{
    /**
     * Act - do whatever the bala wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        move(5);
        Actor pared = getOneIntersectingObject(Borde.class);
        if(pared != null)
            getWorld().removeObject(this);
            
        else if(getWorld().getObjects(explosion.class).size() != 0){
            getWorld().removeObject(this);
        }
    }    
}
