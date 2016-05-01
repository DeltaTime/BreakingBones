package com.mygdx.game.desktop;

import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.badlogic.gdx.graphics.Color;
import com.mygdx.game.MyGdxGame;
import com.mygdx.game.Principal;
import com.mygdx.game.TheBreakingBones;
import com.mygdx.telas.Play;


public class DesktopLauncher {
        
        
	public static void main (String[] arg) { 
                
                LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.width = 1024;
                config.height = 780;
                config.title = "The Breaking Bones";
                config.fullscreen = false;
                config.resizable = false;
                new LwjglApplication( new Principal(), config);
	}
}
