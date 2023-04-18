import java.util.List;

public class House {
    private static int liczbaPokoi = 0;
    List<Room> pokoje;
    String adres;

    public House(String adres){
        this.pokoje = pokoje;
        this. adres = adres;
    }

    public static House createHouse(String adres){
        return  new House(adres);
    }

    public void addRoom(Room pokoj){
        pokoje.add(pokoj);
        liczbaPokoi++;
    }

    public void addRooms(List<Room> pokoje) {
        pokoje.addAll(pokoje);
        liczbaPokoi += pokoje.size();
    }
    public static int getLiczbaPokoi() {
        return liczbaPokoi;
    }
}
