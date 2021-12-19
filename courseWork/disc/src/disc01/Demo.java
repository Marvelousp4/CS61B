package disc01;

public class Demo {
    public static int mystery(int[] inputArray, int k) {
        int x = inputArray[k];
        int answer = k;
        int index = k + 1;
        while (index < inputArray.length) {
            if (inputArray[index] < x) {
                x = inputArray[index];
                answer = index;
            }
            index = index + 1;
        }
        return answer;
    }
    public static void main(String[] args) {
        int[] inputArray = {
            3, 0, 4, 6, 3
        };
        int k = 2;
        int answer = mystery(inputArray, 2);
        System.out.println(answer);
    }
}
