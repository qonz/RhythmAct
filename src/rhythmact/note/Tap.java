package rhythmact.note;

import java.awt.Image;
import java.awt.Point;

import densan.s.game.calc.Calc;
import densan.s.game.image.ImageLoader;
import densan.s.game.manager.GameManager;
import rhythmact.judgement.JudgementManager;

/**
 * 単音ノーツクラス
 * @author Taishin
 *
 */
public class Tap extends Note {
	private Image[] tap = new Image[9];

	public Tap(double x, double y) {
		super(x, y, "image/tap1.png");
		// TODO 自動生成されたコンストラクター・スタブ
		for(int i=0;i<6;i++) tap[i] = ImageLoader.load("image/tap"+(i+1)+".png");
	}
	
	public void update(){
		super.update();
		setImage(tap[5]);
		if(Calc.getDistance(getPos(), new Point((int)getCenterX(),(int)JudgementManager.getInstance().getJudgeLine().getY()))>300)
			setImage(tap[4]);
		if(Calc.getDistance(getPos(), new Point((int)getCenterX(),(int)JudgementManager.getInstance().getJudgeLine().getY()))>400)
			setImage(tap[3]);
		if(Calc.getDistance(getPos(), new Point((int)getCenterX(),(int)JudgementManager.getInstance().getJudgeLine().getY()))>500)
			setImage(tap[2]);
		if(Calc.getDistance(getPos(), new Point((int)getCenterX(),(int)JudgementManager.getInstance().getJudgeLine().getY()))>600)
			setImage(tap[1]);
		if(Calc.getDistance(getPos(), new Point((int)getCenterX(),(int)JudgementManager.getInstance().getJudgeLine().getY()))>700)
			setImage(tap[0]);
		
	}

}
