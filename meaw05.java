public class meaw05 {
    public static void main(String args[]) {
    int meaw=4;
    for(int i=1;i<=meaw;i++) {
        for(int j=meaw-1;j>=i;j--) {
            System.out.print(" ");
	    }
            System.out.print(i);
            	for(int j=1;j<i;j++) {
                   System.out.print("**");
		   }
                   System.out.println(i);
	           }
                   for(int i=1;i<meaw;i++) {
                      for(int j=1;j<=i;j++){
                           System.out.print(" ");
			   }
            		   System.out.print(meaw-i);
            		         for(int j=meaw-1;j>i;j--) {
                		       System.out.print("**");
				       }
            			       System.out.println(meaw-i);
				}
       		}
}
