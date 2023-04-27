package OOP_HW.Lesson_7.Client;

import OOP_HW.Lesson_7.Core.Controller.Controller;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.logging.*;


public class App {
    public static final Logger logger = Logger.getLogger(Math.class.getName());

    public static void main(String[] args) throws IOException {
        /*
        Создать калькулятор для работы с рациональными и комплексными числами,
        организовать меню, добавив в неё систему логирования.
        Вопросы:
        1. Правильно ли было добавить логгер в точку входа, или правильнее было бы его прописать в Контроллере?
        2. Что необходимо доделать, чтобы зачесть как итоговую работу по последнему семинару

        Паттерны:
        1. Написаны адаптеры для изначальных версий калькулятора и парсера, чтобы в уже работающий код встроить
            возможность работы со скобками в математическом выражении. Эти же адаптепы позволять модифицировать
            код в дальнейшем и ввести дополнительные проверки вводимого со стороны пользователя текста
        2. Архитектура максимально приближена к MVC паттерну - отдельно логика, отдельно контроллер,
            который распределяет на различные модули View для взаимодействия с пользователем

         */
        try {
            LogManager.getLogManager().readConfiguration(
                    new FileInputStream("./src/main/java/OOP_HW/Lesson_7/logging.properties"));
        } catch (IOException e) {
            System.err.println("Could not setup logger configuration: " + e.toString());
        }

        Handler fileHandler = new FileHandler("./src/main/java/OOP_HW/Lesson_7/Client/Logs/log.txt");
        logger.setUseParentHandlers(false);
        logger.addHandler(fileHandler);
        logger.info("Запуск приложения");

        System.out.println("************************************************");
        System.out.println("Добро пожаловать в программу Калькулятор");
        Controller controller = new Controller();
        controller.startWork();
    }
}
