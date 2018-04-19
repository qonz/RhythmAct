package controller;

import java.awt.event.KeyEvent;

import densan.s.game.input.KeyInput;

public class Keyboard {
	public static boolean isPressSpace(){
		return KeyInput.isPress(KeyEvent.VK_SPACE);
	}
	public static boolean isPressLINE0(){
		return KeyInput.isPress(KeyEvent.VK_W, KeyEvent.VK_S, KeyEvent.VK_X);
	}
	public static boolean isPressLINE1(){
		return KeyInput.isPress(KeyEvent.VK_E, KeyEvent.VK_D, KeyEvent.VK_C);
	}
	public static boolean isPressLINE2(){
		return KeyInput.isPress(KeyEvent.VK_R, KeyEvent.VK_F, KeyEvent.VK_V);
	}
	public static boolean isPressLINE3(){
		return KeyInput.isPress(KeyEvent.VK_T, KeyEvent.VK_G, KeyEvent.VK_B,
				KeyEvent.VK_Y, KeyEvent.VK_H, KeyEvent.VK_N);
	}
	public static boolean isPressLINE4(){
		return KeyInput.isPress(KeyEvent.VK_U, KeyEvent.VK_J, KeyEvent.VK_M);
	}
	public static boolean isPressLINE5(){
		return KeyInput.isPress(KeyEvent.VK_I, KeyEvent.VK_K, KeyEvent.VK_COMMA);
	}
	public static boolean isPressLINE6(){
		return KeyInput.isPress(KeyEvent.VK_O, KeyEvent.VK_L, KeyEvent.VK_PERIOD);
	}
	
}
