import java.util.HashMap;
import java.util.Map;

public class Room {
    private String id;
    private String description;
    private Map<String, Room> exits;

    public Room(String id, String description) {
        this.id = id;
        this.description = description;
        exits = new HashMap<>();
    }

    public String getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public void setExit(String direction, Room neighbor) {
        exits.put(direction.toLowerCase(), neighbor);
    }

    public Room getExit(String direction) {
        return exits.get(direction.toLowerCase());
    }
}

