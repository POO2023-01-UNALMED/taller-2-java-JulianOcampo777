package test;
public class Auto {
    String modelo;
    int precio;
    Asiento[] asientos;
    String marca;
    Motor motor;
    int registro;
    static int cantidadCreados;

    int cantidadAsientos(){
        int cantidad = 0;
        for(Asiento a : this.asientos){
            if(a!= null){
                cantidad++;
            }
        }
        return cantidad;
    }

    
    
    String verificarIntegridad(){
        boolean bandera = true;
        if ( this.registro == motor.registro){
            for(Asiento asiento: this.asientos){
                if (asiento != null){
                	
                	if(asiento.registro != this.registro){
                		bandera = false;
                		break;
                	}
                }
            }
        }
        return bandera? "Auto original" : "Las piezas no son originales";
    }

}


