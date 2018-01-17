class PointTest{
	int x;
	int y;
	public void display(){
		System.out.println("x = " + x + ", y = " + y);
	}
};
class Point3D extends PointTest{
	int z;
};
public class  SangsokTest{
	public static void main(String[] args) {
		Point3D  p3 = new Point3D();
		p3.display();
	}
}
