public class Objective3Lab3 {
  public static void main(String[] args){
    int first, second, third, sum;
    first = 1+ (int)(Math.random() *6);
    second = 1 + (int)(Math.random()*6);
    third = 1+ (int)(Math.random()*6);
    sum = first + second + third;

    System.out.print(first);
    System.out.print(" + ");
    System.out.print(second);
    System.out.print(" + ");
    System.out.print(third);
    System.out.print( " = ");
    System.out.println(sum);

    System.out.println(first + " + " + second + " + " + third + " = " + sum);
    //more efficient way to print the samae thing
}

}
