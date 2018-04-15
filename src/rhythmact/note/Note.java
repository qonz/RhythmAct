package rhythmact.note;

import java.awt.Image;

import densan.s.game.drawing.Drawer;
import densan.s.game.image.ImageLoader;
import densan.s.game.manager.GameManager;
import densan.s.game.object.GameRectBase;
import rhythmact.RhythmActSetting;
/**
 * ノーツ
 * @author Taishin
 *
 */
public abstract class Note extends GameRectBase {
	/**
	 * ノーツ1つ分のサイズ
	 */
	public static final int NOTE_SIZE = 160;
	/**
	 * ノーツの画像
	 */
	protected Image image;
	
	
	public Note(double x, double y, String imageName) {
		super(x*NOTE_SIZE+GameManager.getInstance().getFrameWidth()/16, y*NOTE_SIZE/2*RhythmActSetting.getInstance().getSpeed()+RhythmActSetting.getInstance().getJudgeGap()*10, NOTE_SIZE, NOTE_SIZE);
		// TODO     ↑ノーツ位置の調整								↑ノーツ間の調整
		if (imageName != null)
			image = ImageLoader.load(imageName);
	}
	
	/**
	 * 更新処理
	 */
	public void update() {
	}

	/**
	 * 描画処理
	 * @param d
	 * @param offsetX
	 * @param offsetY
	 */
	public void draw(Drawer d, int offsetX, int offsetY) {
		d.drawImage(image,(int)getX() + offsetX, (int)getY() + offsetY);
	}
	
	@Override
	public void setWidth(int width) {
		//何もしないようにオーバーライド
	}

	@Override
	public void setHeight(int height) {
		//何もしないようにオーバーライド
	}
	
	public abstract void hitAction();

}
