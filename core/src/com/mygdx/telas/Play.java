/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mygdx.telas;

import Entidades.Player;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.maps.tiled.TiledMap;
import com.badlogic.gdx.maps.tiled.TmxMapLoader;
import com.badlogic.gdx.maps.tiled.renderers.OrthogonalTiledMapRenderer;

/**
 *
 * @author Matheus
 */
public class Play implements Screen{
    
    private TiledMap mapa1;
    public OrthogonalTiledMapRenderer renderer;
    public static OrthographicCamera camera;
    public Player player;
    
    
    
    @Override
    public void show() {
        TmxMapLoader loader = new TmxMapLoader();
        mapa1 = loader.load("map.tmx");
        player = new Player(new Sprite(new Texture("player1.png")));
        camera = new OrthographicCamera();
        renderer = new OrthogonalTiledMapRenderer(mapa1);
        Gdx.input.setInputProcessor(player);
    
    }

    @Override
    public void render(float f) {
        Gdx.gl.glClearColor(0, 0, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        renderer.setView(camera);
        renderer.render();
        
        player.batch.begin();
        player.draw(new SpriteBatch(1000));
        player.batch.end();
        
        
        camera.update();
        player.batch.setProjectionMatrix(camera.combined);
    
    }

    @Override
    public void resize(int width, int height) {
        camera.viewportWidth = width;
        camera.viewportHeight = height;
    }

    @Override
    public void pause() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void resume() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void hide() {
        this.dispose();
    }

    @Override
    public void dispose() {
        mapa1.dispose();
        renderer.dispose();
        player.getTexture().dispose();
        
    }

    
    
}
