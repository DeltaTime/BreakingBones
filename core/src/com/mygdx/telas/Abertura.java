package com.mygdx.telas;
import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import static javax.swing.Spring.width;

public class Abertura extends ApplicationAdapter {

    SpriteBatch batch;
    Texture imglogo;
    Texture imgtitulo;
    Texture imgdeltatime;
    @Override
    public void create() {
        batch = new SpriteBatch();
        imglogo = new Texture(Gdx.files.internal("boneslogo.jpg"));
        imgtitulo = new Texture(Gdx.files.internal("bonestitulo.jpg"));
        imgdeltatime = new Texture(Gdx.files.internal("bonesdeltatime.jpg"));
        
        }

    @Override
    public void resize(int width, int height) {
        
        }

    @Override
    public void render() {
        Gdx.gl.glClearColor(1, 1, 1, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        
        
        batch.begin();
        batch.draw(imglogo, 230, 240);
        batch.end();
        batch.begin();
        batch.draw(imgtitulo, 150, 0);
        batch.end();
        batch.begin();
        batch.draw(imgdeltatime, 400, 400);
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
    
}
