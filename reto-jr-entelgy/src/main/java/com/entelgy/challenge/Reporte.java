package com.entelgy.challenge;

import com.entelgy.challenge.exception.AnimalNotFoundException;

public class Reporte {
    public static void main(String[] args) throws AnimalNotFoundException {
        Animal[] animales = Reporte.cargarDatos();
        animales[7].describir("Lucera");
    }

    public static Animal[] cargarDatos() {
        Animal[] animales = new Animal[9];

        // PERROS
        animales[0] = new Perro("Pepe",6, "Bulldog",10);
        animales[1] = new Perro("Juan",10, "Beagle",15);
        animales[2] = new Perro("Diego",2, "Poodle",8);

        // GATOS
        animales[3] = new Gato("Luigi",4, "raza1",15);
        animales[4] = new Gato("Tom",3, "raza2",20);
        animales[5] = new Gato("Romeo",1, "raza3",16);

        // VACAS
        animales[6] = new Vaca("Linda",10, "Angus",15);
        animales[7] = new Vaca("Lucera",12, "Brangus",20);
        animales[8] = new Vaca("Mariela",9, "Holstein",13);

        return animales;
    }
}

