package game;

import densan.s.game.drawing.Drawer;
import densan.s.game.manager.Updatable;

/**
 * ゲーム
 * @author Taishin
 *
 */
public abstract class Game implements Updatable {
	
	private SceneManager sceneManager;
	
	public Game(SceneManager sceneManager){
		this.sceneManager = sceneManager;
	}
	
	/**
	 * 更新処理
	 */
	public void update(){
		sceneManager.update();
	}

	/**
	 * 描画処理
	 */
	public void draw(Drawer d){
		sceneManager.draw(d);
	}

}
