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
        musica();
    }

    public void musica(){// Pone música de ambiente
        GreenfootSound music = new GreenfootSound("musica.mp3");
        music.setVolume(30);
        music.playLoop();
    }
    private void prepare()
    {
        addObject(flecha,69,440);
        addObject(new Start(), 170, 440);
        addObject(new Exit(), 170, 540);
    }
    public void act(){// Permite el movimiento de la flecha en el Menú inicial
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
