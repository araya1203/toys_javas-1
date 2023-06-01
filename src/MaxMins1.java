import java.util.Scanner;

public class MaxMins1 {
    public static int getMax(int num1, int num2) {
        try {
            return Math.max(num1, num2);
        } catch (Exception e) {
            System.out.println("An error occurred in getMax: " + e.getMessage());
            return 0; // 예외 처리 후 기본값 반환 또는 다른 처리 방식을 선택할 수 있습니다.
        }
    }

    public static int getMin(int num1, int num2) {
        try {
            return Math.min(num1, num2);
        } catch (Exception e) {
            System.out.println("An error occurred in getMin: " + e.getMessage());
            return 0; // 예외 처리 후 기본값 반환 또는 다른 처리 방식을 선택할 수 있습니다.
        }
    }

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in); // Create a Scanner object
        try {
            System.out.print("첫 번째 숫자를 입력하세요: ");
            int num1 = myObj.nextInt(); // 첫 번째 숫자 입력

            System.out.print("두 번째 숫자를 입력하세요: ");
            int num2 = myObj.nextInt(); // 두 번째 숫자 입력

            int max = getMax(num1, num2); // getMax 메서드를 호출하여 max 값을 구함

            System.out.println("두 숫자 중 최댓값은 " + max + "입니다.");
          
            int first = 0;
            int second = 0;
            first = myObj.nextInt();
            second = myObj.nextInt();

            int min = getMin(first, second);

            System.out.println(min);

        } catch (Exception e) {
            System.out.println("올바른 숫자를 입력해주세요.");
        }
    }
}