import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Tank2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Tank2 extends Tanques
{
    
    public void act() 
    {
            try{
            morir();
            if (Greenfoot.isKeyDown("A")){
                mover("A");
            }
            if (Greenfoot.isKeyDown("D")){
                mover("D");
            }
            if (Greenfoot.isKeyDown("W")){
                mover("W");
            }
            if (Greenfoot.isKeyDown("S")){
                mover("S");
            }
            if (Greenfoot.isKeyDown("space")){
                int ang = getRotation();
                disparar(ang);
            }
        }
        catch(Exception e){
        }
        
    } 
    public void disparar(int a){
            if(a== 90){
                bala b1 = new bala();
                getWorld().addObject(b1, getX()-getImage().getWidth(), getY());
                b1.setRotation(getRotation()+90);
            }
            if(a== 270){
                bala b1 = new bala();
                getWorld().addObject(b1, getX()+getImage().getWidth(), getY());
                b1.setRotation(getRotation()+90);
            }
            if(a== 180){
                bala b1 = new bala();
                getWorld().addObject(b1, getX(), getY()-getImage().getHeight());
                b1.setRotation(getRotation()+90);
            }
            if(a== 0 ){
                bala b1 = new bala();
                getWorld().addObject(b1, getX(), getY()+getImage().getHeight());
                b1.setRotation(getRotation()+90);
            }
            GreenfootSound disparo = new GreenfootSound("disparo.mp3");
            disparo.setVolume(15);
            disparo.play();
    }
    public void mover(String a){
        Actor actor = getOneIntersectingObject(bderecha.class);
        Actor actor1 = getOneIntersectingObject(linea.class);
        Actor actor2 = getOneIntersectingObject(barriba.class);
        Actor actor3 = getOneIntersectingObject(bcentro.class);
        if (a=="A"){
            if (actor != null || actor1 != null || actor2 != null || actor3 != null){
                    bordes(a);
                }
            else{
                    setRotation(90);
                    setLocation(getX()-3, getY());
                }   
        }
        if (a=="D"){
            if (actor != null || actor1 != null || actor2 != null || actor3 != null){
                    bordes(a);
                }
            else{
                    setRotation(-90);
                    setLocation(getX()+3, getY());
                }
        }
        if (a=="S"){
            if (actor != null || actor1 != null || actor2 != null || actor3 != null){
                    bordes(a);
                }
            else{
                    setRotation(0);
                    setLocation(getX(), getY() + 3);
                }
        }
        if (a=="W"){
            if (actor != null || actor1 != null || actor2 != null || actor3 != null){
                    bordes(a);
                }
            else{
                    setRotation(180);
                    setLocation(getX(), getY()-3);
                }
        }
    }
    public void bordes(String b){
        if (b=="A"){
            setLocation(getX()+30, getY());
        }
        if (b=="D"){
            setLocation(getX()-30, getY());
        }
        if (b=="S"){
            setLocation(getX(), getY()-30);           
        }
        if (b=="W"){
            setLocation(getX(), getY()+30);
        }
    }
    public void morir(){
        Actor bala = getOneIntersectingObject(bala.class);
        if(bala != null){
            explosion exp = new explosion();
            GreenfootSound explo = new GreenfootSound("explosion.mp3");
            explo.setVolume(25);
            explo.play();
            getWorld().addObject(exp, getX(), getY());
            getWorld().removeObject(this);
        }
    }
}
