// let a=null;
// console.log(typeof a) //object
// if(a===null){
//     console.log("a is null");
// }
// In the very first version of JavaScript, values were stored with a type tag (a few bits indicating the data type) and the actual value. For objects, the type tag was 0. The null value was represented as the NULL pointer (a sequence of all zeros).
// Because of this, the typeof operator, when checking the type tag of null, saw the 0 tag and incorrectly returned "object".

// let b=""
// console.log(typeof b) //string 

// console.log(5=="5") // smae value
// console.log(5==="5") // same value but different type
// console.log(5!=="5") 

// let name = null ?? "default"        // "default"
// console.log(name)
// let name = undefined ?? "default"   // "default" 
// let name = "" ?? "default"          // "" (empty string is NOT null/undefined)

// JavaScript example with template literals
// let name = "Alice";
// let level = 5;

// // Using a template literal
// let statusNew = `Player: ${name} is at level ${level}.`;
// console.log(statusNew); // "Player: Alice is at level 5."

// // You can even embed expressions
// let nextLevel = `Next level is ${level + 1}.`;
// console.log(nextLevel); // "Next level is 6."

// // Template literals can also span multiple lines
// let multiLineString = `
// This is a
// multi-line
// string.`;
// console.log(multiLineString);
//str.length is a string property

// let name = prompt("Enter your name: ");
// if (name) {
//     console.log(`Hello, ${name}!`);
// } else {
//     console.log("Hello, Guest!");
// }

// let arr = ["Pizza", 19, false, null]
// console.log(arr[3]) 

// let arr = [1,2,3,4,5,6,7]
// console.log(arr)
// for(let ele of arr){
//     console.log(ele*2)
// }
// console.log(arr)

// JavaScript example

// 1. Object Literal Syntax
// const person = {
//   firstName: "John",
//   lastName: "Doe",
//   age: 30,
//   isStudent: false,
//   // You can even have functions (methods) inside objects
//   fullName: function() {
//     return this.firstName + " " + this.lastName;
//   }
// };

// // 2. Accessing Properties: Dot Notation
// console.log(person.firstName); // "John"

// // 3. Accessing Properties: Bracket Notation
// // Useful for keys with spaces or special characters, or when using a variable
// console.log(person["lastName"]); // "Doe"

// // Calling a method on the object
// console.log(person.fullName()); // "John Doe"



// const add = (a, b) => a + b;
// const subtract = (a, b) => a - b;
// const multiply = (a, b) => a * b;
// const divide = (a, b) => {
//     if (b === 0) {
//         return "Error: Division by zero";
//     }
//     return a / b;
// }

// const calculate = (a,b,operation) => {
//     return operation(a,b);
// }

// console.log(calculate(10,5,add)) //15
// console.log(calculate(10,5,subtract)) //5
// console.log(calculate(10,5,multiply)) //50
// console.log(calculate(10,5,divide)) //2
// console.log(calculate(10,0,divide)) //Error: Division by zero


// JavaScript example with 'var'
// function runExample() {
//   for (var i = 0; i < 5; i++) {
//     var message = "Hello";
//     console.log(message); // "Hello"
//   }

//   // 'i' and 'message' are still accessible here, outside the for-loop block!
//   console.log(i);       // 5
//   console.log(message); // "Hello"
// }

// runExample();



// Hoisting in JavaScript with 'var'
// JavaScript example
// console.log(myVar); // Output: undefined (NOT a ReferenceError!)

// var myVar = "Hello, World!";

// console.log(myVar); // Output: "Hello, World!"

// function hoistingChallenge() {
//   console.log(a);
//   var a = 10;

// //   console.log(b);
// //   let b = 20;
// }

// hoistingChallenge();


// function makeGreeter(greeting) {
//   // 'greeting' is part of makeGreeter's scope.
//   const greetingText = greeting;

//   // We return a new function from inside makeGreeter.
//   // This returned function is a "closure".
//   return function(name) {
//     // It "remembers" the greetingText variable from its parent scope,
//     // even after makeGreeter() has finished running.
//     console.log(`${greetingText}, ${name}!`);
//   };
// }

// // Call makeGreeter, which returns a function. We store that function in a variable.
// const sayHello = makeGreeter("Hello");
// const sayGoodbye = makeGreeter("Goodbye");

