public class Main {

    public static double calcCircleArea(double radius){   // Übergabe Radius in [m]

        if(radius <0 )              // negativer Radius nicht erlaubt --> Rückgabe -1
            return -1.0;

            double pi = 3.14;
            double flaeche = radius *  radius * pi;
            double flaeche_gerundet = (int) (flaeche * 100.0) / 100.0;
        return flaeche_gerundet;
    }

    public static int calcFakultaet(int  n){

        if(n < 0)
            return -1;

        int fak =1;
        for (int i = 1; i<= n; i++)
            fak = fak * i;

        return fak;
    }

    public static boolean checkPrim(int n){
        if(n < 2)
            return false;
        if (n == 2)
            return true;

if(n % 2 == 0)
    return false;

        int Wurzel = (int) Math.sqrt(n);

    for (int i = 3; i <= Wurzel ; i= i+2)
        if(n % i == 0)
            return false;

        return true;
    }



    public static void main(String[] args) {
        // Fest auf Flächenberechnung
    double rad = 1.74;                           // in mMeter
    double area = calcCircleArea(rad);
    System.out.println("Flächenberechnung über Radius " + rad + "m: "+ area + " m^2");

    //Test auf Fakultät
    int fak =-1;
    System.out.println( " Die Fakultät von " + fak + "! ist " + calcFakultaet(fak));

    //Primzahltest
    int prim = 97;
        System.out.println("Kontrolle der Primzahl " + prim + ": " + checkPrim(prim) );

    }
}