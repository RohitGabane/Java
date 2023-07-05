package pack1;

public class sub1 extends Base{
public void disp1()
{
	sub1 s= new sub1()	;
//	s.fun1() ;// no
	s.fun2() ;// yes
	s.fun3(); // yes
	s.fun4(); // yes
}
}