package Day15;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Set;

public class a8 {
    public static void main(String[] args) {
        ZonedDateTime now=ZonedDateTime.now();
        System.out.println(now);
        Set<String> availableZoneids=ZoneId.getAvailableZoneIds();
        System.out.println(availableZoneids);
    }
}
