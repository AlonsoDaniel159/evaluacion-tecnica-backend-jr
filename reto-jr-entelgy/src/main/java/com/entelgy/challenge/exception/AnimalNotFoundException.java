package com.entelgy.challenge.exception;

public class AnimalNotFoundException extends RuntimeException{
    @Override
    public String getMessage() {
        return "Animal no encontrado";
    }
}
