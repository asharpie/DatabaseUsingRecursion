public class Group {
    private Member[] array = new Member[100];
    private int arraylength = 0;

    public void addMemberToArray(String name, int age){
        array[arraylength] = new Member(name,age);
        arraylength++;
    }

    public int getArraylength() {
        return arraylength;
    }
    public int reccursiveSum(int start) {
        if(start > arraylength-1) {
            return 0;
        }
        return array[start].getAge() + reccursiveSum(start + 1);

    }
    public void callQuickSort(){
        quickSort(0,arraylength-1);
    }
    public void quickSort(int min, int max){
        int pivot;
        if(min < max){
            pivot = partition(min, max);
            quickSort(min, (pivot-1));
            quickSort((pivot + 1), max);
        }
    }

    public int partition(int min, int max){

        int pivot = array[min].getAge();
        int left = min;
        int right = max;
        while(left < right){
            while(array[left].getAge() <= pivot && left < right){
                left++;
            }
            while(array[right].getAge() > pivot){
                right--;
            }
            if(left < right){
                swap(left, right);
            }
        }
        swap(min, right);

        return right;
    }

    public void swap(int left, int right){
        Member temp = array[left];
        array[left] = array[right];
        array[right] = temp;
    }
    public void printArray(){
        for(int i = 0;i<arraylength;i++){
            System.out.println(array[i]);
        }

    }
    public double findAverage(){
        double sum = reccursiveSum(0);
        double length = arraylength;
        double average = sum/length;
        return average;

    }

}
