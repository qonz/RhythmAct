package rhythmact.note;

import densan.s.game.drawing.Drawer;
import densan.s.game.manager.GameManager;
import densan.s.game.object.ImageObjectBase;
import rhythmact.RhythmActSetting;
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
	
	public Note(double x, double y, String imageName) {
		super(x*NOTE_SIZE+GameManager.getInstance().getFrameWidth()/16, y*NOTE_SIZE/4*RhythmActSetting.getInstance().getSpeed()+RhythmActSetting.getInstance().getJudgeGap(),imageName);
		// TODO     ↑ノーツ位置の調整										↑ノーツ間の調整
	}
	
	/**
	 * 更新処理
	 */
	public void update() {
		setVy(RhythmActSetting.getInstance().getSpeed());
		
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
