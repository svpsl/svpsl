package com.svpsl.todos;

import java.util.Date;
import java.util.Objects;

public class Todo {

	private long id;
	private String userName;
	private String description;
	private Date targetDate;
	private Boolean isDone;
	public Todo() {}
	public Todo(long id, String userName, String description, Date targetDate, Boolean isDone) {
		super();
		this.id = id;
		this.userName = userName;
		this.description = description;
		this.targetDate = targetDate;
		this.isDone = isDone;
	}
	public void setId(long id) {
		this.id = id;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public void setTargetDate(Date targetDate) {
		this.targetDate = targetDate;
	}
	public void setIsDone(Boolean isDone) {
		this.isDone = isDone;
	}
	
	public long getId() {
		return id;
	}
	public String getUserName() {
		return userName;
	}
	public String getDescription() {
		return description;
	}
	public Date getTargetDate() {
		return targetDate;
	}
	public Boolean getIsDone() {
		return isDone;
	}
	@Override
	public String toString() {
		return "Todo [id=" + id + ", userName=" + userName + ", description=" + description + ", targetDate="
				+ targetDate + ", isDone=" + isDone + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Todo other = (Todo) obj;
		return id == other.id;
	}
	
}
