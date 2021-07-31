import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class VV here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class VV extends Actor
{
    /**
     * Act - do whatever the VV wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public int v;
    public VV(int valor){
        setImage(new GreenfootImage(100, 20));
        GreenfootImage img = getImage();
        Font font = img.getFont();
        img.setFont(font.deriveFont(20.0F));
        v += valor;
        actualizar();
    }
    public void act() 
    {
        actualizar();
    }    
    private void actualizar(){
        GreenfootImage img = getImage();
        img.clear();
        img.drawString("V :  "+v,1,18);
    }
}
