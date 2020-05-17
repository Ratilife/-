/**
	Заполнить массив случайными числами и введите max, min, avg(среднее значение).
		Для генерации случайных чисел использовать метод Math.random()
		1) Создаем переменную n - содержит количество элементов массива и создаем массив
		2) Заполняем массив случайными числами
		3) Создаем переменные max, min, avg(среднее)
		4) В цикле перебераем массив и выбираем max и min
		5) определяем среднее число
		6) Выводим на печать
*/
public class Exercise{
	public static void main(String[] args){
		
		int n = 100;
		double[] array = new double[n];
		for(int i = 0; i < array.length; i++){
			array[i] = Math.random();
		}
		
		double max = array[0];
		double min = array[0];
		double avg = 0;
		
		for(int i = 0; i < array.length; i++){
			if (max < array[i]){
				max = array[i];
			} 
			if (min > array[i]){
				min = array[i];
			}
			avg += array[i]/array.length;
		}
		System.out.println("max: "+max);
		System.out.println("min: "+min);
		System.out.println("avg: "+avg);
	}
}