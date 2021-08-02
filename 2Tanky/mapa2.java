import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class mapa2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class mapa2 extends World
{

    Victorias cont = new Victorias();
    public Tank1 tanquev = new Tank1();
    public Tank2 tanquea = new Tank2();
    public mapa2(int verde, int azul, int rondas, int rondasf)
    {    
        super(1300, 700, 1); 
        Actor cont1 = new VV(verde);
        addObject(cont1, 1250, 100);
        Actor cont2 = new VA(azul);
        addObject(cont2, 1250, 150);
        addObject(cont, 1250, 50);
        prepare();
        cont.rondas(rondas);
        cont.obtenerverde(verde);
        cont.obtenerazul(azul);
        cont.obtenerrondasf(rondasf);
    }

    
    private void prepare()
    {
        bderecha bderecha = new bderecha();
        addObject(bderecha,1,220);
        bderecha bderecha2 = new bderecha();
        addObject(bderecha2,0,483);
        bderecha2.setLocation(0,484);
        barriba barriba = new barriba();
        addObject(barriba,482,2);
        bderecha bderecha3 = new bderecha();
        addObject(bderecha3,1169,228);
        bderecha bderecha4 = new bderecha();
        addObject(bderecha4,1168,524);
        barriba barriba2 = new barriba();
        addObject(barriba2,715,694);
        barriba2.setLocation(715,698);
        linea linea = new linea();
        addObject(linea,264,210);
        linea linea2 = new linea();
        addObject(linea2,925,495);
        bcentro bcentro = new bcentro();
        addObject(bcentro,1508,288);
        removeObject(bcentro);
        removeObject(linea2);
        bcentro bcentro2 = new bcentro();
        addObject(bcentro,763,541);
        linea linea4 = new linea();
        addObject(linea2,727,124);
        bcentro bcentro5 = new bcentro();
        addObject(bcentro2,830,214);
        removeObject(bcentro2);
        removeObject(linea2);
        removeObject(linea);
        removeObject(bcentro);
        bcentro bcentro1 = new bcentro();
        addObject(bcentro,762,481);
        bcentro bcentro4 = new bcentro();
        addObject(bcentro2,410,193);
        linea linea1 = new linea();
        addObject(linea,178,491);
        linea linea3 = new linea();
        addObject(linea2,1005,147);
        linea.setLocation(165,420);
        linea.setLocation(150,535);
        linea.setLocation(157,412);
        linea.setLocation(157,176);
        linea.setLocation(164,274);
        linea.setLocation(140,283);
        Tank1 tank1 = new Tank1();
        addObject(tank1,1082,612);
        Tank2 tank2 = new Tank2();
        addObject(tank2,1080,80);
        linea.setLocation(177,270);
        linea.setLocation(156,227);
        linea.setLocation(173,269);
        linea.setLocation(163,395);
    }

    public void act(){
        if(this.getObjects(explosion.class).size() != 0){
            if(this.getObjects(Tank1.class).size() != 0){
                cont.masverde();
                cont.masrondas();
                int verde, azul, rondas, rondasf;
                boolean ganador;
                verde = cont.darverde();
                azul = cont.darazul();
                rondas = cont.darrondas();
                rondasf = cont.darrondasf();
                ganador = cont.verifrondas();
                if (ganador){// Se verifica si ya existe un ganador en caso de ser bo3 (igual en los mapas siguientes).
                    Greenfoot.setWorld(new FinalV());
                }
                else {
                    Greenfoot.setWorld(new mapa3(verde,azul,rondas,rondasf));
                }
            }
            else {
                cont.masazul();
                cont.masrondas();
                int verde, azul, rondas, rondasf;
                boolean ganador;
                ganador = cont.verifrondas();
                azul = cont.darazul();
                verde = cont.darverde();
                rondas = cont.darrondas();
                rondasf = cont.darrondasf();
                if (ganador){
                    Greenfoot.setWorld(new FinalA());
                }
                else {
                    Greenfoot.setWorld(new mapa3(verde,azul,rondas,rondasf));
                }
            }
        }
    }
}
