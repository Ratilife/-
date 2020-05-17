/*
The parameter weekday is true if it is a weekday, and the parameter vacation is true if we are on vacation. We sleep in if it is not a weekday or we're on vacation. Return true if we sleep in.


sleepIn(false, false) → true
sleepIn(true, false) → false
sleepIn(false, true) → true

Параметр weekday имеет значение true, если это будний день, а параметр holiday - true, если мы находимся в отпуске. Мы спим, если не будний день или мы в отпуске. Верните истину, если мы будем спать.


sleepIn (false, false) → true 
sleepIn (true, false) → false 
sleepIn (false, true) → true
*/

class Test {
     //boolean weekday ;
     //boolean vacation ;
     public static boolean sleepIn(boolean weekday, boolean vacation) {
        if (!weekday || vacation){
            return true;
        }
        return false;
    }

    public static void main (String[] args){
        boolean weekday = true;
        boolean vacation = true;
        System.out.println(sleepIn(weekday,vacation));
    }
}
