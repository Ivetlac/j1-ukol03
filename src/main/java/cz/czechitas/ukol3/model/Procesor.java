package cz.czechitas.ukol3.model;

public class Procesor {
    private String vyrobce;
    private long rychlost;

    public Procesor(String vyrobce, long rychlost) {
        this.vyrobce = vyrobce;
        this.rychlost = rychlost;
    }

    @Override
    public String toString() {
        return String.format("Procesor: vyrobce=%s, rychlost=%,d Hz", vyrobce, rychlost);
    }
}
