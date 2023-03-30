package test1;

public class solution {

	public static void main(String[] args) {
		int n = 100;
        
	      if(n<=100 && n>=1){
	          if(n%2 != 0){
	              System.out.println("Weird");
	          }
	        if(n%2 == 0){
	            if(n>2 && n<5){
	                System.out.println("Not Weird");
	            }else if(n<20 && n>6){
	                System.out.println("Weird");
	            }else if(n>20) {
	                System.out.println("Not Weird");
	                }
	            else{
	            	 System.out.println("Weird");
	            }
	        }
	      }

	}

}
