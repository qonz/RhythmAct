package rhythmact.judgement;

import densan.s.game.drawing.Drawer;
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
	
	public JudgeLine getJudgeLine(){
		return judgeLine;
	}
	
	public void setJudgeLine(JudgeLine j){
		if(this.judgeLine == null)
			this.judgeLine = j;
	}

	public void update(){
		judgeLine.update();
	}
	
	public void draw(Drawer d, int offsetX, int offsetY){
		judgeLine.draw(d,offsetX,offsetY);
	}
	
}
