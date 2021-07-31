import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Menu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Menu extends World
{
    int opcion = 0;
    flecha flecha = new flecha();
    /**
     * Constructor for objects of class Menu.
     * 
     */
    public Menu()
    { 
        super(1083, 600, 1); 
        prepare();
        
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        addObject(flecha,69,440);
        addObject(new Start(), 170, 440);
        addObject(new Exit(), 170, 540);
    }
    public void act(){//permite que el jugador pueda seleccionar las opciones del menu
        if((Greenfoot.isKeyDown("W") ||Greenfoot.isKeyDown("up")) && opcion!=0){opcion++;}
        if(Greenfoot.isKeyDown("S") ||Greenfoot.isKeyDown("down") && opcion!=1){opcion--;}
        if(opcion >= 2) opcion=0;
        if(opcion<0)opcion=1;
        flecha.setLocation(69, 440 + (opcion*100));
        if(Greenfoot.isKeyDown("SPACE")||Greenfoot.isKeyDown("ENTER")){
            switch(opcion){
            case 0:
                Greenfoot.setWorld(new Instrucciones());
                
            case 1:
                Greenfoot.stop();
                break;
            }
        }
    }
    
}
