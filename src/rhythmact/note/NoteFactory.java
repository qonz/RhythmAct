package rhythmact.note;
/**
 * ノーツ譜を作成するクラス
 * @author Taishin
 *
 */
public class NoteFactory {
	
	/**
	 * ノーツを生成する
	 * @param c - 音符
	 * @param x - ノーツのx座標
	 * @param y - ノーツのy座標
	 * @return
	 */
	public static Note createNotes(char c, int x, int y){
		Note note = null;
		switch(c){
		case 't':note = new Tap(x,y);break;
		case 's':note = new Slide(x,y);break;
		}
		return note;
	}
}
