public class MyArrayDataException extends Exception {
    public MyArrayDataException(int x, int y) {
        super ("Неверный формат в ячейке " + x + " , " + y);

    }
}
