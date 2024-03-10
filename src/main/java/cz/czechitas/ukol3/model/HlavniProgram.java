package cz.czechitas.ukol3.model;

/**
 * Spouštěcí třída celého programu
 */
public class HlavniProgram {

    public static void main(String... args) {
        Procesor procesor = new Procesor("Intel", 3_000_000_000L);
        Pamat pamat = new Pamat(16_000_000_000L);
        Disk disk = new Disk(512_000_000_000L, 100_000_000_000L);
        Pocitac ivetPocitac = new Pocitac(procesor, pamat, disk);

        System.out.println(ivetPocitac);

        ivetPocitac.zapniSe();

        ivetPocitac.vytvorSouborOVelikosti(50_000_000_000L);
        System.out.println(ivetPocitac);

        ivetPocitac.vymazSouboryOVelikosti(30_000_000_000L);
        System.out.println(ivetPocitac);

        ivetPocitac.vytvorSouborOVelikosti(50_000_000_000L);
        System.out.println(ivetPocitac);

        ivetPocitac.vypniSe();
    }

}
