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
 Repeats:counting down 10 times
 Expected output:
 (c)
 Repeats:83 times
 Expected output:
 (d)
 Repeats:anytime the word is less than 10 letters long 
 Expected output:
   
 */

/*
 Was your prediction correct?
 
 (a)yes 
 (b)wrong , it didnt output anything other than the print line statements 
 (c)wrong, it seemed to run forever until I stopped it 
 (d)wrong , it didnt output anything other than the print line statements 

*/
public class P1_LoopPredictions {

	public static void main(String[] args) {
		System.out.println("STARTING LOOP TEST");
		
		// d
		String word = "a";
		while( word.length() < 10 ) {
		    word = "b" + word + "b";
		}
				
		System.out.println("ENDING LOOP TEST");
	}

}
