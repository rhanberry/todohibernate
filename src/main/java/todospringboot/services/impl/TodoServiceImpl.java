package todospringboot.services.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import todospringboot.daos.TodoDao;
import todospringboot.entities.TodoList;
import todospringboot.services.InvalidInputException;
import todospringboot.services.TodoService;

public class TodoServiceImpl implements TodoService {
	
	@Autowired
	private TodoDao todoDao;
	
	public void setTodoDao(TodoDao todoDao){
		this.todoDao = todoDao;
	}
	
	@Override
	public List<TodoList> getTodolists(Boolean complete) {
		List<TodoList> todolists = todoDao.getAllTodoList();
			if(complete != null){
				List<TodoList> activeTodolists = new ArrayList<>();
				for(TodoList e : todolists){
					if(e.isComplete().equals(complete)){
						activeTodolists.add(e);
					}
				}
				return activeTodolists;
			}
			
		return todolists;
	}
	
	@Override
	public void add(TodoList todolist){
		todoDao.add(todolist);
	}
	
	@Override
	public void update(TodoList todolist){
		todoDao.update(todolist);
	}
	
	@Override
	public TodoList getByTodoId(Integer todoId) throws InvalidInputException {
		if(todoId ==null || todoId < 0){
			throw new InvalidInputException("TodoId.NullOrNegative");
		}
		return todoDao.getByTodoId(todoId);
	}
	
	public void delete(Integer todoId){
		todoDao.delete(todoId);
	}

}
