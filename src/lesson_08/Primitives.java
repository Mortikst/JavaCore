package src.lesson_08;

public class Primitives {

    public static void main(String[] args) {
        //Логические значения (булевые значения) (bit)
        //Истина -> true -> да -> 1
        boolean answerYuri = true;
        boolean answerPeter = false;

        //Цулые числа
        //Byte - байт
        byte maxByte = 127;
        byte minByte = -128;

        //Short - короткое число, состоит из двух байт или из 16 битов
        short maxShort = 32_767;
        short minShort = -32_768;

        //Integer - целое число, которое состоит из 4байт или из 32 битов
        int maxInteger = 2_147_483_647;
        int minInteger = -2_147_483_648;

        //Long - целое число, которое состоит из 8 байт или из 64 битов
        long maxLong = 9_223_372_036_854_775_807l;
        long minLong = -9_223_372_036_854_775_808l;
    }
}

