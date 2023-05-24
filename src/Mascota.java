import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.JOptionPane;

public class Mascota {
    // Atributos
    int codigo;
    String nombre;
    String especie;
    String accion;
    String cualidad;
    int edad;

    public Mascota() {
    }

    public void ingresar() {
        nombre = JOptionPane.showInputDialog("Ingrese nombre de la mascota");
        especie = JOptionPane.showInputDialog("Ingrese la especie de mascota");
        accion = JOptionPane.showInputDialog("Ingrese la acción de la mascota");
        cualidad = JOptionPane.showInputDialog("Ingrese la cualidad de la mascota");
        edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad del animal"));
    }


    public Mascota(String nombre, String especie, int edad, String accion, String cualidad) {
        this.nombre = nombre;
        this.especie = especie;
        this.edad = edad;
        this.accion = accion;
        this.cualidad = cualidad;
    }

   
    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Especie: " + especie);
        System.out.println("Edad: " + edad + " años");
        System.out.println("Acción: " + accion);
        System.out.println("Cualidad: " + cualidad);
    }

    
    public void hacerSonido() {
        if (especie.equalsIgnoreCase("perro")) {
            System.out.println("¡Guau guau!");
        } else if (especie.equalsIgnoreCase("gato")) {
            System.out.println("¡Miau miau!");
        } else if (especie.equalsIgnoreCase("paloma")) {
            System.out.println("¡Rrrrrrr, rrrrrrr!");
        } else if (especie.equalsIgnoreCase("vaca")) {
            System.out.println("¡Muu muu!");
        } else {
            System.out.println("La mascota no hace sonidos conocidos.");
        }
    }

  
    public void obtenerAccionMascota() {
        if (accion.equalsIgnoreCase("perro")) {
            System.out.println("Corre");
        } else if (accion.equalsIgnoreCase("gato")) {
            System.out.println("Corre");
        } else if (accion.equalsIgnoreCase("paloma")) {
            System.out.println("Vuela");
        } else if (accion.equalsIgnoreCase("vaca")) {
            System.out.println("Camina");
        } else {
            System.out.println("La acción no fue reconocida");
        }
    }

    
    public void obtenerCualidadMascota() {
        if (cualidad.equalsIgnoreCase("perro")) {
            System.out.println("Olfatea");
        } else if (cualidad.equalsIgnoreCase("gato")) {
            System.out.println("Cazador");
        } else if (cualidad.equalsIgnoreCase("paloma")) {
            System.out.println("Inteligente");
        } else if (cualidad.equalsIgnoreCase("vaca")) {
            System.out.println("Da leche");
        } else {
            System.out.println("La cualidad no fue reconocida");
        }
    }
}