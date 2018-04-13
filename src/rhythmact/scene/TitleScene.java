package rhythmact.scene;

import java.awt.Color;

import densan.s.game.drawing.Drawer;
import densan.s.game.manager.GameManager;
import game.Scene;
import game.SceneManager;
import rhythmact.RhythmActSetting;
import rhythmact.musicscore.MusicScoreManager;
/**
 * タイトルシーン
 * @author Taishin
 *
 */
public class TitleScene extends Scene {

	private int i;
	private MusicScoreManager msManager = MusicScoreManager.getInstance();
	
	
	public TitleScene(SceneManager sceneManager) {
		super(sceneManager);
		// TODO 自動生成されたコンストラクター・スタブ
		msManager.load("test", "testscore02");
	}

	@Override
	public void update() {
		// TODO 自動生成されたメソッド・スタブ
		i = (i>500)?-2000:i+RhythmActSetting.getInstance().getSpeed();
		msManager.update();
	}

	@Override
	public void draw(Drawer d) {
		// TODO 自動生成されたメソッド・スタブ	
		msManager.draw(d, 0, i);
		d.setColor(Color.BLACK);
		d.drawLine(0, 600, GameManager.getInstance().getFrameWidth(), 600, 1);
		d.setFontSize(20);
		d.drawString(MusicScoreManager.getInstance().getMusicScore().getMusicName(), i*5%GameManager.getInstance().getFrameWidth(), 500);
	}

	@Override
	public void handle() {
		// TODO 自動生成されたメソッド・スタブ

	}

}
