/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tienda_electronicos;
public class Main {
    public static void main(String[] args) {
       
       TelefonoMovil telefono = new TelefonoMovil(599.99, "Samsung", "Galaxy S21", 128, 8);
        Tableta tableta = new Tableta(1999.99, "Sansung", "TAB7", 11, "1080x720");

        System.out.println("Telefono: "+"-Marca: " + telefono.getMarca()+" -Modelo: " + telefono.getModelo()+" -Precio: Q" + telefono.getPrecio()+" -Capacidad de almacenamiento: " + telefono.getCapacidadAlmacenamiento() + " GB"+" -Duracion de bateria: " + telefono.getDuracionBateria() + " horas");
      

        System.out.println("Tableta:" + " -Marca: " + tableta.getMarca()+ " -Modelo: " + tableta.getModelo()+" -Precio: Q" + tableta.getPrecio()+" -Tamanio de pantalla: " + tableta.getTamanoPantalla() + " pulgadas"+" -Resolucion de pantalla: " + tableta.getResolucionPantalla() );
        
    }
}