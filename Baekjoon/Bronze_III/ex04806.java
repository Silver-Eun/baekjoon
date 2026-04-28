package Bronze_III;

import java.util.Scanner;

public class ex04806 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int cnt = 0;
		
		while (sc.hasNextLine()) {
            String a = sc.nextLine();
            
            if(a.length() > 100) {
            	break;
            }
            cnt++;
        }
        
        System.out.println(cnt);
        
        sc.close();
	}

}
