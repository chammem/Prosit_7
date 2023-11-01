package tn.esprit.gestionzoo.entities;

public class ZooFullException extends Exception {
    public ZooFullException() {
        super("The zoo is full and cannot accommodate more animals.");
    }
}
