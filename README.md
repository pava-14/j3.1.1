# Задача № 1 "Кондиционер: теплее и холоднее"

## Краткое описание

1. Создан maven проект.
2. Перенесен код из лекции 
3. Настроен JaCoCo plugin.
4. Созданы методы:
    * ```public void increaseCurrentTemperature()``` 
    * ```public void decreaseCurrentTemperature()```  
5. Написаны автотесты на созданные методы, со 100% покрытием по бранчам.

## Примечание

 При реализации методов ```increaseCurrentTemperature()``` и ```decreaseCurrentTemperature()``` 
 не использовался существующий сеттер ````setCurrentTemperature(int currentTemperature)````, 
 т.к., по условиям задачи, необходимо было продемонстрировать использование Early Exit.
 