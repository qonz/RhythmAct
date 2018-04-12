package rhythmact;

import densan.s.game.manager.GameManager;
import game.Game;
/**
 * このゲームの実行用クラス
 * @author Taishin
 *
 */
public class RhythmAct extends Game {
	/**
	 * 画面の広さ(横幅)
	 */
	public static final int FRAME_WIDTH = 1280;
	/**
	 * 画面の高さ(縦幅)
	 */
	public static final int FRAME_HEIGHT = 720;

	public RhythmAct() {
		super(RhythmActSceneManager.getInstance());
		// TODO 自動生成されたコンストラクター・スタブ
	}

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		GameManager gm = GameManager.getInstance();
		gm.createFrame(FRAME_WIDTH, FRAME_HEIGHT, "RhythmAct!!");
//		gm.setUpdatable(new RhythmAct());
	}

}
