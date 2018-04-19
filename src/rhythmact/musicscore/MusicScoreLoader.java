package rhythmact.musicscore;

import java.awt.Point;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import rhythmact.note.Note;
import rhythmact.note.NoteFactory;


/**
 * 楽譜を読み込むクラス
 * @author Taishin
 *
 */
public class MusicScoreLoader {
	/**
	 * 楽譜ファイルのテキスト
	 */
	private static ArrayList<String> musicScoreText = new ArrayList<String>();
	
	/**
	 * 楽譜を読み込む
	 * @param musicName - 楽曲名
	 * @param difficulty - 難易度
	 * @return
	 */
	public static MusicScore load(String musicName, String difficulty){
		//ファイルの読み込み
		System.out.println("読み込みファイル名:"+musicName+"/"+difficulty+".txt");
		loadFile(musicName,difficulty);
		//一行を一文字ごとで分割したものを入れるための配列
		char[] lineList;
		//ステージの要素の位置
		int px = 0, py = 0;
		//サイズ
		int width = 0, height = 0;
		//ノーツ譜面
		HashMap<Point, Note> notes = new HashMap<>();
		
		for(int i=0;i<musicScoreText.size();i++){
			String line = musicScoreText.get(i);
			//1行をchar型の配列にする
			lineList = line.toCharArray();
			for(char c: lineList){
				//登録するオブジェクト
				Note note = null;
				note = NoteFactory.createNotes(c, px, py);
				if(note != null)
					notes.put(new Point(px, py), note);
				px++;
//				width = Math.max(px, width);
				if(px>7){
					System.err.println("ファイルエラー：ボタンは7つまでです");
					System.exit(1);
				}
				//デバッグ用出力
				System.out.print(c);
			}
			//デバッグ用出力
			System.out.println();
			//最初に戻って一段下げる
			px = 0;
			py++;
			height = py;
		}

		return new MusicScore(notes, musicName, height);
	}
	
	/**
	 * ファイルをマップに読み込む。
	 * @param musicName - 楽曲名
	 * @param difficulty - 難易度
	 */
	private static void loadFile(String musicName, String difficulty) {
		/*try (Scanner scanner = new Scanner(new File("src/music/"+musicName+"/"+difficulty+".txt"))){//Stream<String> file = Files.lines(Paths.get("src/music/"+musicName+"/"+difficulty+".txt"))){
			musicScoreText.clear();
			while(scanner.hasNextLine())
				musicScoreText.add(scanner.nextLine());
				//.forEach(line -> musicScoreText.add(line));
		} catch (IOException e) { //入出力エラー
			System.err.println(e);
			System.exit(1);
		} catch (Exception e) {
			e.printStackTrace();
			System.exit(1);
		} catch (FileNotFoundException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}*/
		
		int n = 0;
		try {
			musicScoreText.clear();
			int textIndex = 0;
			InputStream is = MusicScore.class.getResourceAsStream("/music/"+musicName+"/"+difficulty+".txt");
			BufferedReader in = new BufferedReader(new InputStreamReader(is));
			String line;
			
			//	一行を一文字ごとで分割したものを入れるための配列。
			//char[] lineList;
			//	ステージの要素の位置。
			//int px = 0, py = 0;


			//int playerNum = 0;
			while ((line = in.readLine()) != null) {
				n++;
				// テキストをリストに入れる
				musicScoreText.add(line.toString());
			}
			in.close();
			is.close();
		} catch (IOException e) {   // 入出力エラーをつかまえる
			System.err.println(e);  // エラーメッセージ出力
			System.exit(1);         // 終了コード 1 で終了する
		} catch (Exception e) {
			System.out.println("Line: " + n);
			e.printStackTrace();
		}
	}
	
}
