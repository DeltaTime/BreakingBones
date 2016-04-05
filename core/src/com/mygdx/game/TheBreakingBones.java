package com.mygdx.game;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.graphics.GL30;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import static javax.swing.Spring.width;



public class TheBreakingBones extends Game {

    public SpriteBatch batch;
    Sprite player;
    
    @Override
    public void create() {
         batch = new SpriteBatch();
         player = new Sprite(new Texture(Gdx.files.internal("player1.png")));
        
       
        
        
        }

    @Override
    public void resize(int width, int height) {
        
        }

    @Override
    public void render() {
       Gdx.gl.glClearColor(1, 1, 1, 1);
       Gdx.gl.glClear(GL30.GL_COLOR_BUFFER_BIT);
        
        
       
       
       if(Gdx.input.isKeyPressed(Keys.UP)){
           if (player.getY() < (Gdx.graphics.getHeight() - player.getHeight()-1))
                player.setY(player.getY() + 5);
           
        }
        if(Gdx.input.isKeyPressed(Keys.DOWN)){
            if (player.getY() > -1)
                player.setY(player.getY() - 5);
        }
        if(Gdx.input.isKeyPressed(Keys.LEFT)){
            if (player.getX() > -1)
                player.setX(player.getX() - 5);
        }
        if(Gdx.input.isKeyPressed(Keys.RIGHT)){
            if (player.getX() < (Gdx.graphics.getWidth()- player.getWidth()-1))
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
