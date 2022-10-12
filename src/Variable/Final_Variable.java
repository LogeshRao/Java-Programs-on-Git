package Variable;

public class Final_Variable {
final int a = 200;
private void method_one() {
System.out.println("value of a is "+a);
}
public static void main(String[] args) {
	Final_Variable fv = new Final_Variable();
	fv.method_one();
	System.out.println(fv.a);
	int varName = fv.a;
	System.out.println(varName);
}
}
