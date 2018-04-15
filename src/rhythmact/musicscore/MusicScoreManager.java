package rhythmact.musicscore;

import densan.s.game.drawing.Drawer;

/**
 * 楽譜を管理するクラス
 * @author Taishin
 *
 */
public class MusicScoreManager {
	/**
	 * 現在の楽譜
	 */
	private MusicScore currentMusicScore;
	
	private static MusicScoreManager instance = new MusicScoreManager();
	
	public static MusicScoreManager getInstance(){
		return instance;
	}
	
	/**
	 * 更新処理を行う
	 */
	public void update(){
		currentMusicScore.update();
	}
	
	/**
	 * 描画処理を行う
	 * @param d
	 * @param offsetX
	 * @param offsetY
	 */
	public void draw(Drawer d , int offsetX, int offsetY){
		currentMusicScore.draw(d, offsetX, offsetY);
	}
	
	/**
	 * 楽曲を読み込む
	 * @param musicName
	 * @param difficulty
	 */
	public void load(String musicName, String difficulty) {
		currentMusicScore = MusicScoreLoader.load(musicName,difficulty);
	}
	
	/**
	 * 現在の楽譜を返す
	 * @return
	 */
	public MusicScore getMusicScore(){
		return currentMusicScore;
	}
	
}
