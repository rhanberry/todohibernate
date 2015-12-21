package todospringboot.services;

import java.util.List;

import todospringboot.entities.TodoList;

public interface TodoService {

	
	void add(TodoList todolist);

	void update(TodoList todolist);
	
	void delete(Integer todoId);

	List<TodoList> getTodolists();
	
	TodoList getByTodoId(Integer todoId) throws InvalidInputException;

	
}