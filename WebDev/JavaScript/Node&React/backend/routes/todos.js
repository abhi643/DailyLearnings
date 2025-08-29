const express = require('express');
const router = express.Router();
const Todo = require('../models/Todo'); // Import the model

// GET all todos
router.get('/', async (req, res) => {
  const todos = await Todo.find();
  res.json(todos);
});

// POST a new todo
router.post('/', async (req, res) => {
  const newTodo = new Todo({
    task: req.body.task,
  });
  await newTodo.save();
  res.status(201).json(newTodo);
});

// DELETE a todo by ID
router.delete('/:id', async (req, res) => {
  await Todo.findByIdAndDelete(req.params.id);
  res.status(204).send();
});

module.exports = router;