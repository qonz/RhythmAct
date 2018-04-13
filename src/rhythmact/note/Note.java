package rhythmact.note;

import java.awt.Image;

import densan.s.game.drawing.Drawer;
import densan.s.game.image.ImageLoader;
import densan.s.game.object.GameRectBase;
/**
 * ノーツ
 * @author Taishin
 *
 */
public abstract class Note extends GameRectBase {
	/**
	 * オブジェクトの画像
	 */
	protected Image image;
	
	public Note(double x, double y, String imageName) {
		super(x, y, 0, 0);
		// TODO     ↑  ↑ ノーツサイズを判定位置との距離で変える
		if (imageName != null)
			this.image = ImageLoader.load(imageName);
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

}
