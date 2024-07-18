public class BubbleSort implements Sorter {
    /**
     * Phương thức sắp xếp dữ liệu sử dụng thuật toán Bubble sort.
     * @param data
     * @param order: true sắp xếp theo thứ tự tăng dần, false sắp xếp theo thứ tự giảm dần.
     */
    @Override
    public void sort(double[] data, boolean order) {
        /* TODO */
        if(order){
            sortAscending(data);
        } else {
            sortDescending(data);
        }
    }

    /**
     * Phương thức sắp xếp mảng dữ liệu theo thứ tự tăng dần,
     * sử dụng thuật toán Bubble sort.
     * @param data
     */
    private void sortAscending(double[] data) {
        /* TODO */
        int n = data.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (data[i] > data[j]) {
                    double temp = data[i];
                    data[i] = data[j];
                    data[j] = temp;
                }
            }
        }
    }

    /**
     * Phương thức sắp xếp mảng dữ liệu theo thứ tự giảm dần,
     * sử dụng thuật toán Bubble sort.
     * @param data
     */
    private void sortDescending(double[] data) {
        /* TODO */
        int n = data.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (data[i] > data[j]) {
                    double temp = data[i];
                    data[i] = data[j];
                    data[j] = temp;
                }
            }
        }
    }
}