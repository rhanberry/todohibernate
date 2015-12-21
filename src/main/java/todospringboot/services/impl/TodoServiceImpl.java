package todospringboot.services.impl;


//import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import todospringboot.daos.TodoDao;
import todospringboot.entities.TodoList;
import todospringboot.services.InvalidInputException;
import todospringboot.services.TodoService;

@Service
public class TodoServiceImpl implements TodoService {
	
	@Autowired
	private TodoDao todoDao;
	
	public void setTodoDao(TodoDao todoDao){
		this.todoDao = todoDao;
	}
	
	
	@Override
	public List<TodoList> getTodolists() {
		System.out.println("SERVICEIMPLGET");
		//List<TodoList> todolists = 
		return todoDao.getAllTodoList();
//			if(complete != null){
//				
//				//return (List<TodoList>) todoDao.getAllTodoList().stream().filter(t-> t.isComplete() == complete);
//
//				
//				List<TodoList> activeTodolists = new ArrayList<>();
//				for(TodoList e : todolists){
//					if(e.isComplete() == complete){
//						activeTodolists.add(e);
//					}
//				}
//				return activeTodolists;
//			}
			
		//return todolists;
	}
	
	@Override
	public void add(TodoList todolist){
		System.out.println("SERVICEIMPL"+ todolist.getTodoDesc());
		todoDao.add(todolist);
	}
	
	@Override
	public void update(TodoList todolist){
		System.out.println("SERVICEIMPL"+ todolist.getTodoDesc());
		todoDao.update(todolist);
	}
	
	@Override
	public TodoList getByTodoId(Integer todoId) throws InvalidInputException {
		if(todoId ==null || todoId < 0){
			throw new InvalidInputException("TodoId.NullOrNegative");
		}
		return todoDao.getByTodoId(todoId);
	}
	
	@Override
	public void delete(Integer todoId){
		System.out.println("SERVICEIMPL"+ todoId);
		todoDao.delete(todoId);
	}

}
