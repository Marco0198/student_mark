package za.ac.mycput.studentmarks.controller.results;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import za.ac.mycput.studentmarks.entity.results.Results;
import za.ac.mycput.studentmarks.service.results.ResultService;
;
import java.util.Set;
@RestController
public class ResultsController {
    @Autowired
    private ResultService service;
    @GetMapping("results/list")
    public Set<Results> list(){
        return  service.getAll();
    }

    @PostMapping("results/create")
    @ResponseStatus(HttpStatus.CREATED)
    public Results create(@RequestBody Results results){
        return service.create(results);
    }

    @DeleteMapping(value = "results/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void delete(@PathVariable("id") int id) {
        service.delete(id);
    }
    @PutMapping(value = "results/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void update(@PathVariable( "id" ) int id, @RequestBody Results results) {

        service.update(results);
    }

}
