package com.logic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Config {
	@Autowired
	College col;

	public College getCol() {
		return col;
	}

	public void setCol(College col) {
		this.col = col;
	}
	public void method() {
		System.out.println("config" + col);
	}

}
