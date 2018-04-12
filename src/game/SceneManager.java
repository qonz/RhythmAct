package game;

import densan.s.game.drawing.Drawer;
import densan.s.game.manager.Updatable;

/**
 * ゲームのシーンを管理
 * @author Taishin
 *
 */
public abstract class SceneManager implements Updatable{
	/**
	 * 現在のシーン
	 */
	private Scene currentScene;
	
	/**
	 * 変更先のシーン
	 */
	private Scene nextScene;
	
	protected Scene getcurrentScene(){
		return currentScene;
	}
	
	/**
	 * シーンを変更する
	 * @param scene
	 */
	public void setScene(Scene scene){
		nextScene = scene;
	}
	
	/**
	 * 更新処理
	 */
	public void update(){
		if (nextScene != null ) {
			currentScene = nextScene;
			nextScene = null;
		}
		currentScene.update();
	}
	
	/**
	 * 描画処理
	 */
	public void draw(Drawer d){
		currentScene.draw(d);
	}
	
	
}
