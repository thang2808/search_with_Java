import java.util.Arrays;
import java.util.Random;

public class TestBinarySearch {
    public static void main(String[] args) {
        /* Yêu cầu:
        - Sinh ra ngẫu nhiên một số tự nhiên có giá trị nằm trong khoảng [20 - 30].

        - Sinh ra ngẫu nhiên một mảng các số kiểu double, có kích thước bằng số tự nhiên đã sinh ngẫu nhiên ở trên.
        - Tạo đối tượng có kiểu dữ liệu BinarySearch. Dùng đối tượng này test thuật toán tìm kiếm nhị phân với
          mảng dữ liệu đã sinh ra, và sử dụng 3 thuật toán sắp xếp khác nhau như đã cho.

          Các kết quả test được in ra terminal theo định dạng: ví dụ
          Using Bubble Sort Algorithm:
          Before sorting: [5.0 4.0 3.0 2.0 1.0]
          After sorting: [1.0 2.0 3.0 4.0 5.0]
          Binary search giá trị 3.0: 2

          Using Insertion Sort Algorithm:
          Before sorting: [5.0 4.0 3.0 2.0 1.0]
          After sorting: [1.0 2.0 3.0 4.0 5.0]
          Binary search giá trị 6.0:-1

        - Kết quả chạy chương trình lưu vào file text được đặt tên <TenSinhVien_MaSinhVien_BinarySearch.txt.
        - Nén các file source code và file text kết quả chạy chương trình vào file zip có tên
          <TenSinhVien_MaSinhVien_BinarySearch>.zip (Ví dụ, NguyenVanA_123456_BinarySearch.zip),
          nộp lên classroom
         */

        Random random = new Random();
        int randomNumber = random.nextInt(11)+20;
        //System.out.println(randomNumber);

        double[] array = new double[randomNumber];
        for (int i = 0; i < randomNumber; i++) {
            array[i] = random.nextDouble() * 100;
        }

        BinarySearch binarySearch = BinarySearch.getInstance();

        System.out.println("Using Bubble Sort Algorithm:");
        System.out.print("Before sorting: [");
        for (int i = 0; i < array.length; i++) {
            System.out.printf("%.1f ", array[i]);
        }
        System.out.println("]");
        double[] bubbleSortedArray = Arrays.copyOf(array, array.length);
        new BubbleSort().sort(bubbleSortedArray, true);
        System.out.print("After sorting: [");
        for (int i = 0; i < bubbleSortedArray.length; i++) {
            System.out.printf("%.1f ", bubbleSortedArray[i]);
        }
        System.out.println("]");

        double valueToSearch = bubbleSortedArray[new Random().nextInt(bubbleSortedArray.length)];
        int index = binarySearch.search(bubbleSortedArray, valueToSearch);
        System.out.printf("Binary search giá trị: %.1f : %d" , valueToSearch ,index );

        System.out.println();
        System.out.println("Using Insertion Sort Algorithm:");
        System.out.print("Before sorting: [");
        for (int i = 0; i < array.length; i++) {
            System.out.printf("%.1f ", array[i]);
        }
        System.out.println("]");
        double[] insertSortedArray = Arrays.copyOf(array, array.length);
        new InsertionSort().sort(insertSortedArray, true);
        System.out.print("After sorting: [");
        for (int i = 0; i < insertSortedArray.length; i++) {
            System.out.printf("%.1f ", insertSortedArray[i]);
        }
        System.out.println("]");

        valueToSearch = insertSortedArray[new Random().nextInt(bubbleSortedArray.length)];
        index = binarySearch.search(insertSortedArray, valueToSearch);
        System.out.printf("Binary search giá trị: %.1f : %d" , valueToSearch ,index );


        System.out.println();
        System.out.println("Using selection Sort:");
        System.out.print("Before sorting: [");
        for (int i = 0; i < array.length; i++) {
            System.out.printf("%.1f ", array[i]);
        }
        System.out.println("]");
        double[] selectionSortedArray = Arrays.copyOf(array, array.length);
        new SelectionSort().sort(selectionSortedArray, true);
        System.out.print("After sorting: [");
        for (int i = 0; i < selectionSortedArray.length; i++) {
            System.out.printf("%.1f ", selectionSortedArray[i]);
        }
        System.out.println("]");

        valueToSearch = selectionSortedArray[new Random().nextInt(bubbleSortedArray.length)];
        index = binarySearch.search(selectionSortedArray, valueToSearch);
        System.out.printf("Binary search giá trị: %.1f : %d" , valueToSearch ,index );
    }
}