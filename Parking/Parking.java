import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.UUID;

public class Parking{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Locations loc1 = new Locations(1, "83 Main St", 1, 20, 5);
        Locations loc2 = new Locations(2, "Market Street", 10, 20, 5);
        Locations loc3 = new Locations(3, "Clarkson Ave", 10, 20, 5);

        List<Locations> newyorkList = new ArrayList<>();
        newyorkList.add(loc1);
        newyorkList.add(loc2);
        newyorkList.add(loc3);

        CityLocations cityLoc1 = new CityLocations("New York", newyorkList);
        CityLocations cityLoc2 = new CityLocations("Chicago", newyorkList);
        CityLocations cityLoc3 = new CityLocations("Boston", newyorkList);

        System.out.println("Select your city");
        System.out.println("1. New York");
        System.out.println("2. Chicago");
        System.out.println("3. Boston");

        int cityIndex = sc.nextInt();

        List<Locations> pList = List.of();
        switch(cityIndex){
            case 1: 
                pList = cityLoc1.gLocations();
                break;
            case 2: 
                pList = cityLoc2.gLocations();
                break;
            case 3: 
                pList = cityLoc3.gLocations();
                break;
            default:
                System.out.println("Invalid input");
                return;
        }

        System.out.println("Available Parking Locations:");
        for(Locations l : pList){
            System.out.println(l.id+" "+l.address+" "+l.smallTotal+" "+l.mediumTotal+" "+l.largeTotal);
        } 

        System.out.println("Select Parking Location by ID:");
        int locId = sc.nextInt();
        System.out.println("Enter Vehicle Size (1. small, 2. medium, 3. large):");
        int vehicleSize = sc.nextInt();
        System.out.print("Enter vehicle number: ");
        String vehicleNumber = sc.next();

        Parkthecar parkthecar = new Parkthecar();
        if(parkthecar.park(locId, pList, vehicleSize)) System.out.println("Car parked, Here is the ticket number" + UUID.randomUUID());
        else System.out.println("Try another location");

        if(parkthecar.park(locId, pList, vehicleSize)) System.out.println("Car parked, Here is the ticket number" + UUID.randomUUID());
        else System.out.println("Try another location");
    }
}