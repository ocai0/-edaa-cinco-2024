class BinarySearch {
    public static int searchFor(int[] _array, int searchValue) {
        return BinarySearch.searchFor(_array, searchValue, 0, _array.length - 1);
    }

    public static int searchFor(int[] _array, int searchValue, int start, int end) {
        int middleIndex = (start + end) / 2;
        if (end >= start) {
            if (_array[middleIndex] == searchValue)
                return middleIndex;
            if (_array[middleIndex] > searchValue)
                return BinarySearch.searchFor(_array, searchValue, start, middleIndex - 1);
            if (_array[middleIndex] < searchValue)
                return BinarySearch.searchFor(_array, searchValue, middleIndex + 1, end);
        }
        return -1;
    }
}