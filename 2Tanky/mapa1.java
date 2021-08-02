import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class mapa1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class mapa1 extends World
{
    Victorias cont = new Victorias();
    public Tank1 tanquev = new Tank1();
    public Tank2 tanquea = new Tank2();
    public mapa1(int verde, int azul, int rondas, int rondasf)
    {    // Se actualizan los valores de la clase Victorias y se crean los contadores (igual en mapa 2,3 y 4)
        super(1300, 700, 1); 
        prepare();
        Actor cont1 = new VV(verde);
        addObject(cont1, 1250, 100);
        Actor cont2 = new VA(azul);
        addObject(cont2, 1250, 150);
        addObject(cont, 1250, 50);
        cont.rondas(rondas);
        cont.obtenerverde(verde);
        cont.obtenerazul(azul);
        cont.obtenerrondasf(rondasf);
    }
    private void prepare()
    {
        barriba barriba = new barriba();
        addObject(barriba,704,3);
        barriba barriba2 = new barriba();
        addObject(barriba2,549,691);
        barriba2.setLocation(559,696);
        bderecha bderecha = new bderecha();
        addObject(bderecha,3,224);
        bderecha bderecha2 = new bderecha();
        addObject(bderecha2,1196,480);
        bderecha2.setLocation(1198,475);
        bderecha2.setLocation(1198,475);
        bcentro bcentro = new bcentro();
        addObject(bcentro,663,188);
        bcentro bcentro2 = new bcentro();
        addObject(bcentro2,536,491);
        linea linea = new linea();
        addObject(linea,631,24);
        linea.setLocation(632,84);
        linea.setLocation(635,255);
        linea.setLocation(568,231);
        linea.setLocation(566,246);
        linea.setLocation(559,257);
        linea.setLocation(588,217);
        linea.setLocation(592,256);
        linea.setLocation(597,334);
        linea.setLocation(682,610);
        linea linea2 = new linea();
        addObject(linea2,371,143);
        Tank1 tank1 = new Tank1();
        addObject(tank1,38,36);
        Tank2 tank2 = new Tank2();
        addObject(tank2,1145,657);
        tank1.setLocation(425,572);
        tank1.setLocation(80,49);
        tank2.setLocation(1131,622);
        tank1.setLocation(55,94);
        bcentro2.setLocation(628,553);
        bcentro2.setLocation(556,556);
        bcentro2.setLocation(560,556);
        bderecha bderecha3 = new bderecha();
        addObject(bderecha3,1194,230);
        bderecha3.setLocation(1196,211);
        bderecha bderecha4 = new bderecha();
        addObject(bderecha4,14,484);
        bderecha4.setLocation(2,484);
        bderecha4.setLocation(4,465);
        bderecha2.setLocation(1196,395);
        bderecha4.setLocation(0,618);
        bderecha4.setLocation(1,621);
        bderecha bderecha5 = new bderecha();
        addObject(bderecha5,1188,493);
        bderecha5.setLocation(1194,530);
        bderecha5.setLocation(1196,636);
        bderecha4.setLocation(5,520);
        tank1.setLocation(416,89);
        tank2.setLocation(608,624);
        tank1.setLocation(443,92);
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
                if (ganador){
                    Greenfoot.setWorld(new FinalV());
                }
                else {
                    Greenfoot.setWorld(new mapa2(verde,azul,rondas,rondasf));
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
                    Greenfoot.setWorld(new mapa2(verde,azul,rondas,rondasf));
                }
            }
        }
    }
}
