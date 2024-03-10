package cz.czechitas.ukol3.model;

public class Disk {
    private long kapacita;
    private long vyuziteMisto;

    public Disk(long kapacita, long vyuziteMisto) {
        this.kapacita = kapacita;
        this.vyuziteMisto = vyuziteMisto;
    }

    public long getVyuziteMisto() {
        return vyuziteMisto;
    }

    public void setVyuziteMisto(long novaKapacita) {
        if (novaKapacita < 0) {
            throw new IllegalArgumentException("Nelze nastavit zápornou kapacitu.");
        }

        if (novaKapacita > kapacita) {
            throw new IllegalArgumentException("Příliš velký soubor. Nedostatek místa na disku.");
        }
        vyuziteMisto = novaKapacita;
    }

    @Override
    public String toString() {
        return String.format("Disk: kapacita=%,d B a vyuzite misto=%,d B", kapacita, vyuziteMisto);
    }
}
