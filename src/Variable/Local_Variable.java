package Variable;

public class Local_Variable {
private void method_One() {
int a = 18;
a = 20;
System.out.println("Value = "+a);
}
private void method_Two() {
String s = "Variable Value is a";
System.out.println(s);
}
public static void main(String[] args) {
	Local_Variable local = new Local_Variable();
	local.method_One();
	local.method_Two();
}
}
