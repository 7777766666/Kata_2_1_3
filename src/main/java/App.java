import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =     //обращаемся к объектам интерфейса спринг приложения (чарез наследование)
                new AnnotationConfigApplicationContext(AppConfig.class);  //запускаем поиск аннотаций
        HelloWorld bean = (HelloWorld) applicationContext.getBean("helloworld");  //бин сингелтона создан при инициализации конструктора
        HelloWorld bean1 = (HelloWorld) applicationContext.getBean("helloworld");  //ссылка та же самая, так как сингелтон
        System.out.println(bean.getMessage());      //выводим в консоль ссылку на объект bean
        System.out.println(bean1.getMessage());     //выводим в консоль ту же ссылку объект bean
        Cat cat = (Cat) applicationContext.getBean("cat");  //инициализируем объект Бина cat
        Cat cat1 = (Cat) applicationContext.getBean("cat"); //инициализируем объект второго Бина cat1
        System.out.println(cat.getName());                      //выводим в консоль строку(поле) первого объекта Бина кэт
        System.out.println(cat1.getName());                      //выводим в консоль строку(поле) второго объекта Бина кэт1
        System.out.println(bean == bean1);                      //сравниваем равные ссылки bean==bean1
        System.out.println(cat == cat1);                        //сравниваем ссылки на разные участки памяти у Бинов класса Cat
    }
}