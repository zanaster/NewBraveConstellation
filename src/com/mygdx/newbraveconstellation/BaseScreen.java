//package com.mygdx.newbraveconstellation;
//
//import com.badlogic.gdx.Game;
//import com.badlogic.gdx.InputProcessor;
//import com.badlogic.gdx.Screen;
////import com.badlogic.gdx.scenes.scene2d.Stage;
////import com.badlogic.gdx.utils.viewport.FitViewport;
////import com.badlogic.gdx.InputMultiplexer;
//
//public abstract class BaseScreen implements Screen, InputProcessor
//{
//	
//	protected Game game;
//
//public BaseScreen(Game g)
//{
//    game = g;
//}
//
//public void resize(int width, int height)
//{
////    mainStage.getViewport().update(width, height, true);
////    uiStage.getViewport().update(width, height, true);
//}
//
////methods required by Screen interface
//public void pause()   {  }
//public void resume()  {  }
//public void dispose() {  }
//public void show()    {  }
//public void hide()    {  }
//
////methods required by InputProcessor interface
//public boolean keyDown(int keycode)
//{  return false;  }
//public boolean keyUp(int keycode)
//{  return false;  }
//public boolean keyTyped(char c)
//{  return false;  }
//public boolean mouseMoved(int screenX, int screenY)
//{  return false;  }
//public boolean scrolled(int amount)
//{  return false;  }
//
//public boolean touchDown(int screenX, int screenY, int pointer, int button)
//{  return false;  }
//public boolean touchDragged(int screenX, int screenY, int pointer)
//{  return false;  }
//public boolean touchUp(int screenX, int screenY, int pointer, int button)
//{  return false;  }
//
//}