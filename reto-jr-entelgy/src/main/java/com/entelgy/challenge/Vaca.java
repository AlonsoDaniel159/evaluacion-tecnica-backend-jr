package com.entelgy.challenge;

public class Vaca extends Animal {

    public Vaca(String nombre, Integer edad, String raza, Integer tiempoVida) {
        super(nombre, edad, raza, tiempoVida);
        this.tipo = TipoAnimal.VACA;
    }

    @Override
    protected String hacerSonido() {
        return "Muge";
    }
}
