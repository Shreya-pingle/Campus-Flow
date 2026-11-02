package com.campusflow.controller;
import com.campusflow.structures.*;
import org.springframework.web.bind.annotation.*;
import java.util.*;
@RestController @RequestMapping("/api/demo")
public class StructureDemoController {
 private final TaskPriorityQueue pq=new TaskPriorityQueue();
 private final DependencyGraph graph=new DependencyGraph();
 private final TaskTrie trie=new TaskTrie();
 private final UndoRedoStack history=new UndoRedoStack();
 private final LruCache<Integer,String> recent=new LruCache<>(3);
 public StructureDemoController(){
  pq.add("Submit assignment",1);pq.add("Read chapter",3);pq.add("Prepare interview",0);
  trie.insert("complete project");trie.insert("complete assignment");trie.insert("check calendar");
 }
 @GetMapping("/priority") public Map<String,String> priority(){return Map.of("nextTask",String.valueOf(pq.peek()));}
 @GetMapping("/autocomplete") public List<String> autocomplete(@RequestParam String prefix){return trie.search(prefix);}
 @PostMapping("/dependencies") public Map<String,Object> dependency(@RequestBody Map<String,Integer> body){boolean ok=graph.addDependency(body.get("from"),body.get("to"));return Map.of("accepted",ok,"message",ok?"Dependency added":"Rejected: circular dependency");}
 @PostMapping("/undo") public Map<String,String> undo(@RequestBody Map<String,String> body){history.doAction(body.getOrDefault("action","TASK_CHANGE"));return Map.of("undoAction",history.undo(),"redoAction",history.redo());}
 @PostMapping("/recent") public Map<Integer,String> recent(@RequestBody Map<String,Object> body){Integer id=(Integer)body.get("id");String value=String.valueOf(body.get("value"));recent.put(id,value);return new LinkedHashMap<>(recent);}
}
