public class BinarySearch implements Search {
    private static BinarySearch instance;
    private Sorter sorter;

    private BinarySearch() {
        /* TODO */
    }

    /**
     * Tạo đối tượng BinarySearch.
     * @return
     */
    public static BinarySearch getInstance() {
        if(instance == null) {
            instance = new BinarySearch();
        }
        return instance;
    }

    public void setSorter(Sorter sorter) {
        /* TODO */
        this.sorter = sorter;
    }

    @Override
    public int search(double[] data, double value) {
        sort(data);
        return binarySearch(data, value);
    }

    private int binarySearch(double[] data, double value) {
        /* TODO */
        int left = 0;
        int right = data.length - 1;
        while (left <= right) {
            int mid = left + (right- left) / 2;
            if (data[mid] == value) {
                return mid;
            }
            if (data[mid] < value) {
                left = mid + 1;
            }
            if (data[mid] > value) {
                right = mid - 1;
            }
        }
        return -1;
    }

    private void sort(double[] data) {
        /* TODO */
        if(sorter != null) {
            sorter.sort(data, true);
        }
    }
}
