package array;
//Java program to demonstrate working of Comparator
//interface
import java.util.*;
import java.lang.*;
import java.io.*;

class Studentad {
 int rollno;
 String name, address;

 public Studentad(int rollno, String name,
                String address)
 {
     this.rollno = rollno;
     this.name = name;
     this.address = address;
 }

 public String toString()
 {
     return this.rollno + " "
         + this.name + " "
         + this.address;
 }
}

abstract class Sortbyroll implements Comparator<Studentad> {

 public int compare(Studentad a, Studentad b)
 {
     return a.rollno - b.rollno;
 }
}




public class Compretor {
	 public static void main(String[] args)
	 {
	     Studentad[] arr = { new Studentad(111, "bbbb", "london"),
	                       new Studentad(131, "aaaa", "nyc"),
	                       new Studentad(121, "cccc", "jaipur") };

	     System.out.println("Unsorted");
	     for (int i = 0; i < arr.length; i++)
	         System.out.println(arr[i]);

	     Arrays.sort(arr, 1, 2);

	     System.out.println("\nSorted by rollno");
	     for (int i = 0; i < arr.length; i++)
	         System.out.println(arr[i]);
	 }
	

}


