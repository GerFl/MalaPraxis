import React, {useState,useEffect, useReducer} from "react";
import './App.css';
import {Routes, Route} from "react-router-dom";
import {Home, About, Events, Contacts, Whoops404, Services, CompanyHistory, Location} from "./pages";

// You declare a component as a function
// It returns a piece of UI
// Access the props declared in the App component
// Self-closing component tags
// Declare properties "props" as if they were attributes

function App({login}) {
  // [stateVariable, functionToUpdateState]
  // const [emotion, setEmotion] = useState("happy");
  // const [secondary, setSecondary] = useState("tired");

  // Allows to do things different from the render
  // useEffect watches and manages side effects not related to the component's render
  // useEffect(()=>{
  //   console.log(`It's ${emotion} around here!`);
  // },[emotion]);
  
  // Toggle with useState
  // const [checked,setChecked]=useState(false);
  // function toggle(){
  //   setChecked(checked=>!checked)
  // }
  // Toggle with useReducer
  // const [checked,toggle]=useReducer(
  //   checked=>!checked,
  //   false
  // );
  // Fetching data with Hooks
  // const [data,setData]=useState(null); // We won't have data when the app loads
  // const [loading,setLoading]=useState(false);
  // const [error,setError]=useState(null);
  // useEffect(()=>{
  //   if(!login) return;
  //   setLoading(true);
  //   fetch(`https://api.github.com/users/${login}`)
  //     .then((response)=>response.json())
  //     .then(setData)
  //     .then(()=>setLoading(false))
  //     .catch(setError);
  // },[login]); // Fetch data only when component renders

  // if(loading) return <h1>Loading...</h1>
  // if(error) return <pre>{JSON.stringify(error,null,2)}</pre>;
  // if(!data) return null;

  // if(data){
  //   return (<div>
  //     <h1>{data.login}</h1>
  //     <p>{data.location}</p>
  //     <img src={data.avatar_url} alt={data.login}/>
  //   </div>)
  // }

  return(
    <>
      {/* <h1>Current emotion is {emotion}</h1>
      <button onClick={()=>setEmotion("frustrated")}>Frustrate</button>
      <label htmlFor="checkbox">{checked?"checked":"not checked"}</label>
      <input id="checkbox" type="checkbox" value={checked} onChange={()=>toggle()}/>
      <h1>Hello React Testing Library</h1> */}
      <Routes>
        <Route path="/" element={<Home/>}/>
        <Route path="/about" element={<About/>}/>
          {/* <Route path="/services" element={<Services/>}/>
          <Route path="/history" element={<CompanyHistory/>}/>
          <Route path="/location" element={<Location/>}/>
        </Route> */}
        <Route path="/events" element={<Events/>}/>
        <Route path="/contacts" element={<Contacts/>}/>
        <Route path="/*" element={<Whoops404/>}/>
      </Routes>
    </>
  )
}

export default App;
