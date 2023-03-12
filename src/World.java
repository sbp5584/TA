import java.awt.Point;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class World {
    private String[][] world;
    private Point startingPosition = new Point(0, 0);
    private List<MapTile> history = new ArrayList<>();

    /**
     * Loads the map from the map.txt file.
     */
    public void loadTiles() {
        List<String[]> rows = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader("src/map.txt"))) {
            String row;
            while ((row = reader.readLine()) != null) {
                rows.add(row.split("\t"));
            }
            int xMax = rows.get(0).length;
            world = new String[rows.size()][xMax];
            for (int y = 0; y < rows.size(); y++) {
                String[] cols = rows.get(y);
                for (int x = 0; x < xMax; x++) {
                    String tileName = cols[x];
                    if (tileName.equals("Starting Point")) {
                        startingPosition.x = x;
                        startingPosition.y = y;
                    }
                    world[y][x] = tileName.equals(" ") ? null : tileName;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Returns the map as a 2D array of strings.
     */
    public String[][] getWorld() {
        return world;
    }

    /**
     * Returns the starting position on the map as a Point.
     */
    public Point getStartingPosition() {
        return startingPosition;
    }

    /**
     * Returns the list of MapTiles that the player has visited.
     */
    public List<MapTile> getHistory() {
        return history;
    }
}