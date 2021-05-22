package api.example.project1.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
//Emp class serves this Api

@RestController
@RequestMapping(path="api/v1/emp")
public class EmpController {
    private final EmpService empService;


@Autowired
    public EmpController(EmpService empService) {
        this.empService = empService;
    }

@GetMapping
    public List<Emp> hello() {
        return empService.hello();
    }
}
