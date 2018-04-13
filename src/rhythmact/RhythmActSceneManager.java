package rhythmact;

import game.SceneManager;
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
		// TODO setScene でタイトル画面に遷移
		setScene(new TitleScene(this));
	}
	
	/**
	 * Singleton用ゲッター
	 */
	public static RhythmActSceneManager getInstance(){
		return instance;
	}

}
