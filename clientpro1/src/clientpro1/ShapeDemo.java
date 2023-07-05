package clientpro1;
import java.awt.Rectangle;
import java.awt.Shape;

public class ShapeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Shape s[]=new Shape[3];
     s[0]=new Triangle();
     s[1]=new Rectangle();
     s[2]=new Circle();

     for(int i=0;i<s.length;i++)
     {
    	  s[i].draw();
     }
	}

}
