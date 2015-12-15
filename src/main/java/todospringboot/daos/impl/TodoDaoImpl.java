package todospringboot.daos.impl;

import java.util.ArrayList;
import java.util.List;

import todospringboot.daos.TodoDao;
import todospringboot.entities.TodoList;

public class TodoDaoImpl implements TodoDao {

	private List<TodoList> todolists = new ArrayList<>();
	private Integer nextId = 1;
	
	@Override
	public void add(TodoList todolist){
		todolist.setTodoId(nextId);
		nextId++;
		todolists.add(todolist);
		}
	
	@Override
	public void update(TodoList todolist){
		Integer index = todolists.indexOf(todolist);
		todolists.set(index, todolist);
	}
	
	@Override
	public List<TodoList> getAllTodoList(){
		return todolists;
	}
	
	@Override
	public TodoList getByTodoId(Integer todoId){
		for(TodoList e : todolists){
			if(e.getTodoId().equals(todoId)){
				return e;
			}
		}
		return null;
	}
	
	@Override
	public void delete(Integer todoId){
		TodoList todolist = new TodoList();
		todolist.setTodoId(todoId);
		
		todolists.remove(todolist);
	}
}
