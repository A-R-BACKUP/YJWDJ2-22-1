package W04;

public class W04_Q_4 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        int i = 0;
        String one = "", two = "", three = "", four = "", five = "", six = "", seven = "", eight = "", nine = "", ten = "";
        for (i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random() * 100);
        }
//        for (i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + " ");
//        }
//        System.out.println("");
        for (i = 0; i < arr.length; i++) {
            if (arr[i] >= 1 && arr[i] <= 10) {
                one += "*";
            } else if (arr[i] >= 11 && arr[i] <= 20) {
                two += "*";
            } else if (arr[i] >= 21 && arr[i] <= 30) {
                three += "*";
            } else if (arr[i] >= 31 && arr[i] <= 40) {
                four += "*";
            } else if (arr[i] >= 41 && arr[i] <= 50) {
                five += "*";
            } else if (arr[i] >= 51 && arr[i] <= 60) {
                six += "*";
            } else if (arr[i] >= 61 && arr[i] <= 70) {
                seven += "*";
            } else if (arr[i] >= 71 && arr[i] <= 80) {
                eight += "*";
            } else if (arr[i] >= 81 && arr[i] <= 90) {
                nine += "*";
            } else if (arr[i] >= 91 && arr[i] <= 100) {
                ten += "*";
            }
        }

        System.out.println("1  -  10: " + one);
        System.out.println("11 -  20: " + two);
        System.out.println("21 -  30: " + three);
        System.out.println("31 -  40: " + four);
        System.out.println("41 -  50: " + five);
        System.out.println("51 -  60: " + six);
        System.out.println("61 -  70: " + seven);
        System.out.println("71 -  80: " + eight);
        System.out.println("81 -  90: " + nine);
        System.out.println("91 - 100: " + ten);
    }
}
