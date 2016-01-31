public static void main(String[] args) {


        int bottlesOfBeer = 99; //Initial Number of Bottles to begin with
        String word = "bottles";

		while (bottlesOfBeer> 0)
		 {
		   if (bottlesOfBeer == 1) {
		      word = "bottle";
		    }
		   else {
		      word = "bottles";
		    }
            System.out.println(bottlesOfBeer + " " + word + " of beer on the wall, " + bottlesOfBeer + " " + word + " of beer");
            System.out.println("Take one down, pass it around, ");
            bottlesOfBeer = bottlesOfBeer - 1;
	
	           if (bottlesOfBeer > 0) {
		      System.out.println(bottlesOfBeer + " " + word + " of beer on the wall.\n");
		   } else {
		      System.out.println("No more bottles of beer on the wall\n");
		   }
																			        } //End of Song loop
																		    } // End of Ninety_Nine_Bottles_of_Beer

