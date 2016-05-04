/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mygdx.game;
import com.mygdx.telas.Play;
import com.badlogic.gdx.Game;
import com.mygdx.telas.TelaAbertura;

/**
 *
 * @author Matheus
 */
public class Principal extends Game {
    private int status=0;
    
    
    
    @Override
    public void create() {
        if(status == 0)
            this.setScreen(new Play());
        //this.setScreen(new Play());
    }
    
    public void render(){
        super.render();
        
        
    }
    
}
