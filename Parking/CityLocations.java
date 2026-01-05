import java.util.List;

public class CityLocations{
    String city;
    List<Locations> list;

    public CityLocations(String city, List<Locations> list) {
        this.city = city;
        this.list = list;
    }

    public List<Locations> gLocations(){
        return list;
    }
}