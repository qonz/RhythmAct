package rhythmact.scene;

import java.awt.Color;

import densan.s.game.drawing.Drawer;
import densan.s.game.manager.GameManager;
import densan.s.game.sound.SoundManager;
import game.Scene;
import game.SceneManager;
import rhythmact.RhythmActSetting;
import rhythmact.judgement.JudgementManager;
import rhythmact.musicscore.MusicScoreManager;
import rhythmact.note.Note;
/**
 * タイトルシーン
 * @author Taishin
 *
 */
public class TitleScene extends Scene {

	private JudgementManager jManager = JudgementManager.getInstance();
	private MusicScoreManager msManager = MusicScoreManager.getInstance();
	private GameManager gameManager = GameManager.getInstance();
	
	int i=0;
	
	public TitleScene(SceneManager sceneManager) {
		super(sceneManager);
		// TODO 自動生成されたコンストラクター・スタブ
//		msManager.load("kaeru", "easy");
//		SoundManager.playBGM(msManager.getMusicScore().getMusic());
//		RhythmActSetting.getInstance().setSpeed(10);
	}

	@Override
	public void update() {
		// TODO 自動生成されたメソッド・スタブ
		jManager.update(msManager.getMusicScore());
		msManager.update();
		i++;
		if(i==120)
			SoundManager.playBGM(msManager.getMusicScore().getMusic());
	}

	@Override
	public void draw(Drawer d) {
		// TODO 自動生成されたメソッド・スタブ	
		int height = gameManager.getFrameHeight();
		int offsetY = height *4/5 - (int)jManager.getJudgeLine().getY();
		
//		System.out.println("offsetY:"+offsetY+", y:"+jManager.getJudgeLine().getY()) ;
		
		jManager.draw(d, 0, offsetY);
		msManager.draw(d, 0, offsetY);
		
		d.setColor(Color.BLACK);
		d.drawLine(45, 720, 440, 0, 1);
		d.drawLine(1280-45, 720, 1280-440, 0, 1);
//		d.drawLine(0, 600, GameManager.getInstance().getFrameWidth(), 600, 1);
//		d.setFontSize(20);
//		d.drawString(msManager.getMusicScore().getMusicName(), i*5%gameManager.getFrameWidth(), 500);
	}

	@Override
	public void handle() {
		// TODO 自動生成されたメソッド・スタブ

	}

}
