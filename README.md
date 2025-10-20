# JavaLab1 - Отчёт по лабораторной работе №1

<h2> Общая информация</h2>
<p><strong>Автор:</strong> Конов Михаил ПР-7<br>
<strong>Предмет:</strong> Программирование на Java<br>
<strong>Лабораторная работа:</strong> №1</p>

<hr>

<h2> Задание 1. Методы</h2>

<h3> Задача 2. Сумма знаков</h3>
<p><strong>Сигнатура метода:</strong> <code>public int sumLastNums(int x)</code></p>

<p><strong>Описание:</strong><br>
Метод возвращает сумму двух последних цифр числа.</p>

<p><strong>Алгоритм:</strong></p>
<ol>
<li>Получить последнюю цифру: <code>x % 10</code></li>
<li>Получить предпоследнюю цифру: <code>(x / 10) % 10</code></li>
<li>Вернуть сумму этих цифр</li>
</ol>

<p><strong>Тесты:</strong></p>
<ul>
<li>Вход: <code>1234</code> → Результат: <code>7</code></li>
<li>Вход: <code>&lt; 10</code> → Результат: <code>-1</code></li>
</ul>

<hr>

<h3> Задача 4. Есть ли позитив</h3>
<p><strong>Сигнатура метода:</strong> <code>public boolean isPositive(int x)</code></p>

<p><strong>Описание:</strong><br>
Проверяет, является ли число положительным.</p>

<p><strong>Алгоритм:</strong></p>
<ul>
<li>Если <code>x > 0</code> → <code>true</code></li>
<li>Если <code>x == 0</code> → сообщение "число является нулём"</li>
<li>Иначе → <code>false</code></li>
</ul>

<p><strong>Тесты:</strong></p>
<ul>
<li>Вход: <code>10</code> → Результат: <code>true</code></li>
<li>Вход: <code>-123</code> → Результат: <code>false</code></li>
<li>Вход: <code>0</code> → Сообщение: "число является нулём"</li>
</ul>

<hr>

<h3> Задача 6. Большая буква</h3>
<p><strong>Сигнатура метода:</strong> <code>public boolean isUpperCase(char x)</code></p>

<p><strong>Описание:</strong><br>
Проверяет, является ли символ заглавной буквой.</p>

<p><strong>Алгоритм:</strong></p>
<ul>
<li>Если символ в диапазоне от 'A' до 'Z' → <code>true</code></li>
<li>Иначе → <code>false</code></li>
</ul>

<p><strong>Тесты:</strong></p>
<ul>
<li>Вход: <code>'G'</code> → Результат: <code>true</code></li>
<li>Вход: <code>'r'</code> → Результат: <code>false</code></li>
</ul>

<hr>

<h3> Задача 8. Делитель</h3>
<p><strong>Сигнатура метода:</strong> <code>public boolean isDivisor(int a, int b)</code></p>

<p><strong>Описание:</strong><br>
Проверяет, делится ли одно число на другое нацело.</p>

<p><strong>Алгоритм:</strong></p>
<ul>
<li>Проверка на положительность чисел</li>
<li>Если <code>a % b == 0</code> или <code>b % a == 0</code> → <code>true</code></li>
<li>Иначе → <code>false</code></li>
</ul>

<p><strong>Тесты:</strong></p>
<ul>
<li>Вход: <code>24, 6</code> → Результат: <code>true</code></li>
<li>Вход: <code>12, 8</code> → Результат: <code>false</code></li>
<li>Вход с нулём → Сообщение: "Числа должны быть больше нуля"</li>
</ul>

<hr>

<h3> Задача 10. Многократный вызов</h3>
<p><strong>Сигнатура метода:</strong> <code>public int lastNumSum(int a, int b)</code></p>

<p><strong>Описание:</strong><br>
Вычисляет сумму последних цифр пяти чисел последовательно.</p>

<p><strong>Алгоритм:</strong></p>
<ul>
<li>Сложение последних цифр двух чисел</li>
<li>Последовательное применение к пяти числам</li>
</ul>

<p><strong>Тесты:</strong></p>
<ul>
<li>Вход: <code>1, 2, 3, 4, 5</code> → Результат: <code>5</code></li>
<li>Вход: <code>0, 1, 2, 3, 4</code> → Результат: <code>0</code></li>
</ul>

<hr>

<h2> Задание 2. Условия</h2>

<h3> Задача 2. Безопасное деление</h3>
<p><strong>Сигнатура метода:</strong> <code>public double safeDiv(int x, int y)</code></p>

<p><strong>Описание:</strong><br>
Выполняет безопасное деление с проверкой на ноль.</p>

<p><strong>Алгоритм:</strong></p>
<ul>
<li>Если <code>y == 0</code> → возврат <code>0</code></li>
<li>Иначе → возврат <code>(double)x / y</code></li>
</ul>

<p><strong>Тесты:</strong></p>
<ul>
<li>Вход: <code>5, 0</code> → Результат: <code>0</code></li>
<li>Вход: <code>8, 2</code> → Результат: <code>4.0</code></li>
<li>Вход: <code>5, 2</code> → Результат: <code>2.5</code></li>
</ul>