// // Now, we call the returned functions.
// sayHello("Alice");   // Prints: "Hello, Alice!"
// sayHello("Bob");     // Prints: "Hello, Bob!"
// sayGoodbye("Alice"); // Prints: "Goodbye, Alice!"

// function createCounter() {
//   // 'count' is a private variable, protected by the closure's scope.
//   let count = 0;

//   // The returned object has methods that can access and modify 'count'.
//   return {
//     increment: function() {
//       count++;
//     },
//     getValue: function() {
//       return count;
//     }
//   };
// }

// const counter = createCounter();
// console.log(counter.getValue()); // 0
// counter.increment();
// counter.increment();
// console.log(counter.getValue()); // 2
// // console.log(counter.count); // undefined. You cannot access 'count' directly.



// // 1. Create a constructor function (acts like a basic class blueprint)
// function Animal(name) {
//   this.name = name;
// }

// // 2. Add a method to the Animal's prototype.
// // Any object created by the Animal constructor will have access to this method.
// Animal.prototype.speak = function() {
//   console.log(`${this.name} makes a sound.`);
// };

// // 3. Create another constructor function for Dog.
// function Dog(name) {
//   // Call the Animal constructor to set up the 'name' property.
//   Animal.call(this, name);
// }

// // 4. Set up the inheritance: Make the Dog's prototype a new Animal object.
// // This is the crucial step that links the two.
// Dog.prototype = Object.create(Animal.prototype);

// // 5. Now we can add/override methods on the Dog's prototype.
// Dog.prototype.speak = function() {
//   console.log(`${this.name} barks.`);
// };

// // 6. Create an instance.
// const myDog = new Dog("Rex");

// myDog.speak(); // "Rex barks."
// console.log(myDog.name); // "Rex"

// function demo() {
//     console.log(this);
// }
// demo()

// const person = {
//   name: "Alice",
//   greet: function() {
//     console.log(`Hello, I'm ${this.name}.`); // 'this' refers to the 'person' object
//   }
// };

// const greetFunction=person.greet; // "Hello, I'm Alice."
// greetFunction();

// const user = {
//   name: "Bob",
//   hobbies: ["reading", "hiking", "coding"],
  
//   displayHobbies: function() {
//     // 'this' here is the 'user' object
    
//     this.hobbies.forEach(hobby => {
//       // The arrow function doesn't create its own 'this',
//       // so 'this' is still the 'user' object from the outer scope.
//       console.log(`${this.name} likes ${hobby}.`);
//     });
//   }
// };

// user.displayHobbies();
// // Output:
// // Bob likes reading.
// // Bob likes hiking.
// // Bob likes coding.


// const counter = {
//   count: 0,
//   incrementRegular: function() {
//     this.count++;
//   },
//   incrementArrow: () => {
//     // Be careful here! What is 'this' in this context?
//     this.count++;
//   }
// };

// // Call 1
// counter.incrementRegular();

// // Call 2
// const regularFn = counter.incrementRegular;
// regularFn();

// // Call 3
// counter.incrementArrow();

// console.log(counter.count);



// console.log("First task");
// setTimeout(()=>{
//     console.log("Second task");
// },2000);
// console.log("Third task");

// Simulating an asynchronous operation using a Promise
// function fetchUser(id,callback){
//     setTimeout(()=>{
//         console.log("Fetching user from database...");
//         const user={id:id,name:"John Doe"};
//         callback(user);
//     },2000);
// }
// function getUserPromise(id){
//     return new Promise((resolve,reject)=>{
//         setTimeout(()=>{
//             console.log("Fetching user from database...");
//             const user={id:id,name:"John Doe"};
//             if(user){
//                 resolve(user);
//             }else{
//                 reject(new Error("User not found"));
//             }
//         },1000);
//     });
// }


// CREATING promises (usually in separate modules/functions)
// function getUserPromise(userId) {
//     return new Promise((resolve, reject) => {
//         setTimeout(() => {
//             console.log("Fetching user...");
//             resolve({ id: userId, name: "Alice" });
//         }, 1000);
//     });
// }

// function getPostsPromise(userId) {
//     return new Promise((resolve, reject) => {
//         setTimeout(() => {
//             console.log("Fetching posts...");
//             resolve([{ id: 101, title: "Hello World" }]);
//         }, 800);
//     });
// }

