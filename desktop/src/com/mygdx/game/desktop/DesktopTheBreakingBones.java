package com.mygdx.game.desktop;

import Teste.Main.Game;
import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.badlogic.gdx.graphics.Color;
import com.mygdx.game.Principal;
import com.mygdx.game.TheBreakingBones;
import com.mygdx.telas.Play;


public class DesktopTheBreakingBones {
        
        
	public static void main (String[] arg) { 
                
                LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.width = Game.width * Game.scale;
                config.height = Game.height *  Game.scale;
                config.title = Game.titulo;
                config.fullscreen = false;
                config.resizable = false;
                new LwjglApplication( new Game(), config);
	}
}
