class HomeWork02 {
    public static void main (String args[]) {
    /*  3. В методе main() вызвать полученный метод, обработать возможные исключения MySizeArrayException и MyArrayDataException,
                    и вывести результат расчета.

     */

        String[][] dataGood = {{"5", "10", "22", "3"}, {"4", "7", "19", "3"}, {"3", "2", "2", "3"}, {"3", "4", "11", "3"}};
        String[][] dataBad1 = {{"5", "10", "22", "3"}, {"4", "7", "19", "3"}, {"3", "2", "2", "3"}};
        String[][] dataBad2 = {{"5", "10", "d", "3"}, {"4", "7", "19", "3"}, {"3", "2", "2", "3"}, {"3", "4", "11", "3"}};
        int s = 0;
        try{
            try {
                s =  testEx(dataBad2);
            } catch (MyArryaSizeException e){
                System.out.println(e.toString());
                System.exit(1);
            }
        } catch (MyArrayDataException e1){
            System.out.println(e1.toString());
            System.exit(1);
        }

        System.out.println("Сумма элементов равна " + s);
    }


    
   /*
   1. Напишите метод, на вход которого подаётся двумерный строковый массив размером 4х4,
при подаче массива другого размера необходимо бросить исключение MyArraySizeException.
    */

    public static int testEx(String[][] data) throws MyArryaSizeException, MyArrayDataException {
        int s =0;
        if (data.length != 4) throw new MyArryaSizeException();

     /*
     2. Далее метод должен пройтись по всем элементам массива, преобразовать в int, и просуммировать.
Если в каком-то элементе массива преобразование не удалось (например, в ячейке лежит символ или текст вместо числа),
должно быть брошено исключение MyArrayDataException, с детализацией в какой именно ячейке лежат неверные данные.
      */
        for (int x =0; x < data.length ; x ++ ) {
            for (int y = 0; y < data.length; y ++) {
                try {
                    s += Integer.parseInt(data[x][y]);
                }
                catch (NumberFormatException e) {
                    throw new MyArrayDataException(x ,y);
                }
            }
        }
        return s;
    }

}


