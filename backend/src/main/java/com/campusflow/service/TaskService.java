package com.campusflow.service;
import com.campusflow.dto.TaskRequest;
import com.campusflow.model.Task;
import com.campusflow.repository.TaskRepository;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class TaskService {
 private final TaskRepository repo;
 public TaskService(TaskRepository repo){this.repo=repo;}
 public List<Task> all(){return repo.findAll();}
 public Task get(Long id){return repo.findById(id).orElseThrow(()->new RuntimeException("Task not found"));}
 public Task create(TaskRequest r){Task t=new Task(); copy(r,t); return repo.save(t);}
 public Task update(Long id,TaskRequest r){Task t=get(id);copy(r,t);return repo.save(t);}
 public void delete(Long id){repo.delete(get(id));}
 private void copy(TaskRequest r,Task t){
  t.setTitle(r.title());t.setDescription(r.description());
  if(r.priority()!=null)t.setPriority(r.priority());
  if(r.status()!=null)t.setStatus(r.status());
  t.setDueDate(r.dueDate());if(r.recurrence()!=null)t.setRecurrence(r.recurrence());
 }
}
