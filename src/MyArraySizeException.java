public class MyArraySizeException extends Exception {
    MyArraySizeException(int rows, int cols) {
        super("Массив должен быть размером 4x4, но получен массив размером " + rows + "x" + cols);
    }
}