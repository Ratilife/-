public class ArrayList_AND_Generics{
	/*
	Ввод списка целых чисел с клавиатуры
	*/
	public static void main(String[] args) throws IOExceptin{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<String> list = new ArraList<String>();
		while(true){
			String s = reader.readLine();//readline () считывает строку текста.
			if(s.isEmpty()) {			//Метод isEmpty() класса java.util.ArrayList в Java возвращает true, если этот список не содержит элементов.
				break
			}
			list.add(Integer.parseInt(s)); //Этот метод используется для получения примитивного типа данных определенной строки
		}

	}
	
	/*
	То же, чётные числа добавляются в конец списка, нечётные — в начало.
	*/
	public static void main (String[] args) throws IOExceptin{
		BuffereReader reader = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<String> lit = new ArrayList<String>();
		while(true){
			String s  = reader.readLine();
			if(s.Empty()) break
			int x = Integer.parseInt(s);
			if(x % 2 ==0){                     // проверяем, что остаток от деления на два равен нулю 
				list.add(x);                   // добавление в конец
			}else{
				list.add(0,x);				   // вставка в начало
			}
		}		
	}
	/*
	Удаление всех чисел больше 5:
	*/
	public static void main(String[] args) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<String> list = new ArrayReader<String>();
		list.add(1);      // Добавление элемента в конец списка
		list.add(7);
		list.add(11);
		list.add(3);
		list.add(15);
		for(int i = 0; i < list.size();){       // убрать увеличение i внутрь цикла      size() - Получение количества элементов
			if(list.get(i) > 5){				// get()-  Взятие элемента из коллекции
				list.remove(i);                  //не увеличиваем i, если удалили текущий  элемент   remove() - удалить элемент
			}else{
				i++;
			}
		}
	}
	/*
	Разделение массива на два — чётных и нечётных чисел
	*/
	public static void main(String[] args) throws IOException
	{
		//статическая инициализация массива
		int[] data = {1, 5, 6, 11, 3, 15, 7, 8};

		//создание списка, где все элементы должны быть типа Integer
		ArrayList<Integer> list = new ArrayList<Integer> ();

		//заполнение списка из массива
		for (int i = 0; i < data.length; i++) {
			list.add(data[i])
		};

		ArrayList<Integer> even = new ArrayList<Integer>();  //чётные
		ArrayList<Integer> odd = new ArrayList<Integer>();    //нечётные

		for (int i = 0; i < list.size(); i++)
		{
			Integer x = list.get(i);
			if (x % 2 == 0)    //если x - чётное
				even.add(x);   // добавляем x в коллекцию четных чисел
			else
				odd.add(x);    // добавляем x в коллекцию нечетных чисел
		}
	}
	
	/*
	Слияние списков.
	*/
	public static void main(String[] args) throws IOException
	{
		ArrayList<Integer> list1 = new ArrayList<Integer>();   //создание списка
		Collections.addAll(list1, 1, 5, 6, 11, 3, 15, 7, 8);   //заполнение списка

		ArrayList<Integer> list2 = new ArrayList<Integer>();
		Collections.addAll(list2, 1, 8, 6, 21, 53, 5, 67, 18);

		ArrayList<Integer> result = new ArrayList<Integer>();

		result.addAll(list1);   //добавление всех значений из одного списка в другой
		result.addAll(list2);

		for (Integer x : result)   //быстрый for по всем элементам, только для коллекций
		{
			System.out.println(x);
		}
	}
}