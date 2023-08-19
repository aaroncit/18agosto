package pkgEjercicio6;

import java.util.ArrayList;
import java.util.List;

public class ClsEjercicio6 {

    private String nombre;
    private double sueldo_base;
    private double descuentos;
    private double sueldo_liquido;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSueldo_base() {
        return sueldo_base;
    }

    public void setSueldo_base(double sueldo_base) {
        this.sueldo_base = sueldo_base;
    }

    public double getDescuentos() {
        return descuentos;
    }

    public void setDescuentos(double descuentos) {
        this.descuentos = descuentos;
    }

    public double getSueldo_liquido() {
        return sueldo_liquido;
    }

    public void setSueldo_liquido(double sueldo_liquido) {
        this.sueldo_liquido = sueldo_liquido;
    }

    public void ejercicio6(){
        ClsEjercicio6 ej = new ClsEjercicio6();
        List<ClsEjercicio6> Lista =new ArrayList<>();
        ej.setNombre("Juan");
        ej.setSueldo_base(3500);
        ej.setDescuentos(500);
    }
}
