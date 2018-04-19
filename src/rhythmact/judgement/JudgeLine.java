package rhythmact.judgement;

import java.awt.Color;

import controller.Keyboard;
import densan.s.game.drawing.Drawer;
import densan.s.game.manager.GameManager;
import densan.s.game.object.GameVectorBase;
import rhythmact.RhythmActSetting;
import rhythmact.musicscore.MusicScore;
 /**
  * 判定線をオブジェクトとして扱うためのクラス
  * @author Taishin
  *
  */
public class JudgeLine extends GameVectorBase {
	String judgement=Judgement.Nothing.getJudge();
	int nowOffsetY;
	
	public JudgeLine(double y) {
		super(0,y,GameManager.getInstance().getFrameWidth(),1);
		// TODO 自動生成されたコンストラクター・スタブ
	}

	public void update(MusicScore musicScore) {
		// TODO 自動生成されたメソッド・スタブ
		setVy(-RhythmActSetting.getInstance().getSpeed());
		move();
		
		if(Keyboard.isPressLINE0())
			judgement = musicScore.intersect(this, 0).getJudge();
		else if(Keyboard.isPressLINE1())
			judgement = musicScore.intersect(this, 1).getJudge();
		else if(Keyboard.isPressLINE2())
			judgement = musicScore.intersect(this, 2).getJudge();
		else if(Keyboard.isPressLINE3())
			judgement = musicScore.intersect(this, 3).getJudge();
		else if(Keyboard.isPressLINE4())
			judgement = musicScore.intersect(this, 4).getJudge();
		else if(Keyboard.isPressLINE5())
			judgement = musicScore.intersect(this, 5).getJudge();
		else if(Keyboard.isPressLINE6())
			judgement = musicScore.intersect(this, 6).getJudge();
		
//		musicScore.intersect(this, 0).getJudge();
//		System.out.println(judgement);
	}

	public void draw(Drawer d, int offsetX,int offsetY) {
		d.setColor(Color.BLUE);
		d.drawLine(getX(), getY()+offsetY-40, GameManager.getInstance().getFrameWidth(), getY()+offsetY-40, 1);
		if(judgement==Judgement.Nothing.getJudge()){
			nowOffsetY = offsetY;
		}
		if(nowOffsetY!=offsetY&&judgement!=Judgement.Nothing.getJudge()){
			d.drawString(judgement, getCenterX(), getY()+offsetY);
			System.out.println(judgement);
		}
		
	}

}
