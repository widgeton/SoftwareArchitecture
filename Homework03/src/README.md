## Принцип разделения интерфейса ISP
У нас есть класс `Smartphone`, которому необходимо для реализации два метода: `call()` и `takePicture()`. А для реализации класса `Photocamera` необходим только метод `takePicture()`. Для этого мы создаем не один а два интерфейса. Классы могут имплементировать только те из них методы которых им нужны.

## Принцип инверсии зависимостей DIP
Классы `Smartphone` и `Photocamera` зависят от обстрактного класса `Gadget` и интерфейсов `Call` и `Camera`. Детали их реализации также зависят от этих абстракций. Класс `Repository` верхнего уровня не зависит от классов `Smartphone` и `Photocamera` нижнего уровня. А класс `Store` не зависит от `Repository` для которого он является вкрхнеуровневым.