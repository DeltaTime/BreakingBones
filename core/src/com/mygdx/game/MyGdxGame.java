package com.mygdx.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.mygdx.telas.TelaAbertura;

public class MyGdxGame extends Game {
    private static final String titulo = "The Breaking Bones",versao="0.0.1";
    
    @Override
    public void create () {
        setScreen(new TelaAbertura()); 
    }

    @Override
    public void dispose() {
        super.dispose();
    }
        
        
    @Override
    public void render () {
	super.render();
    }
    
    @Override
    public void resize(int width, int height) {
        super.resize(width, height);
    }

    @Override
    public void resume() {
        super.resume();
    }

    @Override
    public void pause() {
        super.pause();
    }

    
}
