/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mygdx.telas;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

/**
 *
 * @author Matheus
 */
public class TelaAbertura extends JanelaPadrao{
    private Sprite logo;
    private SpriteBatch batch;
    
    
    @Override
    public void show() {
        batch = new SpriteBatch();
        
        Texture logotexture = new Texture("boneslogo.png");
        logo = new Sprite(logotexture);
        //logo.setSize(Gdx.graphics.getWidth()/2,Gdx.graphics.getHeight()/2);
        }

    @Override
    public void render(float delta) {
        Gdx.gl.glClearColor(1, 1, 1, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        
        batch.begin();
        batch.draw(logo, Gdx.graphics.getWidth()/4, Gdx.graphics.getHeight()/4);
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
        }
    
    
}
