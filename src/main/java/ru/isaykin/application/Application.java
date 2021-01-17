package ru.isaykin.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import ru.isaykin.application.model.Spice;
import ru.isaykin.application.repository.SpiceRepository;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        ConfigurableApplicationContext configurableApplicationContext =  SpringApplication.run(Application.class, args);


        SpiceRepository spiceRepository = configurableApplicationContext.getBean(SpiceRepository.class);

        Spice spice = new Spice("soloma", 1);
        Spice spice2 = new Spice("kinza", 300);
        Spice spice3 = new Spice("ukrop", 125);

        spiceRepository.save(spice);
        spiceRepository.save(spice2);
        spiceRepository.save(spice3);
    }
}
