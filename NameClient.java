public class NameClient
{
public static void main (String [] args){

Name in = new Name();
in.setLast("Flintstone") ;
in.setFirst("Fred");
System.out.print(in.getLast( ));
System.out.print(", ");
System.out.println(in.getFirst());

System.out.println(in.getLast() + ", " + in.getFirst());
}
}