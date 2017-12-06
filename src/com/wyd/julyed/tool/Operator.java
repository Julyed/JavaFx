package com.wyd.julyed.tool;

public enum Operator {
	ADD, SUB, MUL, DIV;
	
	public int calcResult(int a, int b) {
		switch(this) {
		case ADD:
			return a + b;
		case SUB:
			return a - b;
		case MUL:
			return a * b;
		case DIV:
			return a / b;
		}
		return 0;
	}
}
