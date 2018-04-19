package rhythmact;

import game.SceneManager;
import rhythmact.scene.PreScene;
import rhythmact.scene.TitleScene;
/**
 * このゲームのシーンを管理するクラス
 * @author Taishin
 *
 */
public class RhythmActSceneManager extends SceneManager {
	/**
	 * Singleton用インスタンス
	 */
	private static RhythmActSceneManager instance = new RhythmActSceneManager();
	
	private RhythmActSceneManager() {
		setScene(new PreScene(this));//TitleScene(this));
	}
	
	/**
	 * Singleton用ゲッター
	 */
	public static RhythmActSceneManager getInstance(){
		return instance;
	}

}
