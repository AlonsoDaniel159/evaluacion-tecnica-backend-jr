package com.entelgy.challenge;

public class Gato extends Animal {

    public Gato(String nombre, Integer edad, String raza, Integer tiempoVida) {
        super(nombre, edad, raza, tiempoVida);
        this.tipo = TipoAnimal.GATO;
    }

    @Override
    protected String hacerSonido() {
        return "Maulla";
    }

}