// function getCommentsPromise(postId) {
//     return new Promise((resolve, reject) => {
//         setTimeout(() => {
//             console.log("Fetching comments...");
//             resolve([{ id: 1, text: "Nice post!" }]);
//         }, 500);
//     });
// }

// // USING promises (your original code)
// getUserPromise(1)
//   .then(user => {
//     console.log("Found user:", user);
//     return getPostsPromise(user.id);
//   })
//   .then(posts => {
//     console.log("Found posts:", posts);
//     return getCommentsPromise(posts[0].id);
//   })
//   .then(comments => {
//     console.log("Found comments:", comments);
//   })
//   .catch(error => {
//     console.error("An error occurred:", error.message);
//   });
// The function is marked as 'async'
// async function fetchUserDataAsync() {
//   try {
//     // The code now reads like a simple, synchronous script.
//     // The 'await' keyword pauses execution on each line until the promise resolves.
//     const user = await getUserPromise(1);
//     console.log("Found user:", user);

//     const posts = await getPostsPromise(user.id);
//     console.log("Found posts:", posts);

//     const comments = await getCommentsPromise(posts[0].id);
//     console.log("Found comments:", comments);

//   } catch (error) {
//     // Errors from any 'await' call will be caught here, just like in Java.
//     console.error("An error occurred:", error.message);
//   }
// }

// // Call the async function to start the process
// fetchUserDataAsync();

// function fetchDataUrl(url){
//     return new Promise((resolve,reject)=>{
//         setTimeout(()=>{
//             console.log(`Fetching data from ${url}`);
//             if(url==="success"){
//                 resolve({data:`Data from ${url}`});
//             }else{
//                 reject(new Error("Invalid URL"));
//             }
//         },1500);
//     })
// }
// fetchDataUrl("success")
//     .then(response=>{
//         console.log("Response received:",response);
//     })
//     .catch(error=>{
//         console.error("Error occurred:",error.message);
//     });

// fetchDataUrl("failure")
//     .then(response=>{
//         console.log("Response received:",response);
//     })
//     .catch(error=>{
//         console.error("Error occurred:",error.message);
//     });




// const products = [
//   { name: "Laptop", category: "Electronics", price: 1200 },
//   { name: "Book", category: "Literature", price: 20 },
//   { name: "Monitor", category: "Electronics", price: 300 },
//   { name: "Gaming PC", category: "Electronics", price: 2500 }
// ];

// const expensiveElectronicsNames = products
//   .filter(product => product.category === "Electronics")
//   .filter(product => product.price > 500)
//   .map(product => product.name);

// console.log(expensiveElectronicsNames); // ["Laptop", "Gaming PC"]


// Rest operator, spread operator and destructuring
// Collects all arguments into a single 'numbers' array
// function sum(...numbers) {
//   return numbers.reduce((total, num) => total + num, 0);
// }

// console.log(sum(1, 2, 3));       // 6
// console.log(sum(10, 20, 30, 40)); // 100

// // Can also be used in destructuring
// const rankings = ["First", "Second", "Third", "Fourth"];
// const [winner, ...others] = rankings;

// console.log(winner);  // "First"
// console.log(others);  // ["Second", "Third", "Fourth"]

// const user = {
//   name: "Alice",
//   age: 30,
//   isAdmin: false,
//   // Functions are not valid in JSON, so they are ignored.
//   sayHi: () => "Hello!"
// };

// // Convert the JavaScript object to a JSON string
// const jsonString = JSON.stringify(user, null, 2); // The extra params pretty-print the JSON

// console.log(jsonString);
// /*
// Output:
// "{
//   "name": "Alice",
//   "age": 30,
//   "isAdmin": false
// }"
// */

// const userJsonString = `{
//   "name": "Bob",
//   "age": 42,
//   "roles": ["editor", "viewer"]
// }`;

// // Parse the JSON string into a JavaScript object
// const userObject = JSON.parse(userJsonString);

// console.log(userObject.name);   // "Bob"
// console.log(userObject.roles);  // ["editor", "viewer"]



// // JavaScript example
// class Car {
//   // The constructor method is explicitly named 'constructor'.
//   constructor(make) {
//     // Properties are defined here on the 'this' object.
//     this.make = make;
//   }

//   // Method definitions are clean, without the 'function' keyword.
//   start() {
//     console.log(`Starting the ${this.make}`);
//   }
// }

