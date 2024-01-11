package com.setterObjectDepencies;

public class Music {

	private PlayMusic playMusic;

	public void setPlayMusic(PlayMusic playMusic) {
		this.playMusic = playMusic;
	}

	public void playMusic() {
		playMusic.playing();
	}

}
