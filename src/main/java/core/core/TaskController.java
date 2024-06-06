package core.core;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.List;

public class TaskController {

    @RequestMapping(value = "/tasks",method = RequestMethod.GET)
    public String listTasks(Model model) {
        List<String> fruits = List.of("mango","banana","strawberry","gava");
        model.addAttribute("fruits", fruits);
        return "fruits-list";
    }
}

