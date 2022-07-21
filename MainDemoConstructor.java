class Box
{
double width, height, depth;
Box()
{
width=10;
height=20;
depth=30;
}
}
class MainDemoConstructor
{
public static void main(String args[])
{
Box mybox= new Box();
System.out.println(mybox.width+"\n"+mybox.height+"\n"+mybox.depth);
}
}