package api.example.project1.model;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class EmpConfig {
    @Bean
    CommandLineRunner commandLineRunner(EmpRepository empRepository){
        return args -> {
            Emp obj1= new Emp(
                    "Shakil Ahmed", LocalDate.of(1998, Month.JANUARY,3),23
            );
            Emp obj2= new Emp(
                    "Rahul", LocalDate.of(1998, Month.FEBRUARY,8),23
            );
            empRepository.saveAll(
                    List.of(obj1,obj2)
            );
        };
    }
}
