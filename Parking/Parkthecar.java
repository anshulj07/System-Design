import java.util.List;

public class Parkthecar {

    // returns true if parked, false if not (invalid locId or no space)
    public boolean park(int locId, List<Locations> list, int size) {
        for (Locations l : list) {
            if (l.id == locId) {
                if (size == 1) { 
                    if (l.smallAvailable > 0) {
                        l.smallAvailable--;
                        return true;
                    }
                    return false;
                } else if (size == 2) { // medium
                    if (l.mediumAvailable > 0) {
                        l.mediumAvailable--;
                        return true;
                    }
                    return false;
                } else if (size == 3) { // large
                    if (l.largeAvailable > 0) {
                        l.largeAvailable--;
                        return true;
                    }
                    return false;
                } else {
                    return false; // invalid size
                }
            }
        }
        return false; // locId not found
    }
}
