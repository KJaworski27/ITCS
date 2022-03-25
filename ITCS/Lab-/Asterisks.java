public class Asterisks {

	public static void main(String[] args) {
		
		partA();	
		partB();
		partC();
		partD();
		partE();
		
	}

	/**
	 * Print the asterisks pattern in Part A
	 */
	private static void partA() {
		System.out.println("Part A\n");
      for(int i = 0; i < 10; i++)
      {
         for(int j = 0; j <=i; j++)
         {
         System.out.print("*");
         }         
         System.out.println();
      }
	}
	
	/**
	 * Print the asterisks pattern in Part B 
	 */
	private static void partB() {
		System.out.println("\nPart B\n");
      for(int i = 0; i < 10; i++)
      {
         for(int j = 9; j >= i; j--)
         {
            System.out.print("*");
         }
         System.out.println("");
      }
      
	}
	
	/**
	 * Print the asterisks pattern in Part C
	 */
	private static void partC() {
		System.out.println("\nPart C\n");
      for(int i = 0; i < 10; i++)
      {
         for(int j = 9; j >= i; j--)
         {
            System.out.print(" ");
         }
         for(int j = 0; j <=i; j++)
         {
         System.out.print("*");
         }
         System.out.println("");     
      }
	}

	/**
	 * Print the asterisks pattern in Part D
	 */
	private static void partD() {
		System.out.println("\nPart D\n");
      for(int i = 0; i < 10; i++)
      {
         for(int j = 0; j <=i; j++)
         {
         System.out.print(" ");
         }  
         for(int j = 9; j >= i; j--)
         {
            System.out.print("*");
         }
         System.out.println("");
            
      }

	}

	/**
	 * Print the asterisks pattern in Part E
	 */
	private static void partE() {
		System.out.println("\nPart E\n");
      for(int i = 0; i < 13; i+=2)
      {
         for(int j = 0; j < (13 - i)/2; j++)
         {
            System.out.print(" ");
         }
         for(int j = 0; j <=i; j++)
         {
         System.out.print("*");
         }
         for(int j = 0; j < (13 - i)/2; j++)
         {
            System.out.print(" ");
         }
         System.out.println("");
      }
      for(int i = 13; i > 0; i-=2)
      {
         if(i != 13)
         {
            for(int j = 0; j < (13 - i)/2; j++)
            {
               System.out.print(" ");
            }
            for(int j = 0; j <i; j++)
            {
            System.out.print("*");
            }
            for(int j = 0; j < (13 - i)/2; j++)
            {
               System.out.print(" ");
            }
            System.out.println("");
         }
      }    
	}
}
	

	

