public class Array {
    private int data[];
    // 数组大小
    private int n;
    //数组实际元素个数
    private int count;
    public Array(int capacity) {
        this.data = new int[capacity];
        this.n = capacity;
        this.count = 0;
    }

    public int find(int index) {
        if (index < 0 || index >= count) {
            return -1;
        } else {
            return data[index];
        }
    }

    public boolean insert(int index, int a) {
        // 数组已满
        if (count == n) {
            return false;
        } else {
            // 数组未满
            //位置不合法
            if (index < 0 || index > count) {
                return false;
            } // 位置合法
            else {
                for (int i = count; i > index; i--) {
                    data[i] = data[i-1];
                }
                data[index] = a;
                count++;
                return true;
            }
        }
    }

    public boolean delete(int index) {
        if (index < 0 || index >= count) {
            return false;
        } else {
            // 从删除位置开始，所有元素向前移动一位
            for (int i = index + 1; i < count; i++) {
                data[i-1] = data[i];
            }
            count--;
            return true;
        }
    }

    public void printAll() {
        for (int i = 0; i < count; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Array array = new Array(5);
        array.printAll();

        array.insert(0, 3);
        array.insert(0, 4);
        array.insert(1, 5);
        array.insert(3, 9);
        array.insert(3, 10);
        array.printAll();

        array.delete(4);
        array.printAll();
        array.delete(0);
        array.printAll();
        array.delete(1);
        array.printAll();
    }
}
