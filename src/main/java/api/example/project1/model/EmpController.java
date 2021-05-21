package api.example.project1.model;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;
//Emp class serves this Api

@RestController
@RequestMapping(path="api/v1/emp")
public class EmpController {
    @GetMapping
    public List<Emp> hello() {

        return List.of(
                new Emp(
                        1L,"Shakil Ahmed", LocalDate.of(1998, Month.JANUARY,3),23
                )
        );
    }

}
