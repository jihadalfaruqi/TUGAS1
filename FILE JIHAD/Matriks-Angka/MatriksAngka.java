import java.util.Scanner;
class MatriksAngka {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int sebanyak = input.nextInt();
    
    for (int i = 0; i < sebanyak ;i++){
      for (int j = 0; j < sebanyak ;j++){
        System.out.print(j+ " ");
        
      } 
      System.out.println();
    }
  }
}