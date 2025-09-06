function Greeting({username}){
  return <h1>Hello, {username}!</h1>;
}

function UserProfile({name, age}){
  return(
    <div>
      <h2>Name: {name}</h2>
      <p>Age: {age}</p>
    </div>
  );
}

export default function HomePage(){
  return (
    <main>
      <Greeting username="Alice" />
      <Greeting username="Bob" />
      <Greeting username="Charlie" />

      <UserProfile name="Alice" age={30} />
      <UserProfile name="Bob" age={25} />
      <UserProfile name="Charlie" age={35} />
    </main>
  );
}