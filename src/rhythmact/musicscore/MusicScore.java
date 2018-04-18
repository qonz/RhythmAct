package rhythmact.musicscore;

import java.awt.Image;
import java.awt.Point;
import java.util.HashMap;
import java.util.Map.Entry;

import densan.s.game.drawing.Drawer;
import densan.s.game.image.ImageLoader;
import densan.s.game.manager.GameManager;
import rhythmact.judgement.JudgeLine;
import rhythmact.judgement.JudgementManager;
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
		for(Entry<Point, Note> e: getNotes().entrySet()){
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
		for(Entry<Point, Note> e: getNotes().entrySet()){
			e.getValue().draw(d, offsetX, offsetY);
		}
	}
	
	public void intersect(JudgeLine judgeline){
		//接触の真偽値
//		boolean 
		//判定線のY座標
		int lineY = (int)Math.floor(Math.ceil(judgeline.getCenterY())/Note.NOTE_SIZE);// Noteのyにかけてる分割る
//		System.out.println(Math.ceil(judgeline.getCenterY())+":"+lineY);
		Note[] note = new Note[7];
		for(int x = 0; x < 7; x++){
			try{
				note[x] = notes.get(new Point(x,lineY));
			} catch(NullPointerException e){
				note[x] = null;
			}
		}
		if(note[0]!=null)System.out.println(note[0].toString());
		
	}
	
	/**
	 * 譜面のHashMapを返す
	 * @return
	 */
	public HashMap<Point, Note> getNotes() {
		return notes;
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
	
	public static void main(String[] args){
		GameManager.getInstance().createFrame(1280, 720);
		MusicScoreManager.getInstance().load("test", "testscore02");
		for(int i=0;i<40;i++){
		JudgementManager.getInstance().update(MusicScoreManager.getInstance().getMusicScore());
		MusicScoreManager.getInstance().update();
		MusicScoreManager.getInstance().getMusicScore().intersect(JudgementManager.getInstance().getJudgeLine());
		}
		System.exit(1);
	}
}
