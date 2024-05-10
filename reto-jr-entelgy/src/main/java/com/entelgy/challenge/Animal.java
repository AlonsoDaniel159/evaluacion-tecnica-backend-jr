package com.entelgy.challenge;

import com.entelgy.challenge.exception.AnimalNotFoundException;

public abstract class Animal {
    protected String nombre;
    protected Integer edad;
    protected String raza;
    protected Integer tiempoVida;
    protected TipoAnimal tipo;

    public Animal(String nombre, Integer edad, String raza, Integer tiempoVida) {
        this.nombre = nombre;
        this.edad = edad;
        this.raza = raza;
        this.tiempoVida = tiempoVida;
    }

    protected abstract String hacerSonido();

    protected void describir(String nombre) throws AnimalNotFoundException {
        if(!nombre.equalsIgnoreCase(this.nombre)) throw new AnimalNotFoundException();

        String description = this.nombre + " es un/una " + this.tipo.toString().toLowerCase() + " de raza " + this.raza +
                " que tiene " + this.edad + " años de edad. " +
                "Siempre " + hacerSonido() + " cuando está feliz. Su expectativa de vida es de " +
                this.tiempoVida + " años.";
        System.out.println(description);
    }
}
