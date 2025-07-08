// https://school.programmers.co.kr/learn/courses/30/lessons/12941
package level2.july07;

public class Practice12941 {
    public static void main(String[] args) {
        int answer = 0;
        int[] A = {1, 4, 2};
        int[] B = {5, 4, 4};

        int totCnt = (A.length * (B.length - 1)) / 2;

        for (int i = 0; i < A.length; i++) {
            int n1 = A[i];
        }

        // return answer;
        System.out.println(answer);
    }

    public static void quickSort(int[] arr, int left, int right) {
        int i, j, pvt, tmp;

        if (left < right) {
            i = left;
            j = right;
            pvt = arr[left];

            // 분할과정
            while (i < j) {
                while (arr[j] > pvt) j--;
                while (i < j && arr[i] <= pvt) i++;

                tmp = arr[i];
                arr[i] = arr[j];
                arr[j] = tmp;
            }

            arr[left] = arr[i];
            arr[i] = pvt;

            // 정렬과정
            quickSort(arr, left, i - 1);
            quickSort(arr, i + 1, right);
        }
    }

    public int getMinSum(int[] A, int[] B) {
        int answer = 0;
        int length = A.length;

        quickSort(A, 0, A.length - 1);
        quickSort(B, 0, B.length - 1);

        for(int i=0; i<length; i++){
            answer += A[i] * B[length-1-j];
        }

        return answer;
    }
}
