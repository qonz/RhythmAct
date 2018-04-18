package rhythmact.note;

import rhythmact.judgement.JudgeLine;
import rhythmact.judgement.JudgementManager;
/**
 * 判定線を譜面上に置く用のクラス
 * @author Taishin
 *
 */
public class LineInitPos extends Note {

	public LineInitPos(double x, double y) {
		super(x, y, "");
		JudgementManager.getInstance().setJudgeLine(new JudgeLine(getY()));
	}

	@Override
	public void hitAction() {
		// TODO 自動生成されたメソッド・スタブ
		
	}

}
