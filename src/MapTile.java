import java.util.*;

public class MapTile {
    int x;
    int y;

    public MapTile(int x, int y){
        this.x = x;
        this.y = y;
    }
    public int hashCode(){
        final int prime = 31;
        int result = 1;
        result = prime * result + x;
        result = prime * result + y;
        return result;
    }


    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        MapTile other = (MapTile) obj;
        if (x != other.x || y != other.y)
            return false;
        return true;
    }
    public List<MapTile> adjacent_moves() {
        List<MapTile> adjacents = new ArrayList<>();
        adjacents.add(new MapTile(x + 1, y)); // Right
        adjacents.add(new MapTile(x - 1, y)); // Left
        adjacents.add(new MapTile(x, y +1)); // Down
        adjacents.add(new MapTile(x, y - 1)); // Up
        return adjacents;
    }
}