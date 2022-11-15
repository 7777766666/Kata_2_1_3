

public class Cat {      //создаем класс Cat
    private String name;    //Прайвет строка для конструктора

    public Cat() {     //конструктор без параметров по умолчанию, можно было вообще не писать
 //       System.out.println("test cat constructor");   //маркер создания объяектов кэт из пустых конструкторов
    }


    public void setName(String name) {      //сеттер, чтоб можно было изменять имя объекта
        this.name = name;                   //сохраняет новое имя объекта, ничего не возвращает
    }

    public String getName() {           //геттер ничего не принимает
        return name;                    //возвращает текущее значение строки name
    }
}
