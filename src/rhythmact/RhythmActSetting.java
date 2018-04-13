package rhythmact;
/**
 * ユーザがゲーム内で設定可能な機能を持つクラス
 * @author Taishin
 *
 */
public class RhythmActSetting {
	/**
	 * ノーツの速さ 初期設定では5
	 */
	private int speed = 5;
	/**
	 * 判定位置調整変数 初期設定では0.0
	 */
	private double judgeGap = 0.0;
	
	private static RhythmActSetting instance = new RhythmActSetting();
	private RhythmActSetting() {
	}
	public static RhythmActSetting getInstance(){
		return instance;
	}
	
	/**
	 * ノーツの速さを返す
	 * @return
	 */
	public int getSpeed() {
		return speed;
	}

	/**
	 * ノーツの速さを設定
	 * @param speed
	 */
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	/**
	 * 判定位置調整の値を返す
	 * @return
	 */
	public double getJudgeGap() {
		return judgeGap;
	}
	/**
	 * 判定位置調整の値を設定
	 * @param judgeGap
	 */
	public void setJudgeGap(double judgeGap) {
		this.judgeGap = judgeGap;
	}

}
