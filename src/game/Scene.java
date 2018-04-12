package game;

import densan.s.game.manager.Updatable;

/**
 * シーン
 * @author Taishin
 *
 */
public abstract class Scene implements Updatable{
	
	private SceneManager sceneManager;
	
	protected SceneManager getSceneManager(){
		return sceneManager;
	}
	
	public Scene(SceneManager sceneManager){
		this.sceneManager = sceneManager;
	}
	
	/**
	 * 状態遷移
	 */
	public abstract void handle();
}
