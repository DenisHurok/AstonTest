public class MyArrayDataException extends Exception {
    MyArrayDataException(int i, int j) {
        super("Неверные данные в ячейке [" + i + "][" + j + "]");
    }
}