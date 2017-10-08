package com.charizard832.hep.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.charizard832.hep.Hep;
import com.charizard832.hep.game.GameRenderer;
import com.charizard832.hep.game.GameWorld;

/**
 * Created by l on 10/8/17.
 */

public class GameScreen implements Screen {

    private Hep game;
    private float runTime;
    private GameWorld gameWorld;
    private GameRenderer gameRenderer;

    public GameScreen(Hep game){
        this.game = game;
        float screenWidth = Gdx.graphics.getWidth();
        float screenHeight = Gdx.graphics.getHeight();
        int midPointX = (int) (screenHeight/2);
        int midPointY = (int) (screenWidth/2);

        gameWorld = new GameWorld();
        gameRenderer = new GameRenderer(gameWorld, (int) screenWidth, (int) screenHeight, midPointY, midPointX);
    }

    @Override
    public void render(float delta){
        runTime += delta;
        gameWorld.update(delta);
        gameRenderer.render(delta, runTime);
    }

    @Override
    public void resize(int width, int height) {
        Gdx.app.log("GameScreen", "resizing");
    }

    @Override
    public void show() {
        Gdx.app.log("GameScreen", "show called");
    }

    @Override
    public void hide() {
        Gdx.app.log("GameScreen", "hide called");
    }

    @Override
    public void pause() {
        Gdx.app.log("GameScreen", "pause called");
    }

    @Override
    public void resume() {
        Gdx.app.log("GameScreen", "resume called");
    }

    @Override
    public void dispose() {
        // Leave blank
    }

}
