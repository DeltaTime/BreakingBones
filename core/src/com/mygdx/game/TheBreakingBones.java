package com.mygdx.game;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.graphics.GL30;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import com.sun.media.jfxmedia.events.PlayerStateEvent;
import static javax.swing.Spring.width;

public class TheBreakingBones extends Game {

    public SpriteBatch batch;
    Sprite player;
    
    @Override
    public void create() {
         batch = new SpriteBatch();
         player = new Sprite(new Texture(Gdx.files.internal("player1.jpg")));
        
       
        
        
        }

    @Override
    public void resize(int width, int height) {
        
        }

    @Override
    public void render() {
       Gdx.gl.glClearColor(1, 1, 1, 1);
       Gdx.gl.glClear(GL30.GL_COLOR_BUFFER_BIT);
        
        
       
       
       if(Gdx.input.isKeyPressed(Keys.UP)){
            player.setY(player.getY() + 5);
        }
        if(Gdx.input.isKeyPressed(Keys.DOWN)){
            player.setY(player.getY() - 5);
        }
        if(Gdx.input.isKeyPressed(Keys.LEFT)){
            player.setX(player.getX() - 5);
        }
        if(Gdx.input.isKeyPressed(Keys.RIGHT)){
            player.setX(player.getX() + 5);
        }
        
        batch.begin();
        batch.draw(player, player.getX(), player.getY());
        batch.end();
              
        
        }

    @Override
    public void pause() {
        }

    @Override
    public void resume() {
        }

    @Override
    public void dispose() {
        
        player.getTexture().dispose();
        batch.dispose();
    }
    
}
