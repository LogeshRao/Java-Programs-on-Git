package Variable;

public class Class_Variable {
	int a;
private void method_one() {
	System.out.println("Value of a is "+a);
}
private void method_two() {
	a = 120;
	System.out.println("Value of override a is "+a);
}
public static void main(String[] args) {
	Class_Variable var = new Class_Variable();
	var.method_one();
	var.method_two();
	int varName = var.a;
	System.out.println("Variable value is "+varName);
	System.out.println("Changed variable value is "+(varName+120));
}
}
