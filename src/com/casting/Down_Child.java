package com.casting;

public class Down_Child extends Down_Parent{
@Override
public void principal_Data() {
	super.principal_Data();
}
public static void main(String[] args) {
	Down_Child dchild = (Down_Child) new Down_Parent();
	dchild.principal_Data();
	dchild.dean_Data();
	//exception will occurs
}
}
