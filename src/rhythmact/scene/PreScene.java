package rhythmact.scene;

import densan.s.game.drawing.Drawer;
import game.Scene;
import game.SceneManager;
import rhythmact.musicscore.MusicScoreManager;

public class PreScene extends Scene {
	int i=0;

	public PreScene(SceneManager sceneManager) {
		super(sceneManager);
		// TODO 自動生成されたコンストラクター・スタブ
		MusicScoreManager.getInstance().load("kaeru", "easy");

	}

	@Override
	public void update() {
		// TODO 自動生成されたメソッド・スタブ
		i++;
		if(i==120)
			handle();
	}

	@Override
	public void draw(Drawer d) {
		// TODO 自動生成されたメソッド・スタブ
		
	}

	@Override
	public void handle() {
		// TODO 自動生成されたメソッド・スタブ
		getSceneManager().setScene(new TitleScene(getSceneManager()));
		
	}

}
