package com.entelgy.challenge;

public class Perro extends Animal {

    public Perro(String nombre, Integer edad, String raza, Integer tiempoVida) {
        super(nombre, edad, raza, tiempoVida);
        this.tipo = TipoAnimal.PERRO;
    }

    @Override
    protected String hacerSonido() {
        return "Ladra";
    }
}
