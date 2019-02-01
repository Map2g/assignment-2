public class BeerSong{

public static void main(String args[]){
	Ninety_Nine_Bottle_of_Beer();
}

public static void Ninety_Nine_Bottles_of_Beer(){
        int num = 99;
        
        while (num > 0){
            if (num == 1){
                System.out.println(num + " bottle of beer on the wall, " + num +
                    " bottle of beer\ntake one down, pass it around, no more "
                            + "bottles of beer on the wall");
            }
            
            System.out.println(num + " bottles of beer on the wall, " + num + 
                    " bottles of beer\ntake one down, pass it around, " + --num + 
                    " bottles of beer on the wall");
        }
}
}
