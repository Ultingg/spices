package test;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.jdbc.Sql;
import ru.isaykin.application.Application;
import ru.isaykin.application.model.Spice;
import ru.isaykin.application.repository.SpiceRepository;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;


@AutoConfigureTestDatabase
@SpringBootTest(classes = Application.class, value = "application")
@ComponentScan(value = "ru.isaykin.application")
//@Sql("/schema-test.sql")
public class SpecieTests {

    

    @Autowired
    private SpiceRepository spiceRepository;


    @Test
    void getAlltest() {
        List<Spice> list = (List<Spice>)spiceRepository.findAll();
        System.out.println(list.size());
        assertEquals(list.size(),2);
    }
}
