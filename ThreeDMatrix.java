// Demonstrate 3 dimensional matrix
public class ThreeDMatrix{

 public static void main (String args []){
 
 int threeD [] [] [];
 threeD = new int [5] [3] [3];
 int i,j,k;


   for (i=0; i<5; i++)
      for (j=0; j<3; j++)
         for (k=0; k<3; k++)
            threeD [i] [j] [k] = i * j * k;



  
   for (i=0; i<5; i++){
      for (j=0; j<3; j++){
         for (k=0; k<3; k++)
         System.out.print(threeD [i] [j] [k] + " ");   
      System.out.println();
      }
     System.out.println();
    }

 }



}
