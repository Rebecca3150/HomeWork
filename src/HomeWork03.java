
public class HomeWork03 {
    public static void main(String[] args) {

        //将五个无序：24,69,80,57,13，使用冒泡排序将其排成一个从小到大的有序数列
        int[] arr = {24, 69, 80, 57, 13};
        boolean flag = false;
        for(int len = arr.length;len>=0;len--) {
            if (flag) break;
            flag = true;
            for (int j = 0; j < len - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                } else
                    flag = false;
            }
        }
        System.out.print("结果");
        System.out.print("结果2");
    }
}
