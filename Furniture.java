public class Furniture {
    private static final int watoscVat = 22;

    String nazwa;
    double cena;

    public Furniture(String nazwa, double cena){
        this.nazwa = nazwa;
        this.cena = cena;
    }

    public double getCena() {
        return cena;
    }

    public double getPriceVat(){
        double cenaVat = cenaVat = cena * (1 + watoscVat/100);;
        return cenaVat;
    }

}
