package towerdefense.component;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;

public class TileMap
{
    public static int[][] MAP_PATH = new int[][] {
            {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,},
            {0,0,0,0,0,6,6,6,6,2,0,0,0,0,0,0,0,0,},
            {0,0,0,0,0,8,0,0,0,2,0,0,0,0,0,0,0,0,},
            {0,0,0,0,0,8,0,0,0,2,0,0,0,0,0,0,0,0,},
            {0,0,0,0,0,8,0,0,0,2,0,0,0,0,0,0,0,0,},
            {0,6,6,6,6,8,0,0,0,2,0,0,0,0,0,0,0,0,},
            {0,8,0,0,0,0,0,0,0,2,0,0,0,0,0,0,0,0,},
            {0,8,0,0,0,0,0,0,0,2,0,0,0,0,0,0,0,0,},
            {0,8,0,0,0,0,0,0,0,2,0,0,0,0,0,0,0,0,},
            {0,8,0,0,0,0,0,0,0,2,0,0,0,0,0,0,0,0,},
            {0,8,0,0,0,0,0,0,0,6,6,6,6,6,6,6,6,6,},
            {0,8,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,},


    };
    public static String[][] MAP_SPRITES = new String[][] {
            {"024","024","024","024","069","070","070","070","070","070","071","024","024","024","024","024","024","024",},
            {"024","024","024","024","092","093","093","093","093","093","094","024","024","024","024","024","024","024",},
            {"024","024","024","024","092","093","072","116","073","093","094","024","024","024","024","024","024","024",},
            {"024","024","024","024","092","093","094","024","092","093","094","024","024","024","024","024","024","024",},
            {"024","024","024","024","092","093","094","024","092","093","094","024","024","024","024","024","024","024",},
            {"069","070","070","070","096","093","094","024","092","093","094","024","024","024","024","024","024","024",},
            {"092","093","093","093","093","093","094","024","092","093","094","024","024","024","024","024","024","024",},
            {"092","093","072","116","116","116","117","024","092","093","094","024","024","024","024","024","024","024",},
            {"092","093","094","024","024","024","024","024","092","093","094","024","024","024","024","024","024","024",},
            {"092","093","094","024","024","024","024","024","092","093","095","070","070","070","070","070","070","070",},
            {"092","093","094","024","024","024","024","024","092","093","093","093","093","093","093","093","093","093",},
            {"092","093","094","024","024","024","024","024","115","116","116","116","116","116","116","116","116","116",},


    };

    public static void drawMap(GraphicsContext graphicsContext){
        for (int i = 0; i < MAP_SPRITES.length; i++) {
            for (int j = 0; j < MAP_SPRITES[i].length; j++) {
                graphicsContext.drawImage(new Image("file:src/Assets/Tile/towerDefense_tile"
                        + MAP_SPRITES[i][j]  +".png" ), j * GameConfig.TILE_SIZE, i * GameConfig.TILE_SIZE);
            }
        }
    }
    public int[][] getMAP_PATH()
    {
        return this.MAP_PATH;
    }

}