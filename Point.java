public class Point {
	protected double x;
	protected double y;		
	public double getX() {
		return this.x;
	}
	public double getY() {
		return this.y;
	}
	Point(double x1, double y1)
	{
		x=x1;
		y=y1;
	}
	Point(){
		this.x=0;
		this.y=0;
	} 
	public String isOrigin() {
		if ((x==0)&&(y==0))
		{
			String la="True";
			 return la;
		}
		else
		{
			String la="False";
			 return la;
		}
		}
	
	public String print()
	{
		String ho =String.format( "%.4f", x ) ;
		String mo =String.format( "%.4f", y ) ;

		String lala= (" ( "+ho+", "+mo+" )");
		return lala;
	}
	public Point sum(Point p2)
	{
		return new Point(x + p2.x, y+ p2.y);
	}
	public Point sub(Point p2)
	{
		return new Point(x - p2.x, y- p2.y);
	}
	public Point mul(Point p2)
	{
		return new Point(x * p2.x, y* p2.y);
	}
	public Point div(Point p2)
	{
		return new Point(x / p2.x, y/ p2.y);
	}
	public float slope(Point p)
	{
		return (float) ((float)(p.y - y)/(p.x - x));
	}
	private double absolute(double d)
	{
		if (d<0)
		{
			return -d;
		}
		else return d;
		 
	}
	public double distance(Point p)
	{
		double num = absolute(p.x- x)+absolute(p.y- y);
		return num;
	}
	public String EoL(Point p2) {
		double m = slope(p2);
		double c = y-m*x ;
		String kk = ("y = "+m+"x + "+c);
		return kk;
			}
	
	public boolean colinear(Point r, Point p2) {
		if(slope(r)==slope(p2)) {
			return true;
		}
			else 
				return false;
	}
	
	public  String equals(Point p2) {
		if((this.x==p2.x)&&(this.y==p2.y)) {
			 String la="True";
			 return la;
		}
		else {
			 String la="False";
			 return la;
		}
	}
	
	public Point scalarMultiply(double o)
	{
		Point r = new Point(o*x, o*y);
		return r;
		
	}
	public boolean clockwise(Point r, Point p2) {
		if(slope(r)>slope(p2)) {
			return true;
		}
			else 
				return false;
	}
	public String toString() {
		return "(" + x + ", " + y + ")";
	}
}
