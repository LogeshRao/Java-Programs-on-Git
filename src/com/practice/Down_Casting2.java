package com.practice;

public class Down_Casting2 extends Down_Casting1{
@Override
public void down_cast() {
	super.down_cast();
}
public static void main(String[] args) {
	Down_Casting2 dc = (Down_Casting2) new Down_Casting1();
	dc.down_cast();
}
}
