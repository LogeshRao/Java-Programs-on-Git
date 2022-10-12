package Variable;

public class Static_Variable {
static int a;
private void method_one() {
System.out.println("value of a is "+a);
}
private void method_two() {
a = 100;
System.out.println("value of override a "+a);
}
public static void main(String[] args) {
	Static_Variable sv = new Static_Variable();
	sv.method_one();
	sv.method_two();
	System.out.println(a);
	int varName = a;
	varName = 120;
	System.out.println(varName);
}
}
