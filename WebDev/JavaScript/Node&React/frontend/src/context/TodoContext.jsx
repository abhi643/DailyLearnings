import { createContext, useState, useEffect } from 'react';

// 1. Create the context
export const TodoContext = createContext();

// 2. Create the provider component
export const TodoProvider = ({ children }) => {
  const [todos, setTodos] = useState([]);

  // Fetch initial data
  useEffect(() => {
    fetch('http://localhost:3001/api/todos')
      .then(res => res.json())
      .then(data => setTodos(data));
  }, []);

  // Functions to modify state will also live here
  const addTodo = (task) => {
    fetch('http://localhost:3001/api/todos', {
      method: 'POST',
      headers: { 'Content-Type': 'application/json' },
      body: JSON.stringify({ task }),
    })
      .then(res => res.json())
      .then(newTodo => setTodos([...todos, newTodo]));
  };
  
  const deleteTodo = (id) => {
    fetch(`http://localhost:3001/api/todos/${id}`, { method: 'DELETE' })
      .then(() => setTodos(todos.filter(todo => todo.id !== id)));
  };

  // 3. Provide the state and functions to children
  return (
    <TodoContext.Provider value={{ todos, addTodo, deleteTodo }}>
      {children}
    </TodoContext.Provider>
  );
};