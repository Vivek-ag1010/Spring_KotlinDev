package com.looseCouplingEx1;

public class StudentCheat {
	private Cheat cheat;

	public void setCheat(Cheat cheat) {
		this.cheat = cheat;
	}
	
	public void cheating()
	{
		cheat.cheat();
	}

}
