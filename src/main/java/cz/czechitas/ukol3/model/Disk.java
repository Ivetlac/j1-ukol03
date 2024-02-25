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
        if (novaKapacita > kapacita) {
            System.err.println("Nelze vytvaret soubory, nedostatek mista na disku.");
        }
        vyuziteMisto = novaKapacita;
    }
    @Override
    public String toString() {
        return String.format("Disk: kapacita=%,d B a vyuzite misto=%,d B", kapacita, vyuziteMisto);
    }
}