<hr>

<h3> Задача 4. Строка сравнения</h3>
<p><strong>Сигнатура метода:</strong> <code>public String makeDecision(int x, int y)</code></p>

<p><strong>Описание:</strong><br>
Создает строку сравнения двух чисел.</p>

<p><strong>Алгоритм:</strong></p>
<ul>
<li>Если <code>x > y</code> → <code>"x > y"</code></li>
<li>Если <code>x < y</code> → <code>"x < y"</code></li>
<li>Если <code>x == y</code> → <code>"x == y"</code></li>
</ul>

<p><strong>Тесты:</strong></p>
<ul>
<li>Вход: <code>19, 1</code> → Результат: <code>"19 > 1"</code></li>
<li>Вход: <code>-5, -5</code> → Результат: <code>"-5 == -5"</code></li>
<li>Вход: <code>15, 16</code> → Результат: <code>"15 < 16"</code></li>
</ul>

<hr>

<h3> Задача 6. Тройная сумма</h3>
<p><strong>Сигнатура метода:</strong> <code>public boolean sum3(int x, int y, int z)</code></p>

<p><strong>Описание:</strong><br>
Проверяет, можно ли получить третье число сложением двух других.</p>

<p><strong>Алгоритм:</strong></p>
<ul>
<li>Проверка трех комбинаций: <code>x+y==z</code>, <code>x+z==y</code>, <code>y+z==x</code></li>
<li>Если любая истинна → <code>true</code></li>
<li>Иначе → <code>false</code></li>
</ul>

<p><strong>Тесты:</strong></p>
<ul>
<li>Вход: <code>1, 2, 3</code> → Результат: <code>true</code></li>
<li>Вход: <code>2, 5, 2</code> → Результат: <code>false</code></li>
</ul>

<hr>

<h3> Задача 8. Возраст</h3>
<p><strong>Сигнатура метода:</strong> <code>public String age(int x)</code></p>

<p><strong>Описание:</strong><br>
Форматирует строку с правильным склонением слова "год".</p>

<p><strong>Алгоритм:</strong></p>
<ul>
<li>Оканчивается на 1 (кроме 11) → "год"</li>
<li>Оканчивается на 2,3,4 (кроме 12,13,14) → "года"</li>
<li>Иначе → "лет"</li>
</ul>

<p><strong>Тесты:</strong></p>
<ul>
<li>Вход: <code>23</code> → Результат: <code>"23 года"</code></li>
<li>Вход: <code>21</code> → Результат: <code>"21 год"</code></li>
<li>Вход: <code>7</code> → Результат: <code>"7 лет"</code></li>
</ul>

<hr>

<h3> Задача 10. Вывод дней недели</h3>
<p><strong>Сигнатура метода:</strong> <code>public void printDays(String x)</code></p>

<p><strong>Описание:</strong><br>
Выводит дни недели начиная с указанного дня.</p>

<p><strong>Алгоритм:</strong></p>
<ul>
<li>Использование оператора <code>switch</code></li>
<li>Проверка корректности дня недели</li>
<li>Вывод всех последующих дней</li>
</ul>

<p><strong>Тесты:</strong></p>
<ul>
<li>Вход: <code>"среда"</code> → Результат: <code>"среда четверг пятница суббота воскресенье"</code></li>
<li>Вход: <code>"птнц"</code> → Результат: <code>"это не день недели"</code></li>
</ul>

<hr>

<h2> Задание 3. Циклы</h2>

<h3> Задача 2. Числа наоборот</h3>
<p><strong>Сигнатура метода:</strong> <code>public String reverseListNums(int x)</code></p>

<p><strong>Описание:</strong><br>
Возвращает числа от x до 0 в обратном порядке.</p>

<p><strong>Алгоритм:</strong></p>
<ul>
<li>Цикл <code>while</code> от x до 0</li>
<li>Добавление чисел в строку</li>
</ul>

<p><strong>Тесты:</strong></p>
<ul>
<li>Вход: <code>9</code> → Результат: <code>"9 8 7 6 5 4 3 2 1 0"</code></li>
</ul>

<hr>

<h3> Задача 4. Степень числа</h3>
<p><strong>Сигнатура метода:</strong> <code>public int pow(int x, int y)</code></p>

<p><strong>Описание:</strong><br>
Возводит число x в степень y.</p>

<p><strong>Алгоритм:</strong></p>
<ul>
<li>Проверка особых случаев (степень 0, основание 0)</li>
<li>Цикл умножения</li>
</ul>

<p><strong>Тесты:</strong></p>
<ul>
<li>Вход: <code>3, 4</code> → Результат: <code>81</code></li>
<li>Вход: <code>4, 0</code> → Результат: <code>1</code></li>
<li>Вход: <code>0, 4</code> → Результат: <code>0</code></li>
</ul>

<hr>

<h3> Задача 6. Одинаковость</h3>
<p><strong>Сигнатура метода:</strong> <code>public boolean equalNum(int x)</code></p>

<p><strong>Описание:</strong><br>
Проверяет, все ли цифры в числе одинаковы.</p>

