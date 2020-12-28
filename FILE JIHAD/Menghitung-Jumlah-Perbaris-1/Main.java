import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    int i, j, m, n;
    int matriksnyaanu[][]= new int [10][10];
    int hasil [][]= new int [10][10];
    Scanner scan = new Scanner(System.in);
    m= 5;
    n= 5;
    for (i = 0;i < m;i++){
      for(j=0; j < n;j++){
        matriksnyaanu[i][j] = scan.nextInt();
      
      }
    }
    System.out.println(matriksnyaanu[0][0] + matriksnyaanu[0][1] + matriksnyaanu[0][2] + matriksnyaanu[0][3] + matriksnyaanu[0][4]);
    System.out.println(matriksnyaanu[1][0] + matriksnyaanu[1][1] + matriksnyaanu[1][2] + matriksnyaanu[1][3] + matriksnyaanu[1][4]);
    System.out.println(matriksnyaanu[2][0] + matriksnyaanu[2][1] + matriksnyaanu[2][2] + matriksnyaanu[2][3] + matriksnyaanu[2][4]);
    System.out.println(matriksnyaanu[3][0] + matriksnyaanu[3][1] + matriksnyaanu[3][2] + matriksnyaanu[3][3] + matriksnyaanu[3][4]);
    System.out.println(matriksnyaanu[4][0] + matriksnyaanu[4][1] + matriksnyaanu[4][2] + matriksnyaanu[4][3] + matriksnyaanu[4][4]);
  }
}