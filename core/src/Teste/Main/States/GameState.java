/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Teste.Main.States;


import Teste.Main.Game;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

/**
 *
 * @author victor.rolival
 */
public abstract class GameState {
    
    public GameStateManager gsm;
    public Game game;
    
    public SpriteBatch sb;
    public OrthographicCamera camera;
    public OrthographicCamera hudcamera;
    
    public GameState(GameStateManager gsm){
        this.gsm = gsm;
        game =  gsm.game();
        sb = game.getSpriteBatch();
        camera = game.getCamera();
        hudcamera = game.getHudcamera();
    }
    
    

}
