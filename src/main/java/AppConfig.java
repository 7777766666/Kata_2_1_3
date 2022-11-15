import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {
 
    @Bean(name="helloworld")
    @Scope ("singleton")    //сингелтон по умолчанию и можно не писать. может быть 1, имя можно перезаписать через сеттер
    public HelloWorld getHelloWorld() {
        HelloWorld helloWorld = new HelloWorld();
        helloWorld.setMessage("Hello World!");
        return helloWorld;
    }

    @Bean(name = "cat")
    @Scope("prototype")  //создает бин только при обращении, каждый раз новый в новом участке памяти
    public Cat getCat(){
        Cat cat = new Cat();
        cat.setName("Cat !");
        return cat;
    }


}