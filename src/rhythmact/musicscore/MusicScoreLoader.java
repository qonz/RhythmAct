package rhythmact.musicscore;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * 楽譜を読み込むクラス
 * @author Taishin
 *
 */
public class MusicScoreLoader {
	/**
	 * ステージファイルのテキスト
	 */
	private static ArrayList<String> stageText = new ArrayList<String>();
	
	/**
	 * 楽譜を読み込む
	 * @param fileName
	 * @return 読み込んだ楽譜のオブジェクト
	 */
	public static MusicScore load(String fileName){
		
		return null;
	}

	/**
	 * ファイルをマップに読み込む。
	 * @param fileName - 楽譜ファイルの名前
	 */
	private static void loadFile(String fileName) {
		int n = 0; //エラー出力用変数
		try {
			stageText.clear();
			InputStream is = MusicScore.class.getResourceAsStream("/"+fileName);
			BufferedReader in = new BufferedReader(new InputStreamReader(is));
			String line;
			
			while ((line = in.readLine()) != null) {
				n++;
				stageText.add(line.toString());
			}
			
			in.close();
			is.close();
		} catch (IOException e) {
			System.err.println(e);
			System.exit(1);
		} catch (Exception e) {
			System.out.println("Line: " + n);
			e.printStackTrace();
		}
	}

}
