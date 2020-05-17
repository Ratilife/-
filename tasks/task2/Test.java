/*
Given two int values, return their sum. Unless the two values are the same, then return double their sum.


sumDouble(1, 2) → 3
sumDouble(3, 2) → 5
sumDouble(2, 2) → 8

Если даны два значения типа int, вернуть их сумму. Если два значения не совпадают, верните двойную их сумму.


sumDouble (1, 2) → 3
sumDouble (3, 2) → 5
sumDouble (2, 2) → 8
 */
class Test{
    public static int sumDouble(int a, int b) {
        int sum;
        if(a==b){
            sum = (a+a)+(b+b);
            return sum;
        } else {
            sum = a+b;
            return sum;
        }
    }
    public static void main(String[] args) {
        System.out.println("sum = "+sumDouble(3,3));
    }
}
