package by.belstu.it.Bychkovskaya.basejava;

import java.math.BigInteger;
import static java.lang.Math.*;
import java.nio.charset.Charset;

public class JavaTest {
    public static void main(String[] args) {
        char char1 = 'v';
        int int1 = 10;
        short short1 = 12;
        byte byte1 = 1;
        long long1 = 100;
        boolean bool1 = true;
        String str = "hello";

        String newstring = str + int1;
        System.out.println(newstring);
        String result1 = str + char1;
        System.out.println(result1);
        String result2 = str + 2.34;
        System.out.println(result2);

        byte byte2 = (byte)(byte1 + int1);
        System.out.println(byte2);

        int int2 = (int)(3.9 + long1);
        System.out.println(int2);

        long long2 = (long)(1 + 2147483647l);
        System.out.println(long2);

       /* static int myStaticInt;
        myStaticInt = 3;
        System.out.println(myStaticInt);*/

        boolean bool2 = false && bool1;
        System.out.println(bool2);

        bool2 = bool1 ^ false;
        System.out.println(bool2);

        //bool2 = bool1 + true;

        long number = 9223372036854775807L;
        BigInteger number1 = new BigInteger("9223372036854775807");
        BigInteger number2 = new BigInteger("7fffffffffffffff", 16);
        System.out.println(number1);
        System.out.println(number2);

        char char2 = 'a';
        char char3 = '\u0061';
        char char4 = 97;
        int sum = char1 + char2 + char3;
        System.out.println(sum);

        System.out.println(3.45%2.4);
        System.out.println(1.0/0.0);
        System.out.println(0.0/0.0);
        System.out.println(log(-345));
        System.out.println(Float.intBitsToFloat(0x7F800000));
        System.out.println(Float.intBitsToFloat(0xFF800000));

        int binaryFromString = Integer.parseInt("101010", 2);
        int octalFromString = Integer.parseInt("52", 8);
        int hexadecimalFromString = Integer.parseInt("2A", 16);

        double pi = PI;
        double e = E;

        long roundedPi = round(pi);
        long roundedE = round(e);

        long min = (long) min(pi, e);

        System.out.println("Значение Math.PI: " + pi);
        System.out.println("Значение Math.E: " + e);
        System.out.println("Округленное Math.PI: " + roundedPi);
        System.out.println("Округленное Math.E: " + roundedE);
        System.out.println("Минимум между округленными значениями: " + min);

        double random = random();
        System.out.println("Случайное число из диапазона [0,1): " + random);

        Boolean bool = Boolean.TRUE;
        Character ch = 'A';
        Integer integer = 10;
        Byte b = (byte) 5;
        Short sh = (short) 20;
        Long l = 100L;
        Double d = 3.14;

        // Арифметические операции
        int sum1 = integer + sh;
        double product = d * l;

        // Логические операции
        boolean logicalAnd = bool && (b > sh);
        boolean logicalOr = bool || (integer == 0);

        // Битовые операции
        int bitAnd = integer & sh;
        int bitOr = integer | sh;
        int bitXor = integer ^ sh;
        int bitShiftRight = integer >> 2;
        int bitShiftLeft = integer << 1;
        int bitShiftUnsignedRight = integer >>> 2;
        int bitNot = ~integer;

        System.out.println("MIN_VALUE для Long: " + Long.MIN_VALUE);
        System.out.println("MAX_VALUE для Long: " + Long.MAX_VALUE);
        System.out.println("MIN_VALUE для Double: " + Double.MIN_VALUE);
        System.out.println("MAX_VALUE для Double: " + Double.MAX_VALUE);

        // Упаковка (boxing)
        int primitiveInt = 42;
        Integer boxedInt = Integer.valueOf(primitiveInt);

        byte primitiveByte = 8;
        Byte boxedByte = Byte.valueOf(primitiveByte);

        System.out.println("Boxed Integer: " + boxedInt);
        System.out.println("Boxed Byte: " + boxedByte);

        // Распаковка (unboxing)
        int unboxedInt = boxedInt.intValue();
        byte unboxedByte = boxedByte.byteValue();

        System.out.println("Unboxed Integer: " + unboxedInt);
        System.out.println("Unboxed Byte: " + unboxedByte);

        Integer parsedInt = Integer.parseInt("100");
        String hexString = Integer.toHexString(255);
        int compareResult = Integer.compare(10, 5);
        String intToString = Integer.toString(123);
        int bitCount = Integer.bitCount(255);
        boolean isNaN = Double.isNaN(3.14);

        System.out.println("Результат парсинга: " + parsedInt);
        System.out.println("Шестнадцатеричное представление: " + hexString);
        System.out.println("Результат сравнения: " + compareResult);
        System.out.println("Строковое представление: " + intToString);
        System.out.println("Количество установленных бит: " + bitCount);
        System.out.println("Проверка на NaN: " + isNaN);

        String strin = "2345";

        int convertedInt2 = Integer.valueOf(strin);
        System.out.println("Преобразование с использованием метода valueOf(): " + convertedInt2);

        int convertedInt3 = Integer.parseInt(strin);
        System.out.println("Преобразование с использованием метода parseInt(): " + convertedInt3);

        // Перевод строки в массив байтов
        byte[] byteArray = strin.getBytes(Charset.defaultCharset());
        System.out.println("Строка в массив байтов: " + byteArrayToString(byteArray));

        // Перевод массива байтов в строку
        String convertedStr = new String(byteArray, Charset.defaultCharset());
        System.out.println("Массив байтов в строку: " + convertedStr);

        String string1 = "true";

        // Преобразование строки в логический тип с использованием метода parseBoolean()
        boolean bool3 = Boolean.parseBoolean(string1);
        System.out.println("Преобразование с использованием метода parseBoolean(): " + bool3);

        // Преобразование строки в логический тип с использованием метода valueOf()
        boolean bool4 = Boolean.valueOf(string1);
        System.out.println("Преобразование с использованием метода valueOf(): " + bool4);

        String str1 = "Hello";
        String str2 = "Hello";

        System.out.println("Сравнение с использованием оператора ==:");
        System.out.println(str1 == str2);

        System.out.println("Сравнение с использованием метода equals():");
        System.out.println(str1.equals(str2));

        System.out.println("Сравнение с использованием метода compareTo():");
        System.out.println(str1.compareTo(str2));

        str1 = null;

        System.out.println("Сравнение с одной строкой, присвоенной null:");
        System.out.println(str1 == str2);
        //System.out.println(str1.equals(str2)); // вызовет NullPointerException
        //System.out.println(str1.compareTo(str2)); // вызовет NullPointerException

        // Разделение строки с использованием функции split()
        String[] splitArray = str.split(",");
        System.out.println("Разделенная строка:");
        for (String s : splitArray) {
            System.out.println(s);
        }

        // Проверка наличия подстроки с использованием метода contains()
        boolean containsSubstring = str.contains("World");
        System.out.println("Строка содержит подстроку 'World': " + containsSubstring);

        // Получение хэш-кода строки с использованием метода hashCode()
        int hashCode = str.hashCode();
        System.out.println("Хэш-код строки: " + hashCode);

        // Поиск индекса первого вхождения символа с использованием метода indexOf()
        int indexOfChar = str.indexOf('o');
        System.out.println("Индекс первого вхождения символа 'o': " + indexOfChar);

        // Получение длины строки с использованием метода length()
        int length = str.length();
        System.out.println("Длина строки: " + length);

        // Замена подстроки с использованием метода replace()
        String replacedString = str.replace("Hello", "Hi");
        System.out.println("Замененная строка: " + replacedString);

        char[][] c1;
        char[] c2[];
        char c3[][];

        c1 = new char[3][];
        for (int i = 0; i < c1.length; i++) {
            c1[i] = new char[i + 1];
        }

        c2 = new char[][] { {'a', 'b', 'c'}, {'d', 'e'}, {'f', 'g', 'h', 'i'} };
        c3 = new char[][] { {'a', 'b', 'c'}, {'d', 'e'}, {'f', 'g', 'h', 'i'} };

        boolean comRez = c2 == c3;
        System.out.println(comRez);
        c2 = c3;

        System.out.println("Массив c2:");
        for (char[] row : c2) {
            for (char element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }

        WrapperString wrapperString = new WrapperString();
        String str10 = "Hello, world!";
        char oldChar = 'o';
        char newChar = 'X';

        wrapperString.setStrngClass(str10);
        String replacedStr = wrapperString.replace(wrapperString.getStrngClass(), oldChar, newChar);

        System.out.println("Исходная строка: " + str10);
        System.out.println("Строка после замены: " + replacedStr);


    }
    public class MyClass {
        final int fint = 42;
        public final int pfint = 100;
        public static final int psfint = 200;
    }
    private static String byteArrayToString(byte[] byteArray) {
        StringBuilder sb = new StringBuilder();
        for (byte b : byteArray) {
            sb.append(String.format("%02X ", b));
        }
        return sb.toString();
    }
    public static class WrapperString {
        public void setStrngClass(String strngClass) {
            this.strngClass = strngClass;
        }

        public String getStrngClass() {
            return strngClass;
        }
        private String strngClass;

        public String replace(String str, char oldChar, char newChar) {
            char[] charArray = str.toCharArray();
            for (int i = 0; i < charArray.length; i++) {
                if (charArray[i] == oldChar) {
                    charArray[i] = newChar;
                }
            }
            return new String(charArray);
        }
    }

}
