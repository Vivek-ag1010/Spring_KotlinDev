package com.annotation.autowired;

import org.springframework.beans.factory.annotation.Autowired;

public class Human {
	// @Autowired
	private Heart heart;

	private Human() {
		// TODO Auto-generated constructor
	}

	@Autowired
	private Human(Heart heart) {
		this.heart = heart;
	}

	// @Autowired
	public void setHeart(Heart heart) {
		this.heart = heart;
	}

	public void startPumping() {
		if (heart != null) {
			heart.pump();
			System.out.println("You are alive");
		} else
			System.out.println("Heart fail, died");
	}
}
