package W04;

public class Q_1 {
    public static void main(String[] args) {
        double[] arr = { 1.0, 2.0, 3.0, 4.0 };
        int sum = 0, i;

        for (i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " "); // 배열 출력
        }
        System.out.println(""); // 줄바꿈

        for (i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("합은 " + sum); // 전체 합 출력

        double find = arr[0];
        for (i = 0; i < arr.length; i++) {
            if (find < arr[i]) {        // 최대 값 찾기
                find = arr[i];
            }
        }
        System.out.print("최대값은 " + find); // 최대 값 출력

    }
}
