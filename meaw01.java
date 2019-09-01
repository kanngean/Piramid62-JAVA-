public class meaw01 {
    public static void main(String args[]){
    int meaw=4;
    for(int i=1;i<=meaw;i++){
       for(int j=2;j<=i;j++){
           System.out.print(" ");
            		}
           System.out.print(i+""+i);
              for(int j=meaw;j>=(i+1);j--){
                 System.out.print("**");          
           		}
            	 System.out.println(i+""+i);
        	}
    	}
}
