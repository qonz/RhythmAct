package rhythmact.judgement;

import java.awt.Color;

import densan.s.game.drawing.Drawer;
import densan.s.game.manager.GameManager;
import densan.s.game.object.GameVectorBase;
import rhythmact.RhythmActSetting;
import rhythmact.musicscore.MusicScore;
 /**
  * 判定線をオブジェクトとして扱うためのクラス
  * @author Taishin
  *
  */
public class JudgeLine extends GameVectorBase {

	public JudgeLine(double y) {
		super(0,y,GameManager.getInstance().getFrameWidth(),1);
		// TODO 自動生成されたコンストラクター・スタブ
	}

	public void update(MusicScore musicScore) {
		// TODO 自動生成されたメソッド・スタブ
		setVy(-RhythmActSetting.getInstance().getSpeed());
		move();
		musicScore.intersect(this, 1);
	}

	public void draw(Drawer d, int offsetX,int offsetY) {
		d.setColor(Color.BLUE);
		d.drawLine(getX(), getY()+offsetY, GameManager.getInstance().getFrameWidth(), getY()+offsetY, 1);
	}

}
