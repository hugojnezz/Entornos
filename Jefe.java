package Empresa;

public class Jefe extends Empleado{

    private int pptoDpto;

    public Jefe(String nombre, int sueldo, int pptoDpto) {
        super(nombre, sueldo);
        this.pptoDpto = pptoDpto;
    }

    public Jefe(String nombre, int sueldo) {
        super(nombre, sueldo);
        this.pptoDpto = 0;
    }

    public void asignarPpto (int pptoDpto){
        this.pptoDpto=pptoDpto;
    }

    @Override
    public String toString() {
        return super.toString() +
                " pptoDpto= " + pptoDpto;
    }


}
