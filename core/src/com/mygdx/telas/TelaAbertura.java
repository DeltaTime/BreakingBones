/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mygdx.telas;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.InputProcessor;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

/**
 *
 * @author Matheus
 */
public class TelaAbertura implements Screen, InputProcessor{
    private Sprite boneslogo;
    private Sprite bonestitulo;
    private Sprite deltatimelogo;    
    private SpriteBatch batch;
    
    
    
    @Override
    public void show() {
        batch = new SpriteBatch();
        
        Texture boneslogotexture = new Texture("boneslogo.png");
        boneslogo = new Sprite(boneslogotexture);
        Texture bonestitulotexture = new Texture("bonestitulo.png");
        bonestitulo = new Sprite(bonestitulotexture);
        Texture deltatimelogotexture = new Texture("deltatimelogo.png");
        deltatimelogo = new Sprite(deltatimelogotexture);
        
        //logo.setSize(Gdx.graphics.getWidth()/2,Gdx.graphics.getHeight()/2);
        }

    @Override
    public void render(float delta) {
        Gdx.gl.glClearColor(1, 1, 1, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        
        batch.begin();
        batch.draw(boneslogo, 400, 240);
        batch.end();
        batch.begin();
        batch.draw(bonestitulo, 280, 0);
        batch.end();
        batch.begin();
        batch.draw(deltatimelogo, 820, 680);
        batch.end();
        
        }

    @Override
    public void resize(int width, int heigth) {
        }

    @Override
    public void pause() {
        }

    @Override
    public void resume() {
        }

    @Override
    public void hide() {
        }

    @Override
    public void dispose() {
        batch.dispose();
        boneslogo.getTexture().dispose();
        deltatimelogo.getTexture().dispose();
        bonestitulo.getTexture().dispose();
        }

    @Override
    public boolean keyDown(int i) {
        return false;
    }

    @Override
    public boolean keyUp(int i) {
        return false;
    }

    @Override
    public boolean keyTyped(char c) {
        return false;
    }

    @Override
    public boolean touchDown(int i, int i1, int i2, int i3) {
        return false;
    }
    

    @Override
    public boolean touchUp(int i, int i1, int i2, int i3) {
        return false;
    }

    @Override
    public boolean touchDragged(int i, int i1, int i2) {
        return false;
    }

    @Override
    public boolean mouseMoved(int i, int i1) {
        return false;
    }

    @Override
    public boolean scrolled(int i) {
        return false;
    }
    
}
