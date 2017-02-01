
/* file SchoolClient.java */
public class school_client{
     public static void main (String [ ] args) {
     school school1 = new school (); // calls empty constructor
     school school2 = new school ("UMass Lowell");  // calls other constructor
     school1.setname ("Middlesex Community College");
     System.out.println (school1.getname());
     System.out.println (school2.getname());
     }
}