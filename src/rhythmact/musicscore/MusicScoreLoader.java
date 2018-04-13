package rhythmact.musicscore;

import java.awt.Point;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.stream.Stream;

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
//		int width = 0, height = 0;
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
//			height = py;
		}

		return new MusicScore(notes, musicName);
	}
	
	/**
	 * ファイルをマップに読み込む。
	 * @param musicName - 楽曲名
	 * @param difficulty - 難易度
	 */
	private static void loadFile(String musicName, String difficulty) {
		try (Stream<String> file = Files.lines(Paths.get(musicName+"/"+difficulty), StandardCharsets.UTF_8)){
			musicScoreText.clear();
			file.forEach(line -> musicScoreText.add(line));
		} catch (IOException e) { //入出力エラー
			System.err.println(e);
			System.exit(1);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * ファイルロードのテスト用mainメソッド
	 * @param args
	 */
	public static void main(String[] args){
//		MusicScoreLoader.load("test","testscore01");
	}
}
