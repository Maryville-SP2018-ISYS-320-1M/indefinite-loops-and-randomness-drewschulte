/*
	ISYS 320

	Name(s):drew schulte
	Date: april 16
*/

/*
 How many times do you expect the loop to repeat? Remember that 

 
 What do you expect the loop to output?
 
 (a)
 Repeats:10 times
 Expected output:
 (b)
 Repeats:it will count down 10 times
 Expected output:
 (c)
 Repeats:83 times
 Expected output:
 (d)
 Repeats:none
 Expected output:
   
 */

/*
 Was your prediction correct?
 
 (a)yes
 (b)no, it just ran forever 
 (c)no, it just ran forever 
 (d)nope, it outputed b's with an a in the middle 

*/
public class P4_DoLoopPredictions {

	public static void main(String[] args) {
		String word = "a";
		do {
		    word = "b" + word + "b";
		} while( word.length() < 10 );
		System.out.println( word );
		System.out.println("ENDING LOOP TEST");

	}

}
