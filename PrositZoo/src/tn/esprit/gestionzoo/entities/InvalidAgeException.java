package tn.esprit.gestionzoo.entities;

public class InvalidAgeException extends Exception {
    public InvalidAgeException() {
        super("Invalid age: The age of the animal cannot be negative.");
    }
}
