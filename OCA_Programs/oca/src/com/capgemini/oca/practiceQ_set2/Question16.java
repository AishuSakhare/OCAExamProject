package com.capgemini.oca.practiceQ_set2;

public class Question16 {

}

class Speak { /* Line 1 */
	static void main(String[] args) { /* Line 2 */
		Speak speakIT = new Tell(); /* Line 3 */
		Tell tellIt = new Tell(); /* Line 4 */
//speakIT.tellItLikeItIs(); /* Line 5 */
//(Truth)speakIt.tellItLikeItIs(); /* Line 6 */
//((Truth)speakIt).tellItLikeItIs(); /* Line 7 */
		tellIt.tellItLikeItIs(); /* Line 8 */
		((Truth) tellIt).tellItLikeItIs(); /* Line 9 */
		((Truth) tellIt).tellItLikeItIs(); /* Line 10 */
	}
}

class Tell extends Speak implements Truth {
	public void tellItLikeItIs() {
		System.out.println("Right on!");
	}
}

interface Truth {
	public void tellItLikeItIs();
};
