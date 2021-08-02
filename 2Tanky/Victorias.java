import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Victorias here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Victorias extends Actor
{
    // Esta clase contiene los valores de las rondas pasadas, las victorias por tanque y las rondas a cumplir (bo3 o bo5). Tiene funciones para sumar y 
    // devolver el valor deseado, victorias del verde, azul, rondas pasadas, rondas a cumplir.
    int verde;
    int azul;
    int rondas;
    int rondasf;
    public void act() 
    {
        setImage(new GreenfootImage(100, 20));
        GreenfootImage img = getImage();
        Font font = img.getFont();
        img.setFont(font.deriveFont(20.0F));
        img.drawString("Victorias : ",1,18);
    } 
    public void obtenerverde(int v){
        verde = v;
    }
    public void obtenerazul(int v){
        azul = v;
    }
    public void rondas(int v){
        rondas = v;
    }
    public void masverde(){
        verde++;
    }
    public void masazul(){
        azul++;
    }
    public void masrondas(){
        rondas++;
    }
    public int darverde(){
        return verde;
    }
    public int darazul(){
        return azul;
    }
    public int darrondas(){
        return rondas;
    }
    public int darrondasf(){
        return rondasf;
    }
    public void obtenerrondasf(int v){
        rondasf = v;
    }
    public boolean verifrondas(){
        if (rondasf == 3){
            if (verde == 2){
                return true;
            }
            else if (azul == 2){
                return true;
            }
            else {
                return false;
            }
        }
        else if(rondasf == 5){
            if (verde == 3){
                return true;
            }
            else if (azul == 3){
                return true;
            }
            else {
                return false;
            }
        }
        else return false;
    }
}