// const myCar = new Car("Toyota");
// myCar.start(); // "Starting the Toyota"


// // JavaScript example
// class ElectricCar extends Car {
//   constructor(make, batteryRange) {
//     // 'super()' calls the parent class's constructor.
//     // It must be called before accessing 'this'.
//     super(make);
//     this.batteryRange = batteryRange;
//   }

//   // Overriding a method
//   start() {
//     console.log(`Silently starting the ${this.make}`);
//   }

//   charge() {
//     console.log(`Charging... ${this.batteryRange} mile range.`);
//   }
// }

// const myTesla = new ElectricCar("Tesla", 400);
// myTesla.start();  // "Silently starting the Tesla"
// myTesla.charge(); // "Charging... 400 mile range."


// JavaScript example
// const names = new Set();

// names.add("Alice");
// names.add("Bob");
// names.add("Alice"); // This is ignored, as the value already exists

// console.log(names.size); // 2 (it's a property, not a method)

// console.log(names.has("Bob")); // true (uses .has() instead of .contains())

// names.delete("Bob"); // Removes the value
// console.log(names.has("Bob")); // false

// // You can also initialize a Set from an array (duplicates are automatically removed)
// const numbers = new Set([1, 2, 3, 3, 4, 2]);
// console.log(numbers); // Set(4) { 1, 2, 3, 4 }

// // JavaScript example
// const userScores = new Map();

// // Use .set() to add key-value pairs
// userScores.set("Alice", 100);
// userScores.set("Bob", 95);

// // Use .get() to retrieve a value
// console.log(userScores.get("Alice")); // 100

// const userRoles = new Map([
//     [1, "admin"],
//     [2, "editor"]
// ]);
// for (const [user, role] of userRoles) {
//   console.log(`User ID ${user.id} is an ${role}`);
// }
// console.log(userScores.size); // 2


// const arr = [10, 20, 10, 30, 40, 30];

// const set1 = new Set(arr);

// const map1 = new Map();
// // for(const ele of set1){
// //     map1.set(ele, ele*2);
// // }

// set1.forEach(ele=>{
//     map1.set(ele, ele*2);
// });

// for( ele of map1){
//     console.log(ele);
// }



// // Each call to Symbol() creates a new, unique symbol.
// const id1 = Symbol('id');
// const id2 = Symbol('id');

// console.log(id1 === id2); // false

// // Use case: Adding a "hidden" property to an object without risking a name clash.
// const user = {
//   name: "Alice"
// };

// const secretId = Symbol('user_id');
// user[secretId] = 12345;

// console.log(user.name);      // "Alice"
// console.log(user[secretId]); // 12345
// console.log(Object.keys(user)); // ["name"] - Symbol properties are not included in typical object traversals.


// // This is a generator function
// function* numberGenerator() {
//   console.log("Generator started");
//   yield 1; // Pause and yield the value 1
//   console.log("Resumed after 1");
//   yield 2; // Pause and yield the value 2
//   console.log("Resumed after 2");
//   yield 3; // Pause and yield the value 3
//   console.log("Generator finished");
// }

// const gen = numberGenerator(); // Calling it doesn't run the code, it returns an iterator.

// console.log(gen.next()); // { value: 1, done: false } -> "Generator started" is logged
// console.log(gen.next()); // { value: 2, done: false } -> "Resumed after 1" is logged
// console.log(gen.next()); // { value: 3, done: false } -> "Resumed after 2" is logged
// console.log(gen.next()); // { value: undefined, done: true } -> "Generator finished" is logged

// // Because generators produce iterators, they work seamlessly with for...of
// for (const value of numberGenerator()) {
//     console.log(value); // Logs 1, then 2, then 3
// }


// A function that returns a promise which will reject
function willItWork() {
  return new Promise((resolve, reject) => {
    setTimeout(() => reject(new Error("Something went wrong!")), 1000);
  });
}

// An async function to consume the promise
async function performTask() {
  console.log("Starting the task...");
  try {
    // We 'await' the result inside the 'try' block.
    const result = await willItWork();
    console.log("Success:", result); // This line will not be reached
  } catch (error) {
    // If the promise rejects, the error is caught here.
    console.error("Caught an error:", error.message);
  } finally {
    // The 'finally' block runs regardless of success or failure.
    console.log("Task finished.");
  }
}

performTask();