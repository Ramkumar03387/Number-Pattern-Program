
import java.util.Scanner;

public class NumberPatternProgram {
	public static void main(String[] args) {
		NumberPatternProgram a = new NumberPatternProgram();
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
