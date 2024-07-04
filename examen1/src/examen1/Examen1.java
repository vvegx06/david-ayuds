/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examen1;

import javax.swing.JOptionPane;

/**
 *
 * @author andre
 */
public class Examen1 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
      
      Factura facturas = new Factura();
      facturas.getMes();
      facturas.getMontoFactu();
      
      Vendedor empleado = new Vendedor();
      empleado.NombreAgente();
      empleado.codigo();
      empleado.Vehiculo();
      empleado.Sucursal();
     
      int cantFacturas;
      double suma = 0;
      String lectura1;
      lectura1 = JOptionPane.showInputDialog("Ingrese la cantidad de fecturas realizadas");
      cantFacturas = Integer.parseInt(lectura1);
      for (int i = 0; i < cantFacturas; i++){
          suma += facturas.getMontoFactu();
      System.out.println(suma);
      }
        
        
        
      JOptionPane.showMessageDialog("El Ventedor "+ Agente.NombreAgente+ "Codigo "+ Agente.codigo+ " en el mes"+facturas.mes+"\n"+ "el vendedor "+Agente.Vehiculo+ "cuenta con vehiculo propio"+"\n"+"y trabaja en la sucursal de "+Agente.);
        
    }
}
    