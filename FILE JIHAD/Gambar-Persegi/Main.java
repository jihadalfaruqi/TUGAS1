  import java.util.Scanner;
  class Main {
  public static void main(String[] args) {
    Scanner Input = new Scanner (System.in);
    int angka = Input.nextInt();
    for (int i= 0; i <angka;i++){
      for (int j= 5; j >angka;j--){
        System.out.print("*");
        
      }
      System.out.println("*");
      
    }
    
  }
}