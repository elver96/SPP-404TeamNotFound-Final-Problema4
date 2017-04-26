/*
404TeamNotFound
Elver Iram Jiménez Rodríguez A01196327
Luis Mario de Leija Piñón         A01410385
Luis  Montiel Rocha                 A01410588
Pablo Serrano Hernandez        A01410753
Rubén Daniel Baez Muñíz        A01411504
*/
package spp.pkg404teamnotfound.pfinal4;

import javax.swing.JOptionPane;
import java.util.Scanner;
/**
 *
 * @author elver
 */
public class SPP404TeamNotFoundPFinal4 {

    /**
     * @param args the command line arguments
     */
  public static void main(String[] args) {
    int [] inventario=new int[222];  
        int []ventas=new int [444];
        JOptionPane.showMessageDialog(null,"Proyecto Final. Programa 4");
        int x=0;                            
        
        
        for (int w=0;w<232;w++){    
        x= opcion();  
        switch(x){
            case 0:
                JOptionPane.showMessageDialog(null,"Ingrese las caracteristicas de un producto");
                String me= "Ingrese el precio del producto";
                String nombre=inventarioNombre();              
                inventario[w]=inventarioValor(me);
                int u=w+1;
                JOptionPane.showMessageDialog(null,"El nombre del producto recien registrado es "+nombre+". La clave del producto sera= "+u);
                break;
            case 1:
                int n;
                int y;               
                String ma="Ingrese la clave del producto que desee vender";
                n=inventarioValor(ma);
                
                y=inventario[n-1];
                if(y>0){
                   ventas[w]=n; 
                }else{
                    JOptionPane.showMessageDialog(null, "La clave ingresada no cuenta con ningun valor");
                }   
                break;
            case 2:
                sumaTotal(inventario,ventas);
                System.exit(0);
                break;
        } 
        }
        
        
        }
    
public static void sumaTotal(int[]inventario,int[] ventas){
    int suma=0;
    int n=0;
    int g;
    for (int i=0;i<ventas.length;i++){
        if (ventas[i]>0){
            g=ventas[i]-1;
          n= inventario[g];
            suma=suma+n;
        }else{
            suma=suma;
        }         
    }
    
    JOptionPane.showMessageDialog(null,"La suma total de la venta que usted desea seria de "+suma+"¡Hasta luego!");       
}
public static int opcion(){
    String[]opciones ={"Inventario","Vender","Salir"};
     int x=JOptionPane.showOptionDialog(null
                ,"Escoje entre las siguientes opciones"
                ,null
                ,JOptionPane.DEFAULT_OPTION
                ,JOptionPane.INFORMATION_MESSAGE
                ,null
                ,opciones
                ,null
             );
     return x;
}

public static int inventarioValor(String me){
    int n=0;    
    Scanner kb=new Scanner(System.in);
    boolean flag;
    do{
    try{
        String x=JOptionPane.showInputDialog(null,me);
        n=new Integer (x);
        flag=false;
    }catch (Exception er){
        JOptionPane.showMessageDialog(null,"Intententelo de nuevo");
        kb.nextLine();
        flag=true;
    }
    }while(flag);      
    return n;
}
public static String inventarioNombre(){
    String x=JOptionPane.showInputDialog(null,"Ingrese el nombre del producto");
return x;
}
}