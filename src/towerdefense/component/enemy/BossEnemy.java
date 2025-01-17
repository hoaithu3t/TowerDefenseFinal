package towerdefense.component.enemy;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.shape.Rectangle;
import towerdefense.component.GameConfig;
import towerdefense.ui.Game;
import towerdefense.ui.TowerDefense;



public class BossEnemy extends AbstractEnemy implements Enemy
{
    public BossEnemy() {
        super();
        this.width = GameConfig.BOSS_ENEMY_WIDTH;
        this.height = GameConfig.BOSS_ENEMY_HEIGHT;
        this.health = GameConfig.BOSS_ENEMY_HEALTH;
        this.ENEMY_HEALTH = GameConfig.BOSS_ENEMY_HEALTH;
        this.armor = GameConfig.BOSS_ENEMY_ARMOR;
        this.speed = GameConfig.BOSS_ENEMY_SPEED;
        this.reward = GameConfig.BOSS_ENEMY_REWARD;
        this.image = new Image(GameConfig.BOSS_ENEMY_URL);
        this.imageV = new ImageView(image);
        Game.root.getChildren().add(imageV);
    }

    @Override
    public int getReward() {
        return 0;
    }


    public void setHealth() {
        this.health -= 1;
    }

    @Override
    public Rectangle getHealth_T_Rect() {
        return null;
    }

    @Override
    public Rectangle getHealth_P_Rect() {
        return null;
    }


    @Override
    public ImageView getImageV() {
        return this.imageV;
    }
}

