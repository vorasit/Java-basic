public class recus {
    public static void main(String[] args) {
        int result = sum(5, 10);
        int result1 = sum(1, 10);
        int x = 1;
        int y = 55;
        int result2 = sum(x, y);
        System.out.println(result);
        System.out.println(result1);
        System.out.println(result2);
      }
      // Java Recursion
      static int sum(int start, int end){
        if(end > start){
            return end + sum(start, end-1);
        }else{
            return end;
        }
      }
}
