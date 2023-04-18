import java.util.List;

public class Room {
    String nazwa;
    double powierzchnia;
    List<Furniture> meble;

    public Room(String nazwa, double powierzchnia, List<Furniture> meble){
        this.nazwa = nazwa;
        this.powierzchnia = powierzchnia;
        this.meble = meble;
    }

    public Room sumaMebliVat(){
        double calkowitaCenaVat = 0;
        for (Furniture furniture: meble){
            calkowitaCenaVat += furniture.getPriceVat();
        }
        return sumaMebliVat();
    }
}
