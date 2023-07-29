import javax.swing.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        int deuda = 1; int dias = 0;
        ArrayList<String> prestamos = new ArrayList<String>();
        ArrayList<String> totaldias = new ArrayList<String>();
        char respuesta;
        
        do{
            prestamos.add(JOptionPane.showInputDialog("Ingrese el valor del prestamo:"));
            respuesta= JOptionPane.showInputDialog("¿Desea ingresar mas prestamos? s/n").charAt(0);
        }while( respuesta =='s' || respuesta=='S');

        for (String prestamo : prestamos) {
            for(int i = 1;i<Integer.parseInt(prestamo);i++){
                if(deuda<=Integer.parseInt(prestamo)){
                    deuda = (deuda*2);
                    dias++;
                }
            }
            totaldias.add(String.valueOf(dias));
        }

        for(int i = 0;i<totaldias.size();i++){
            System.out.println("El préstamo de $"+prestamos.get(i)+" dólares se pagará en "+totaldias.get(i)+" días");
        }

    }

}