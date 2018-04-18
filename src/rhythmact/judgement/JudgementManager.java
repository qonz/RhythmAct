package rhythmact.judgement;

import densan.s.game.drawing.Drawer;
import rhythmact.musicscore.MusicScore;
/**
 * 判定に関する管理クラス
 * @author Taishin
 *
 */
public class JudgementManager { 
	/**
	 * 判定線のオブジェクト
	 */
	private JudgeLine judgeLine;
	
	private static JudgementManager instance = new JudgementManager();
	private JudgementManager() {}
	public static JudgementManager getInstance(){
		return instance;
	}
	
	public void update(MusicScore musicScore){
		judgeLine.update(musicScore);
	}
	
	public void draw(Drawer d, int offsetX, int offsetY){
		judgeLine.draw(d,offsetX,offsetY);
	}
	
	public JudgeLine getJudgeLine(){
		return judgeLine;
	}
	
	public void setJudgeLine(JudgeLine j){
		if(judgeLine == null)
			judgeLine = j;
	}
	
	public void clear(){
		judgeLine = null;
	}
}
