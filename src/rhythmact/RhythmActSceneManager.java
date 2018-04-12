package rhythmact;

import game.SceneManager;
/**
 * このゲームのシーンを管理するクラス
 * @author Taishin
 *
 */
public class RhythmActSceneManager extends SceneManager {

	private static RhythmActSceneManager instance = new RhythmActSceneManager();
	
	public RhythmActSceneManager() {
		// TODO 自動生成されたコンストラクター・スタブ
	}
	
	public static RhythmActSceneManager getInstance(){
		return instance;
	}

}
