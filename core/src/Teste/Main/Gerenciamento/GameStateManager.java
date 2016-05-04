/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Teste.Main.Gerenciamento;
import Teste.Main.Game;
import Teste.Main.States.GameState;
import java.util.Stack;
/**
 *
 * @author victor.rolival
 */
public class GameStateManager {
    
    private Game game;
    
    private Stack<GameState> gamestates;
    
    public static final int play = 9999999;
    
    public GameStateManager (Game game){
        this.game = game;
        gamestates = new Stack<GameState>();
        pushState(play);
    }
    
    public void update(float deltatime){
        
    }
    
    public void render() {
       
    }
}
