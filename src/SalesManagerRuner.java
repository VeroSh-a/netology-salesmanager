import netology.SalesManager;

public class SalesManagerRuner {
     public static void main(String[] args) {
          int result;
          int[] sales = {1, 3, 5, 7};
          SalesManager SM = new SalesManager(sales);
          result = SM.max();
          System.out.println(result);
     }
}
