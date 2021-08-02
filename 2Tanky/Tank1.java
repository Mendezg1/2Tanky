import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Tank1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Tank1 extends Tanques
{
    //Ambos tanques contienen las mismas funciones, con parámetros distintos en ciertas funciones por los controles
    public void act() 
    {       //Se utilizó try/catch para evitar el mensaje de error mostrado en la Fase 2, pues no es posible eliminar el error, pero sí el mensaje.
            try{
            morir();
            // Dependiendo de las teclas presionadas, se envían como parámetro a las funciones de mover
            if (Greenfoot.isKeyDown("left")){
                mover("left");
            }
            if (Greenfoot.isKeyDown("right")){
                mover("right");
            }
            if (Greenfoot.isKeyDown("up")){
                mover("up");
            }
            if (Greenfoot.isKeyDown("down")){
                mover("down");
            }
            if (Greenfoot.isKeyDown(".")){//se envía como valor el parámetro ángulo a la función disparar
                int ang = getRotation();
                disparar1(ang);
            }
        }
        catch(Exception e){}
    } 
    public void mover(String a){//se mueve el tanque dependiendo de la tecla seleccionada, si se ubica un borde, se llama la función borde
        Actor actor = getOneIntersectingObject(bderecha.class);
        Actor actor1 = getOneIntersectingObject(linea.class);
        Actor actor2 = getOneIntersectingObject(barriba.class);
        Actor actor3 = getOneIntersectingObject(bcentro.class);
        if (a=="left"){
            if (actor != null || actor1 != null || actor2 != null || actor3 != null){
                    bordes(a);
                }
            else{
                    setRotation(90);
                    setLocation(getX()-3, getY());
                }   
        }
        if (a=="right"){
            if (actor != null || actor1 != null || actor2 != null || actor3 != null){
                    bordes(a);
                }
            else{
                    setRotation(270);
                    setLocation(getX()+3, getY());
                }
        }
        if (a=="down"){
            if (actor != null || actor1 != null || actor2 != null || actor3 != null){
                    bordes(a);
                }
            else{
                    setRotation(0);
                    setLocation(getX(), getY() + 3);
                }
        }
        if (a=="up"){
            if (actor != null || actor1 != null || actor2 != null || actor3 != null){
                    bordes(a);
                }
            else{
                    setRotation(180);
                    setLocation(getX(), getY()-3);
                }
        }
    }
    public void bordes(String b){//aleja al tanque dando la sensación de choque para que el mapa cumpla con los límites
        if (b=="left"){
            setLocation(getX()+30, getY());
        }
        if (b=="right"){
            setLocation(getX()-30, getY());
        }
        if (b=="down"){
            setLocation(getX(), getY()-30);           
        }
        if (b=="up"){
            setLocation(getX(), getY()+30);
        }
    }
    public void disparar1(int a){//se utiliza el ángulo para darle trayectoria a la bala, generada lejos del tanque para no causar problemas de
        //autodestrucción
        bala b1 = new bala();
        if(a== 90){
            getWorld().addObject(b1, getX()-getImage().getWidth(), getY());
        }
        if(a== 270){
            getWorld().addObject(b1, getX()+getImage().getWidth(), getY());
        }
        if(a== 180){
            getWorld().addObject(b1, getX(), getY()-getImage().getHeight());
        }
        if(a== 0 ){
            getWorld().addObject(b1, getX(), getY()+getImage().getHeight());
        }
        b1.setRotation(getRotation()+90);
        GreenfootSound disparo = new GreenfootSound("disparo.mp3");
        disparo.setVolume(15);
        disparo.play();
    }
    public void morir(){// se verifica si una bala impactó al tanque, si es el caso, se elimina el actor y se crea la explosión
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
