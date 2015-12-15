package todospringboot.daos;

import java.util.List;



import todospringboot.entities.TodoList;

public interface TodoDao {

	void add(TodoList todolist);

	void update(TodoList todolist);

	List<TodoList> getAllTodoList();

	TodoList getByTodoId(Integer todoId);

	void delete(Integer todoId);
	
	
}