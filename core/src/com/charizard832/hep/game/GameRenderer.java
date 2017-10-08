package com.charizard832.hep.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer.ShapeType;

/**
 * Created by l on 10/8/17.
 */

public class GameRenderer {
    private GameWorld world;
    private int gameWidth, gameHeight, midPointY, midPointX;

    private OrthographicCamera cam;
    private ShapeRenderer shapeRenderer;
    private SpriteBatch batcher;
    public GameRenderer(GameWorld world, int gameWidth, int gameHeight, int midPointY, int midPointX){
        this.world = world;
        this.gameWidth = gameWidth;
        this.gameHeight = gameHeight;
        this.midPointY = midPointY;
        this.midPointX = midPointX;

        cam = new OrthographicCamera();
        cam.setToOrtho(true, gameWidth, gameHeight);

        batcher = new SpriteBatch();
        batcher.setProjectionMatrix(cam.combined);

        shapeRenderer = new ShapeRenderer();
        shapeRenderer.setProjectionMatrix(cam.combined);
    }

    public void render(float delta, float runTime){
        Gdx.gl.glClearColor(0, 0, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        shapeRenderer.begin(ShapeType.Filled);
        shapeRenderer.setColor(55 / 255.0f, 180 / 255.0f, 255 / 255.0f, 1);
        shapeRenderer.rect(0, 0, gameWidth, gameHeight);
        shapeRenderer.setColor(255 / 255.0f, 30 / 255.0f, 130 / 255.0f, 1);
        shapeRenderer.rect(gameWidth/2, midPointY, 400, 100);
        shapeRenderer.end();
    }


}
