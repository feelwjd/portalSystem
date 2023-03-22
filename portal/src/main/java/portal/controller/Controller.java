package portal.controller;

import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import portal.service.MySqlService;

@RestController
public class Controller {

	private final MySqlService service;
	
	public Controller(MySqlService service) {
        this.service = service;
    }

    @RequestMapping("/")
    public String index() {
        return "Hello.";
    }

    @RequestMapping("/mysql")
    public @ResponseBody
    List<Map<String, Object>> selectTest() {
        return service.selectMessageBackbon();
    }
}
