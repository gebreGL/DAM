/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecciones;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
/**
 *
 * @author a21gebremedingl
 */
public class Colecciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> array = new ArrayList <>();
        int num = 0;
        int media = 0;
        int suma = 0;
        int contador = 0;
        boolean comprobar = true;
        System.out.println("");
        System.out.println("Introduzca números para guardar en un ArrayList: ");
        while (comprobar) {
            System.out.print("  · ");
            num = sc.nextInt();
            array.add(num);
            contador++;
            if (num == 0) {
                comprobar = false;
            }
            
        }
        
        //
        
        //Prueba para tag
        
        //esta linea
        //Ahora es mio muahahhaha (Manu)
        //Buenaaas (Nuria)
        //weeeeee(iagoL)
        //Faltaba yo xd (Gebre)
        // En Portugués, "perejil" se dice "salsa"
        // entonces puedes llegar a la jocosa situación de estar en
        // un restaurante en Portugal y para pedir algo con salsa de perejil
        // tendrías que decir "Quero salsa salsa" (Javier xd)
        //Javi eres un pesao (Damián)
        
        //Amosalos
        System.out.println("");
        Iterator iter = array.iterator();
        System.out.println("VALORES ARRAYLIST");
        while (iter.hasNext()) {
            suma += (Integer) iter.next();
            System.out.print(iter.next() + " ");
        }
        System.out.println(""); 
        System.out.println("");
        System.out.println("SUMA: " + suma);
        System.out.println("");
        System.out.println("MEDIA: " + (suma/contador));
        
    }
    
}
