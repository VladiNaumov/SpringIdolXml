import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
/*
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "application.xml"); // вызов конфигурации с каталога resources / с файла application.xml

       // ApplicationContext ctx.

       Performer performer = context.getBean("duke", Performer.class); // "BeanID" это <bean id>, Performer.class это class реализующий интерфейс

        performer.perform();

        context.close();

 */

        ApplicationContext ctx = new ClassPathXmlApplicationContext("application.xml");
        Performer performer = (Performer) ctx.getBean("kenny");
        performer.perform();



/*


       Performer a = new Juggler(); // приводим к интерфейсу Performer
        a.perform();

        System.out.println("**********");

        Poem sonnet29 = new Sonnet29(); // приводим к интерфейсу Poem
        sonnet29.recite();

        System.out.println("**********");


        Performer duke = new PoeticJuggler(15, sonnet29); // приводим к интерфейсу Performer
        duke.perform();

        System.out.println("**********");

    */

    }
}
