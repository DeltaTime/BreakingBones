package com.mygdx.telas;
import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import static javax.swing.Spring.width;

public class Abertura extends JanelaPadrao {

    SpriteBatch batch;
    Texture imglogo;
    Texture imgtitulo;
    Texture imgdeltatime;
    @Override
    public void create() {
        batch = new SpriteBatch();
        imglogo = new Texture(Gdx.files.internal("imglogo.png"));
        imgtitulo = new Texture(Gdx.files.internal("imgtitulo.png"));
        imgdeltatime = new Texture(Gdx.files.internal("imgdeltatime.png"));
        
        }

    @Override
    public void resize(int width, int height) {
        
        }

    @Override
    public void render() {
        Gdx.gl.glClearColor(1, 1, 1, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        batch.begin();
        batch.draw(imglogo,((Gdx.graphics.getWidth()/2) - (imglogo.getWidth()/2)), ((Gdx.graphics.getHeight()/2) - (imglogo.getHeight()/2)));
        batch.end();
        batch.begin();
        batch.draw(imgtitulo, ((Gdx.graphics.getWidth()/2) - (imgtitulo.getWidth()/2)), ((Gdx.graphics.getHeight()/2) - ((imgtitulo.getHeight()/2) + 10 + (imglogo.getHeight()/2))));
        batch.end();
        batch.begin();
        batch.draw(imgdeltatime, ((Gdx.graphics.getWidth()) - (imgdeltatime.getWidth())), ((Gdx.graphics.getHeight()) - (imgdeltatime.getHeight())));
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
        imglogo.dispose();
        imgtitulo.dispose();
        imgdeltatime.dispose();
        batch.dispose();
        }

    @Override
    public void show() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void render(float delta) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void hide() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
