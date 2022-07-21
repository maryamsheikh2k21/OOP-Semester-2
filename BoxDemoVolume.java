class Box
{
double width;
double height;
double depth;
void volume()
{
System.out.println(width*height*depth);
}
}
//this class declares an object ob box type
class BoxDemoVolume
{
public static void main(String args[])
{
Box mybox=new Box();
//assign values to instance variables of mybox
mybox.width=10;
mybox.height=20;
mybox.depth=30;
//compute volume of the box
mybox.volume();
}
}