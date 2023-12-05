package com.mygdx.game;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class Menu extends Game {

    public SpriteBatch batch;
    public BitmapFont font;

    public GameScreen gameScreen;

    public void create() {
        batch = new SpriteBatch();
        font = new BitmapFont();
        this.setScreen(new MainMenuScreen(this));
        gameScreen = new GameScreen(this);
    }

    public void render() {
        super.render();
    }



    public void dispose() {

        // dispose of all the resources used by the gameScreen.
        // This includes the gameScreen itself, the font, and the batch.
        // The gameScreen is disposed of by the GameScreen class.
        // The font is disposed of by the BitmapFont class.
        // The batch is disposed of by the SpriteBatch class.

        if (gameScreen != null) {
            gameScreen.dispose();
        }
        batch.dispose();
        font.dispose();
    }
}
