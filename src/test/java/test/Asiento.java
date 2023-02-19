package test;
public class Asiento {
    String color;
    int precio;
    int registro;


    void cambiarColor(String color){
        if(  color.equals("rojo") || color.equals("verde") ||  color.equals("blanco") || color.equals("amarillo") || color.equals("negro")){
            this.color = color;
        }
    }
}
