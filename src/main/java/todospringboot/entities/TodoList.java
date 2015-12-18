package todospringboot.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;


@Entity
public class TodoList {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer todoId;
	private String todoItem;
	private String todoDesc;
	private String dueDate;
	private String todoUser;
	private Boolean isComplete;
	/**
	 * @return the todoId
	 */
	public Integer getTodoId() {
		return todoId;
	}
	/**
	 * @param todoId the todoId to set
	 */
	public void setTodoId(Integer todoId) {
		this.todoId = todoId;
	}
	/**
	 * @return the todoItem
	 */
	public String getTodoItem() {
		return todoItem;
	}
	/**
	 * @param todoItem the todoItem to set
	 */
	public void setTodoItem(String todoItem) {
		this.todoItem = todoItem;
	}
	/**
	 * @return the todoDesc
	 */
	public String getTodoDesc() {
		return todoDesc;
	}
	/**
	 * @param todoDesc the todoDesc to set
	 */
	public void setTodoDesc(String todoDesc) {
		this.todoDesc = todoDesc;
	}
	/**
	 * @return the dueDate
	 */
	public String getDueDate() {
		return dueDate;
	}
	/**
	 * @param dueDate the dueDate to set
	 */
	public void setDueDate(String dueDate) {
		this.dueDate = dueDate;
	}
	/**
	 * @return the todoUser
	 */
	public String getTodoUser() {
		return todoUser;
	}
	/**
	 * @param todoUser the todoUser to set
	 */
	public void setTodoUser(String todoUser) {
		this.todoUser = todoUser;
	}
	/**
	 * @return the isComplete
	 */
	public boolean isComplete() {
		return isComplete;
	}
	/**
	 * @param isComplete the isComplete to set
	 */
	public void setIsComplete(Boolean isComplete) {
		this.isComplete = isComplete;
	}
	
	@Override
	public int hashCode() {
		HashCodeBuilder builder = new HashCodeBuilder(31, 17);
		builder.append(todoId);
		return builder.toHashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof TodoList)){
			return false;
		}
		TodoList todolist = (TodoList) obj;
		EqualsBuilder builder = new EqualsBuilder();
		builder.append(this.todoId, todolist.todoId);
		return builder.isEquals();
		
	}
	
	
	
}
