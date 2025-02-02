### Приложение «Валюты мира».

Необходимо написать приложение, которое будет отображать список денежных купюр разных стран, используя шаблон проектирования MVVM, а для внедрения зависимостей мы будем использовать Dagger Hilt.

Логика приложения может быть подобной логики тематики занятия.

Список экрана построен на основе RecyclerView, элемент списка содержит картинку валюты и название.

В приложении предполагается создание класса модели и репозитория. Класс репозитория будет содержать несколько примеров объектов класса модели, которые необходимо внедрить во ViewModel. Класс репозитория может быть интерфейсом с абстрактной функцией возврата списка моделей. Реализацию этого интерфейса можно предоставить отдельному классу, прототипу базы данных, содержащий конкретный список моделей.

Класс ViewModel будет работать с классом интерфейса, описанного выше, и своему объекту LiveData, внутри функции класса ViewModel возвращать результат работы функции, описанной в интерфейсе.

Обо всех изменениях список валют RecyclerView в MainActivity «будет узнавать» посредством функции observe у объекта viewModel.

Для работы приложения необходимо создать:

- На первом экране (экран заставки):

1.  TextView названия приложения.

- На втором экране:

1. Toolbar c заголовком названия приложения.

2. RecyclerView списка валют.

3. Меню с пунктом выхода из программы.

[Video](https://rutube.ru/video/private/4f3de0582713d28b8d82503da454a230/?p=jaGy6RyQn8K-PpfaZxehEg)