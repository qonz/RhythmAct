package rhythmact.musicscore;

import java.awt.Image;
import java.awt.Point;
import java.util.HashMap;
import java.util.Map.Entry;

import densan.s.game.drawing.Drawer;
import densan.s.game.image.ImageLoader;
import rhythmact.note.Note;

/**
 * 楽譜クラス
 * @author Taishin
 *
 */
public class MusicScore {
	
	/**
	 * ノーツ譜
	 */
	private HashMap<Point, Note> notes = new HashMap<>();
	/**
	 * 楽曲名
	 */
	private String musicName;
	/**
	 * 譜面の縦の長さ
	 */
	private int height;
	
	/**
	 * 背景画像
	 */
	private Image backGround = ImageLoader.load("");

	public MusicScore(HashMap<Point, Note> notes, String musicName, int height) {
		this.notes = notes;
		this.musicName = musicName;
		this.height = height;
	}

	/**
	 * 更新
	 */
	public void update(){
		for(Entry<Point, Note> e: notes.entrySet()){
			e.getValue().update();
		}
	}
	
	/**
	 * 描画
	 * @param d
	 * @param offsetX
	 * @param offsetY
	 */
	public void draw(Drawer d, int offsetX, int offsetY){
		d.drawImage(backGround, 0, 0);
		for(Entry<Point, Note> e: notes.entrySet()){
			e.getValue().draw(d, offsetX, offsetY);
		}
	}
	
	/**
	 * 楽曲名を返す
	 * @return
	 */
	public String getMusicName(){
		return musicName;
	}
	
	/**
	 * 高さを返す
	 * @return
	 */
	public int getHeight(){
		return height;
	}
	
}
