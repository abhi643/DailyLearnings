import React from 'react';
import ReactDOM from 'react-dom/client';
import App from './App.jsx';
import { TodoProvider } from './context/TodoContext'; // Import the provider
import './index.css';

ReactDOM.createRoot(document.getElementById('root')).render(
  <React.StrictMode>
    {/* Wrap App with the provider */}
    <TodoProvider>
      <App />
    </TodoProvider>
  </React.StrictMode>,
);