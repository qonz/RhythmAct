package rhythmact.scene;

import java.awt.Color;

import densan.s.game.drawing.Drawer;
import densan.s.game.manager.GameManager;
import game.Scene;
import game.SceneManager;
import rhythmact.musicscore.MusicScoreManager;
/**
 * タイトルシーン
 * @author Taishin
 *
 */
public class TitleScene extends Scene {
	int i;
	public TitleScene(SceneManager sceneManager) {
		super(sceneManager);
		// TODO 自動生成されたコンストラクター・スタブ
		MusicScoreManager.getInstance().load("test", "testscore01");
	}

	@Override
	public void update() {
		// TODO 自動生成されたメソッド・スタブ
		
	}

	@Override
	public void draw(Drawer d) {
		// TODO 自動生成されたメソッド・スタブ
		
		i++;
		d.setColor(Color.BLACK);
		d.setFontSize(20);
		d.drawString(MusicScoreManager.getInstance().getMusicScore().getMusicName(), i*5%GameManager.getInstance().getFrameWidth(), 500);
	}

	@Override
	public void handle() {
		// TODO 自動生成されたメソッド・スタブ

	}

}
