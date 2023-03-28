
import java.util.*;
public class Sort2 {

	public static void main(String[] args) {
		
       int n;
       String temp;
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the size of Array :");
       n=sc.nextInt();
       String names[]=new String[n];
       for(int i=0;i<n+1;i++){
        names[i]=sc.nextLine();
       }
      
       /*for (int i = 0; i < n; ++i) {
        for (int j = i + 1; j < n; ++j) {
           
           
            if (names[i].compareTo(names[j]) > 0) {
                
                temp = names[i];
                names[i] = names[j];
                names[j] = temp;
            }
        }
    }*/
       
    for (int i = 0; i < n+1; i++) {
        System.out.println(names[i]);
    }




sc.close();
}
}

