package rhythmact;

import game.SceneManager;
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
		// TODO 自動生成されたコンストラクター・スタブ
		
	}
	
	/**
	 * Singleton用ゲッター
	 */
	public static RhythmActSceneManager getInstance(){
		return instance;
	}

}
