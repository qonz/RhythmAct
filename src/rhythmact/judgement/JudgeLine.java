package rhythmact.judgement;

import java.awt.Color;

import densan.s.game.drawing.Drawer;
import densan.s.game.manager.GameManager;
import densan.s.game.object.ImageObjectBase;
import rhythmact.RhythmActSetting;
 /**
  * 判定線をオブジェクトとして扱うためのクラス
  * @author Taishin
  *
  */
public class JudgeLine extends ImageObjectBase {

	public JudgeLine(double y) {
		super(0, y, "");
		// TODO 自動生成されたコンストラクター・スタブ
	}

	@Override
	public void update() {
		// TODO 自動生成されたメソッド・スタブ
		setVy(-RhythmActSetting.getInstance().getSpeed());
		move();
	}

	@Override
	public void draw(Drawer d) {
		d.setColor(Color.BLACK);
		d.drawLine(getX(), getY(), GameManager.getInstance().getFrameWidth(), getY(), 20);
	}

}
