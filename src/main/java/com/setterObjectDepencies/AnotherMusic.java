package com.setterObjectDepencies;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnotherMusic {
	private PlayMusic playMusic;

	public void setPlayMusic(PlayMusic playMusic) {
		this.playMusic = playMusic;
	}

	public void startPlayMusic() {
		playMusic.playing();
	}
}
