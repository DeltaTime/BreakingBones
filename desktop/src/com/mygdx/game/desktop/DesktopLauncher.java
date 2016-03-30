package com.mygdx.game.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.badlogic.gdx.graphics.Color;
import com.mygdx.telas.Abertura;
import com.mygdx.game.MyGdxGame;
import com.mygdx.game.TheBreakingBones;


public class DesktopLauncher {
        
        
	public static void main (String[] arg) { 
                
                LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.width = 600;
                config.height = 480;
                config.title = "The Breaking Bones";
                config.fullscreen = false;
                config.resizable = false;
                new LwjglApplication(new Abertura(), config);
	}
}
