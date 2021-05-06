
import java.util.Scanner;

public class ReverseNumberPatternProgram {
	public static void main(String[] args) {
		ReverseNumberPatternProgram a = new ReverseNumberPatternProgram();
        a.run();
        
    }
	    private void run() {
		Scanner sc = new Scanner(System.in);
	    System.out.println("enter total lenth : ");
	    int n = sc.nextInt();
	    
	for(int row=1; row<=n; row++){
	    for(int col=1; col<=row; col++){
	        System.out.print("# ");
	    }
	     System.out.println();
	}
	    }

}