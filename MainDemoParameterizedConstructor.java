class Box
{
double height,width,depth;
Box(double h, double w, double d)
{
height=h;
width=w;
depth=d;
}
}
class MainDemoParameterizedConstructor
{
public static void main(String args[])
{
Box mybox=new Box(60,80,37);
System.out.println(mybox.height+"\n"+mybox.width+"\n"+mybox.depth);
}
}