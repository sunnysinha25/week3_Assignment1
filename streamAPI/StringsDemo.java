/*
Question1
collection of strings
filter - > print strings whose length is >5 and <8 using stream API
 */

package week3_Assignment1.streamAPI;

import java.util.Arrays;
import java.util.List;

public class StringsDemo {

	public static void main(String[] args) {
		List<String> sent= Arrays.asList("AntWalk", "Classes", "Are", "Amazing", ",", "said", "a", "student", "." );
		sent.stream().filter(n->n.length()>5 && n.length()<8).forEach(n->System.out.println(n));

	}

}

/*
EXPECTED INPUT/OUTPUT
AntWalk
Classes
Amazing
student
*/
