package pack2;

import pack1.*;

public class sub2 extends Base
{
	public void disp2()
	{
		
		sub2 s= new sub2();
		//s.fun1(); // no
		//s.fun2(); // no
		s.fun3(); // yes
		s.fun4(); // yes
	}
}
