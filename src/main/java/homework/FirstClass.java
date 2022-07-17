package homework;

import java.util.concurrent.atomic.AtomicStampedReference;

public class FirstClass {
    public static void main(String[] args) {
        System.out.println("3 majasdarbs ");

        String valstsNosaukums = "Igaunija";
        int iedzivotajuSkaits = 13000000;
        double platiba = 45339.0;
        String galvaspilseta = "Tallinn";
        String valstsValoda = "Igaunu";
        boolean EsDalibvalsts = true;
        char valstsValuta = '€';

        System.out.println("Valsts nosaukums: " + valstsNosaukums);
        System.out.println("Galvaspilseta: " + galvaspilseta);
        System.out.println("Iedzivotaju skaits: " + iedzivotajuSkaits);
        System.out.println("Platiba: " + platiba);
        System.out.println("Valsts valoda: " + valstsValoda);
        System.out.println("Valsts valuta: " + valstsValuta);
        System.out.println("Vai ir ES dalibvaltsts: " + EsDalibvalsts);


        System.out.println(  valstsNosaukums + " ir lielaka valsts Baltija. " + galvaspilseta + " - skaistaka pilseta. " + valstsNosaukums + "s platiba: " + platiba + ".");


        String teikumsarformatuStringFormat = String.format("Iedzivotaju skaits vienads ar %s , oficiala valoda ir %s.", iedzivotajuSkaits, valstsValoda);

        System.out.println(teikumsarformatuStringFormat);

        //Aritmētiskie vienādojumi!

        int x = 1;
        int y = 3;
        int z = 5;

        int piemers1 = x - y + z;
        System.out.println(piemers1);

        int piemers2 = y * z / x;
        System.out.println(piemers2);

        int piemers3 = z * y - x;
        System.out.println(piemers3);
    }
}
