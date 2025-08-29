import { useContext, useState } from 'react';
import { TodoContext } from './context/TodoContext'; // Import the context
import './App.css';

function App() {
  // 1. Consume the global state and functions from the context
  const { todos, addTodo, deleteTodo } = useContext(TodoContext);
  const [newTask, setNewTask] = useState('');

  const handleSubmit = (e) => {
    e.preventDefault();
    addTodo(newTask); // Use the function from context
    setNewTask('');
  };

  return (
    <div className="App">
      <h1>To-Do List (with Context!)</h1>
      <form onSubmit={handleSubmit}>
        <input
          type="text"
          value={newTask}
          onChange={(e) => setNewTask(e.target.value)}
        />
        <button type="submit">Add Task</button>
      </form>
      <ul>
        {todos.map(todo => (
          <li key={todo._id}> {/* MongoDB uses _id */}
            {todo.task}
            <button onClick={() => deleteTodo(todo._id)}>Delete</button>
          </li>
        ))}
      </ul>
    </div>
  );
}

export default App;