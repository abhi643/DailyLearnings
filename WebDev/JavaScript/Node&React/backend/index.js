const express = require('express');
const cors = require('cors');
const mongoose = require('mongoose');
const todoRoutes = require('./routes/todos');

const app = express();
const PORT = 3001;

// --- DATABASE CONNECTION ---
// Replace <password> with your actual password.
const MONGO_URI = "mongodb+srv://0011abhinav:AbFJlGdo2EpM6qqG@cluster0.tphoyzz.mongodb.net/?retryWrites=true&w=majority&appName=Cluster0";

mongoose.connect(MONGO_URI)
  .then(() => console.log("MongoDB connection successful"))
  .catch(err => console.error("MongoDB connection error:", err));

app.use(express.json());
app.use(cors());

app.use('/api/todos', todoRoutes);

app.listen(PORT, () => {
  console.log(`Node.js server running on http://localhost:${PORT}`);
});