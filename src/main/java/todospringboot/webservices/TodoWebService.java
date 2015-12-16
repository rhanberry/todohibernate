package todospringboot.webservices;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;



import todospringboot.entities.TodoList;
import todospringboot.services.InvalidInputException;
import todospringboot.services.TodoService;

@RestController
public class TodoWebService {
	
	@Autowired
	private TodoService todoService;
	
	public void setTodoService(TodoService todoService){
		this.todoService = todoService;
	}
	
	@RequestMapping(value="/todolists", method=RequestMethod.POST)
	public void addTodoList(@RequestBody TodoList todolist){
		todoService.add(todolist);
	} 
		
		
	@RequestMapping(value="/todolists", method = RequestMethod.GET)
	public List<TodoList> getTodolists(Boolean complete){
		return todoService.getTodolists(complete);
	}	
	
	
	@RequestMapping(value="/todolists/{id}", method=RequestMethod.GET)
	public TodoList getTodoListByID(@PathVariable Integer id) throws InvalidInputException{ 
		return todoService.getByTodoId(id);
	}
	
	@RequestMapping(value="/todolists/{id}", method = RequestMethod.PUT)
	public void updateTodoList(@PathVariable Integer id, @RequestBody TodoList todolist){
		todoService.update(todolist);
	}
	
	@RequestMapping(value="/todolists/{id}", method = RequestMethod.DELETE)
	public void removeTodoList(@PathVariable Integer id){
		
		todoService.delete(id);
		 
	}
}
