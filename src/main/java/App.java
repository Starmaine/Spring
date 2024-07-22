import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);

        HelloWorld bean = (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());

        HelloWorld bean1 = (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean1.getMessage());

        System.out.println("Бины HelloWorld похожи: " + (bean == bean1));

        Cat bean3 = (Cat) applicationContext.getBean("cat");
        System.out.println(bean3.getName());

        Cat bean4 = (Cat) applicationContext.getBean("cat");
        System.out.println(bean4.getName());

        System.out.println("Бины HelloWorld похожи: " + (bean3 == bean4));

        applicationContext.close();
    }
}