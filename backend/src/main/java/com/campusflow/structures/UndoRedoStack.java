package com.campusflow.structures;
import java.util.*;
public class UndoRedoStack {
 private final Deque<String> undo=new ArrayDeque<>(),redo=new ArrayDeque<>();
 public void doAction(String action){undo.push(action);redo.clear();}
 public String undo(){if(undo.isEmpty())return "Nothing to undo";String a=undo.pop();redo.push(a);return a;}
 public String redo(){if(redo.isEmpty())return "Nothing to redo";String a=redo.pop();undo.push(a);return a;}
}
