// program of scope.
class scope {
 public static void main(String args[]) {
 int x; // known to all code within main
 x = 10;
 if(x == 10)
 { //new scope start here
 int y = 20;
 // x and y both known here.
 System.out.println("x and y: " + x + " " + y);
 x = y * 2;
 }
 // y = 100; 
 // x is still known here.
 System.out.println("x is " + x);
 }
}
