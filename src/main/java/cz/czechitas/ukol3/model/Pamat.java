package cz.czechitas.ukol3.model;

public class Pamat {
    private long kapacita;

    public Pamat(long kapacita) {
        this.kapacita = kapacita;
    }

    @Override
    public String toString() {
        return String.format("Pamet: kapacita=%,d B", kapacita);
    }
}