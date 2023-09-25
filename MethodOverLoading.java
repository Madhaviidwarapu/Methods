package Methods;

public class MethodOverLoading {
public static void add(int a, String i)
{
	System.out.println(a+i );
}
void add(double a,double c ,int b)
{
	System.out.println(a+c-b);
}
void add(String h,String f)
{
	System.out.println("the combination of "+h+" and "+f+"");
}
}
 class Methods {

	public static void main(String[] args) {
	 MethodOverLoading m=new MethodOverLoading();
	 m.add(45, "madhu");
	 m.add(1.5, 7.8,4) ;
	 m.add("create a new", "variable which declare ");

	}

}
