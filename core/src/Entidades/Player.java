/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.InputProcessor;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;

/**
 *
 * @author Matheus
 */
public class Player extends Sprite implements InputProcessor{
    private Vector2 velocidade = new Vector2();
    float velocidade_andar = 60*2, gravidade = 60*0.8f;
    public SpriteBatch batch;
    
    
    public Player(Sprite sprite){
        super(sprite);
        batch = new SpriteBatch();
    }
    
    public void update(float delta){
        if (velocidade.x > velocidade_andar)
            velocidade.x = velocidade_andar;
        if (velocidade.x < velocidade_andar)
            velocidade.x = -velocidade_andar;
        
        if (velocidade.y > velocidade_andar)
            velocidade.y = velocidade_andar;
        if (velocidade.y < velocidade_andar)
            velocidade.y = -velocidade_andar;
        
        //this.setX(this.getX()+velocidade.x*delta);
        //this.setY(this.getY()+velocidade.y*delta);
        
    }
    
    public void draw (SpriteBatch spriteBatch){
        update(Gdx.graphics.getDeltaTime());
        super.draw(batch);
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