<p><strong>Алгоритм:</strong></p>
<ul>
<li>Если число < 10 → <code>true</code></li>
<li>Цикл проверки цифр через <code>%</code> и <code>/</code></li>
</ul>

<p><strong>Тесты:</strong></p>
<ul>
<li>Вход: <code>22222</code> → Результат: <code>true</code></li>
<li>Вход: <code>22122</code> → Результат: <code>false</code></li>
</ul>

<hr>

<h3> Задача 8. Левый треугольник</h3>
<p><strong>Сигнатура метода:</strong> <code>public void leftTriangle(int x)</code></p>

<p><strong>Описание:</strong><br>
Рисует треугольник из звёздочек.</p>

<p><strong>Алгоритм:</strong></p>
<ul>
<li>Проверка высоты на положительность</li>
<li>Цикл с увеличением количества звёздочек</li>
</ul>

<p><strong>Тесты:</strong></p>
<ul>
<li>Вход: <code>3</code> → Результат:<br>
<code>*<br>
**<br>
***</code></li>
</ul>

<hr>

<h3> Задача 10. Угадайка</h3>
<p><strong>Сигнатура метода:</strong> <code>public void guessGame()</code></p>

<p><strong>Описание:</strong><br>
Игра в угадывание случайного числа.</p>

<p><strong>Алгоритм:</strong></p>
<ul>
<li>Генерация случайного числа 0-9</li>
<li>Цикл <code>do-while</code> до угадывания</li>
<li>Подсчёт попыток</li>
</ul>

<p><strong>Тесты:</strong></p>
<ul>
<li>Пример: угадано число 5 за 3 попытки</li>
</ul>

<hr>

<h2> Задание 4. Массивы</h2>

<h3> Задача 2. Поиск последнего значения</h3>
<p><strong>Сигнатура метода:</strong> <code>public int findLast(int[] arr, int x)</code></p>

<p><strong>Описание:</strong><br>
Находит индекс последнего вхождения элемента в массиве.</p>

<p><strong>Алгоритм:</strong></p>
<ul>
<li>Поиск с конца массива</li>
<li>Возврат индекса или -1</li>
</ul>

<p><strong>Тесты:</strong></p>
<ul>
<li>Массив: <code>[1,2,2,2,3,4,2]</code>, поиск: <code>2</code> → Результат: <code>6</code></li>
</ul>

<hr>

<h3> Задача 4. Добавление в массив</h3>
<p><strong>Сигнатура метода:</strong> <code>public int[] add(int[] arr, int x, int pos)</code></p>

<p><strong>Описание:</strong><br>
Вставляет элемент в массив на указанную позицию.</p>

<p><strong>Алгоритм:</strong></p>
<ul>
<li>Создание нового массива размером +1</li>
<li>Копирование элементов до позиции</li>
<li>Вставка элемента</li>
<li>Копирование оставшихся элементов</li>
</ul>

<p><strong>Тесты:</strong></p>
<ul>
<li>Массив: <code>[1,2,3,4]</code>, вставка: <code>10</code> на позицию <code>4</code> → Результат: <code>[1,2,3,4,10]</code></li>
</ul>

<hr>

<h3> Задача 6. Реверс</h3>
<p><strong>Сигнатура метода:</strong> <code>public void reverse(int[] arr)</code></p>

<p><strong>Описание:</strong><br>
Переворачивает массив.</p>

<p><strong>Алгоритм:</strong></p>
<ul>
<li>Два указателя (начало и конец)</li>
<li>Обмен элементов местами</li>
</ul>

<p><strong>Тесты:</strong></p>
<ul>
<li>Массив: <code>[1,3,5,7,9]</code> → Результат: <code>[9,7,5,3,1]</code></li>
</ul>

<hr>

<h3> Задача 8. Объединение</h3>
<p><strong>Сигнатура метода:</strong> <code>public int[] concat(int[] arr1, int[] arr2)</code></p>

<p><strong>Описание:</strong><br>
Объединяет два массива в один.</p>

<p><strong>Алгоритм:</strong></p>
<ul>
<li>Создание массива размером arr1.length + arr2.length</li>
<li>Копирование первого массива</li>
<li>Копирование второго массива</li>
</ul>

<p><strong>Тесты:</strong></p>
<ul>
<li>Массивы: <code>[2,4,6]</code> и <code>[1,3,5]</code> → Результат: <code>[2,4,6,1,3,5]</code></li>
</ul>

<hr>

<h3> Задача 10. Удалить негатив</h3>
<p><strong>Сигнатура метода:</strong> <code>public int[] deleteNegative(int[] arr)</code></p>

<p><strong>Описание:</strong><br>
Удаляет отрицательные числа из массива.</p>

<p><strong>Алгоритм:</strong></p>
<ul>
<li>Подсчёт неотрицательных чисел</li>
<li>Создание нового массива</li>
<li>Копирование неотрицательных элементов</li>
</ul>

<p><strong>Тесты:</strong></p>
<ul>
<li>Массив: <code>[2,-4,-6,8,1,3,-5]</code> → Результат: <code>[2,8,1,3]</code></li>
</ul>
