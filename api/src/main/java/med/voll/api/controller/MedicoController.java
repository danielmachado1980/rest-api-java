package med.voll.api.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/medicos")
public class MedicoController {

    @PostMapping
    public void cadastrar(@RequestBody String body)
    {
        System.out.println(body);
    }
}
