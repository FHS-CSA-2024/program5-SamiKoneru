//import stuff here?

//Your code here

public class Program5 {
    public static void main(String[] args) {
        int milesRoyale = 286;
        int galRoyale = 9;
        int milesKoopa = 412;
        int galKoopa = 40;
        int milesPipe = 361;
        int galPipe = 18;
        int milesBadwagon = 161;
        int galBadwagon = 11;
        double perGalRoyale = (double) milesRoyale / galRoyale;     //calculate by casting numerator to double
        double perGalKoopa = (double) milesKoopa / galKoopa;
        double perGalPipe = (double) milesPipe / galPipe;
        double perGalBadwagon = (double) milesBadwagon / galBadwagon;
        perGalRoyale = (int) (10 * perGalRoyale + 0.5) / 10.0;    //round using int and then double casting
        perGalKoopa = (int) (10 * perGalKoopa + 0.5) / 10.0;
        perGalPipe = (int) (10 * perGalPipe + 0.5) / 10.0;
        perGalBadwagon = (int) (10 * perGalBadwagon + 0.5) / 10.0;
        System.out.println("Mushroom Cup Prix Racer Average Miles/Per Gallon:");    //printing output
        System.out.println("Royale averaged " + perGalRoyale + " mi/gal");
        System.out.println("Koopa King averaged " + perGalKoopa + " mi/gal");
        System.out.println("Pipe Frame averaged " + perGalPipe + " mi/gal");
        System.out.print("Badwagon averaged " + perGalBadwagon + " mi/gal");
        
    }
}

//Paste console output below:
/*
Mushroom Cup Prix Racer Average Miles/Per Gallon:
Royale averaged 31.8 mi/gal
Koopa King averaged 10.3 mi/gal
Pipe Frame averaged 20.1 mi/gal
Badwagon averaged 14.6 mi/gal

*/
