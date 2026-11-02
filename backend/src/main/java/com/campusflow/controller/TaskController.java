package com.campusflow.controller;
import com.campusflow.dto.TaskRequest;
import com.campusflow.model.Task;
import com.campusflow.service.TaskService;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController @RequestMapping("/api/tasks")
public class TaskController {
 private final TaskService service;
 public TaskController(TaskService service){this.service=service;}
 @GetMapping public List<Task> all(){return service.all();}
 @GetMapping("/{id}") public Task get(@PathVariable Long id){return service.get(id);}
 @PostMapping public Task create(@RequestBody TaskRequest r){return service.create(r);}
 @PutMapping("/{id}") public Task update(@PathVariable Long id,@RequestBody TaskRequest r){return service.update(id,r);}
 @DeleteMapping("/{id}") public void delete(@PathVariable Long id){service.delete(id);}
}
