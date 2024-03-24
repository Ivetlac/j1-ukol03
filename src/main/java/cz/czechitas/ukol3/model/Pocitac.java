package cz.czechitas.ukol3.model;

public class Pocitac {
    private boolean jeZapnuty;
    private Procesor cpu;
    private Pamat ram;
    private Disk pevnyDisk;

    public Pocitac(Procesor cpu, Pamat ram, Disk pevnyDisk) {
        this.cpu = cpu;
        this.ram = ram;
        this.pevnyDisk = pevnyDisk;
    }

    public boolean jeZapnuty() {
        return jeZapnuty;
    }

    public void zapniSe() {
        if (jeZapnuty) {
            System.err.println("Pocitac je jiz zapnuty.");
        } else if (cpu == null || ram == null || pevnyDisk == null) {
            System.err.println("Nelze zapnout pocitac. Chybi procesor, pamet nebo pevny disk.");
        } else {
            jeZapnuty = true;
            System.out.println("Pocitac se zapnul.");
        }
    }

    public void vypniSe() {
        if (!jeZapnuty) {
            System.err.println("Pocitac neni zapnuty.");
        } else {
            jeZapnuty = false;
            System.out.println("Pocitac se vypnul.");
        }
    }

    public void vytvorSouborOVelikosti(long velikost) {
        if (!jeZapnuty) {
            System.out.println("Pocitac neni zapnuty.");
            return;
        }

        long novaKapacita = pevnyDisk.getVyuziteMisto() + velikost;
        try {
            pevnyDisk.setVyuziteMisto(novaKapacita);
            System.out.println("Soubor  byl vytvoren.");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    public void vymazSouboryOVelikosti(long velikost) {
        if (!jeZapnuty) {
            System.out.println("Pocitac neni zapnuty.");
            return;
        }

        long noveVyuziteMisto = pevnyDisk.getVyuziteMisto() - velikost;
        if (noveVyuziteMisto < 0) {
            System.out.println("Nelze smazat soubory. Nedostatek volneho mista na disku.");
            return;
        }

        try {
            pevnyDisk.setVyuziteMisto(noveVyuziteMisto);
            System.out.println("Soubory byly smazany.");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public String toString() {
        return String.format("Pocitac: zapnuty=%b\n%s\n%s\n%s", jeZapnuty, cpu, ram, pevnyDisk);
    }
}
