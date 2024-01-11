package com.setterObjectDepencies;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Musician {

	public static void main(String[] args) {
//		Music music = new Music();
//		PlayMusic pM=new PlayMusic();

		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		
		// directly injecting
		Music obj1 = context.getBean("music1", Music.class);
		obj1.playMusic();
		System.out.println("Musician Done via Music 1!!");

		AnotherMusic obj2 = context.getBean("anotherMusic1", AnotherMusic.class);
		obj2.startPlayMusic();
		System.out.println("Musician Done via AnotherMusic 1!!");
		
		// injecting using ref attribute
		System.out.println("-------------------------------------------");
		
		Music obj3= context.getBean("music2", Music.class);

		obj1.playMusic();
		System.out.println("Musician Done via Music 2!!");

		AnotherMusic obj4 = context.getBean("anotherMusic2", AnotherMusic.class);
		obj2.startPlayMusic();
		System.out.println("Another Musician Done via Music 2!!");
		
		EnglishMusic obj5=context.getBean("engmusic1",EnglishMusic.class);
		obj5.penglishPlayMusic();
		System.out.println("English Musician Done via Music 2!!");
	}

}
