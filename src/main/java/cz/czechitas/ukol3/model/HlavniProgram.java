package cz.czechitas.ukol3.model;

/**
 * Spouštěcí třída celého programu
 */
public class HlavniProgram {

    public static void main(String... args) {
        Procesor procesor = new Procesor("Intel", 3000000000L);
        Pamat pamat = new Pamat(16000000000L);
        Disk disk = new Disk(512000000000L, 100000000000L);
        Pocitac ivetPocitac = new Pocitac(procesor, pamat, disk);

        System.out.println(ivetPocitac);

        ivetPocitac.zapniSe();

        ivetPocitac.vytvorSouborOVelikosti(50000000000L);
        System.out.println(ivetPocitac);

        ivetPocitac.vymazSouboryOVelikosti(30000000000L);
        System.out.println(ivetPocitac);

        ivetPocitac.vytvorSouborOVelikosti(50000000000L);
        System.out.println(ivetPocitac);

        ivetPocitac.vypniSe();
    }

}
