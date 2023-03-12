import java.awt.Point;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class World {
    public static String[][] world;
    private static Point startingPosition = new Point(0, 0);
    public static ArrayList<MapTile> history = new ArrayList<MapTile>();

    public void loadTiles() {
        List<String[]> rows = new ArrayList<>();
        try (BufferedReader f = new BufferedReader(new FileReader("src/map.txt"))) {
            String row;
            while ((row = f.readLine()) != null) {
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

    public static String[][] getWorld() {
        return world;
    }

    public static Point getStartingPosition() {
        return startingPosition;
    }

    public static ArrayList<MapTile> getHistory() {
        return history;
    }


}