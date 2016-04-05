package com.mygdx.telas;
import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import static javax.swing.Spring.width;

public class Abertura extends JanelaPadrao {

    private SpriteBatch batch;
    private Sprite imglogo;
    private Sprite imgtitulo;
    private Sprite imgdeltatime;
    

    @Override
    public void resize(int width, int height) {
        
        }
   
    @Override
    public void show() {
        batch = new SpriteBatch();
        Texture textureimglogo = new Texture("imglogo.png");
        Texture textureimgtitulo = new Texture("imgtitulo.png");
        Texture textureimgdeltatime = new Texture("imgdeltatime.png");
        imglogo = new Sprite(textureimglogo);
        imgtitulo = new Sprite(textureimgtitulo);
        imgdeltatime = new Sprite(textureimgdeltatime);
        }

    @Override
    public void render(float delta) {
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
    public void hide() {
        }
    
}
