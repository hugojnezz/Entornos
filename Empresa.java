package Empresa;

import java.util.ArrayList;

public class Empresa {
    public static void main(String[] args) {

        //Creamos dos jefes de prueba
        ArrayList<Jefe> jefes = new ArrayList<Jefe>();
        Jefe jefe1 = new Jefe("Jefe1",555555,88888888);
        jefes.add(jefe1);
        Jefe jefe2 = new Jefe("Jefe2",666666);
        jefe2.asignarPpto(11111111);
        jefes.add(jefe2);

        //Creamos dos curritos
        ArrayList<Currito> curritos = new ArrayList<Currito>();
        Currito currito1 = new Currito("Currito1",222222,"Jefe1");
        curritos.add(currito1);
        Currito currito2 = new Currito("Currito2",999999);
        currito2.asignarJefe("Jefe2");
        curritos.add(currito2);

        System.out.println(jefe1);
        System.out.println(jefe2);
        System.out.println(currito1);
        System.out.println(currito2);
    }
}
