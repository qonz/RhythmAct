package rhythmact.note;

import java.awt.Point;

import densan.s.game.calc.Calc;
import densan.s.game.drawing.Drawer;
import densan.s.game.manager.GameManager;
import densan.s.game.object.ImageObjectBase;
import rhythmact.RhythmActSetting;
import rhythmact.judgement.JudgementManager;
/**
 * ノーツ
 * @author Taishin
 *
 */
public abstract class Note extends ImageObjectBase {
	/**
	 * ノーツ1つ分のサイズ
	 */
	public static final int NOTE_SIZE = 160;
	
	private double gap;
	
	public Note(double x, double y, String imageName) {
		super(x*NOTE_SIZE/8+(GameManager.getInstance().getFrameWidth()/2-110) , y*NOTE_SIZE/4*(RhythmActSetting.getInstance().getSpeed()/2)+RhythmActSetting.getInstance().getJudgeGap(),imageName);
		// TODO     ↑ノーツ位置の調整										↑ノーツ間の調整
		gap = (getCenterX()-GameManager.getInstance().getFrameWidth()/2)/20;
	}
	
	/**
	 * 更新処理
	 */
	public void update() {
//		double gap = (getCenterX()-GameManager.getInstance().getFrameWidth()/2)/80;
//		setVy(RhythmActSetting.getInstance().getSpeed());
		setVy(0);
		if(Calc.getDistance(getPos(), new Point((int)getCenterX(),(int)JudgementManager.getInstance().getJudgeLine().getY()))<GameManager.getInstance().getFrameHeight()){
			addVy(RhythmActSetting.getInstance().getSpeed()/10);
			setVx(gap*(RhythmActSetting.getInstance().getSpeed()/5));
		}
		move();
	}

	/**
	 * 描画処理
	 * @param d
	 * @param offsetX
	 * @param offsetY
	 */
	public void draw(Drawer d, int offsetX, int offsetY) {
		d.drawImage(getImage(),(int)getX() + offsetX, (int)getY() + offsetY);
	}
	
	/**
	 * 判定線との接触処理
	 */
	public void hitAction(){
		
	}

}
