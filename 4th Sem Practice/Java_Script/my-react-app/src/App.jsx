
import { useEffect } from "react"
import { useState } from "react" 

// import { useState } from 'react'
// import reactLogo from './assets/react.svg'
// import viteLogo from './assets/vite.svg'
// import heroImg from './assets/hero.png'
// import './App.css'


// const { useState } = require("react")

// function App() {
//   const [count, setCount] = useState(0)

//   return (
//     <>
//       <section id="center">
//         <div className="hero">
//           <img src={heroImg} className="base" width="170" height="179" alt="" />
//           <img src={reactLogo} className="framework" alt="React logo" />
//           <img src={viteLogo} className="vite" alt="Vite logo" />
//         </div>
//         <div>
//           <h1>Get started</h1>
//           <p>
//             Edit <code>src/App.jsx</code> and save to test <code>HMR</code>
//           </p>
//         </div>
//         <button
//           type="button"
//           className="counter"
//           onClick={() => setCount((count) => count + 1)}
//         >
//           Count is {count}
//         </button>
//       </section>

//       <div className="ticks"></div>

//       <section id="next-steps">
//         <div id="docs">
//           <svg className="icon" role="presentation" aria-hidden="true">
//             <use href="/icons.svg#documentation-icon"></use>
//           </svg>
//           <h2>Documentation</h2>
//           <p>Your questions, answered</p>
//           <ul>
//             <li>
//               <a href="https://vite.dev/" target="_blank">
//                 <img className="logo" src={viteLogo} alt="" />
//                 Explore Vite
//               </a>
//             </li>
//             <li>
//               <a href="https://react.dev/" target="_blank">
//                 <img className="button-icon" src={reactLogo} alt="" />
//                 Learn more
//               </a>
//             </li>
//           </ul>
//         </div>
//         <div id="social">
//           <svg className="icon" role="presentation" aria-hidden="true">
//             <use href="/icons.svg#social-icon"></use>
//           </svg>
//           <h2>Connect with us</h2>
//           <p>Join the Vite community</p>
//           <ul>
//             <li>
//               <a href="https://github.com/vitejs/vite" target="_blank">
//                 <svg
//                   className="button-icon"
//                   role="presentation"
//                   aria-hidden="true"
//                 >
//                   <use href="/icons.svg#github-icon"></use>
//                 </svg>
//                 GitHub
//               </a>
//             </li>
//             <li>
//               <a href="https://chat.vite.dev/" target="_blank">
//                 <svg
//                   className="button-icon"
//                   role="presentation"
//                   aria-hidden="true"
//                 >
//                   <use href="/icons.svg#discord-icon"></use>
//                 </svg>
//                 Discord
//               </a>
//             </li>
//             <li>
//               <a href="https://x.com/vite_js" target="_blank">
//                 <svg
//                   className="button-icon"
//                   role="presentation"
//                   aria-hidden="true"
//                 >
//                   <use href="/icons.svg#x-icon"></use>
//                 </svg>
//                 X.com
//               </a>
//             </li>
//             <li>
//               <a href="https://bsky.app/profile/vite.dev" target="_blank">
//                 <svg
//                   className="button-icon"
//                   role="presentation"
//                   aria-hidden="true"
//                 >
//                   <use href="/icons.svg#bluesky-icon"></use>
//                 </svg>
//                 Bluesky
//               </a>
//             </li>
//           </ul>
//         </div>
//       </section>

//       <div className="ticks"></div>
//       <section id="spacer"></section>
//     </>
//   )
// }

// export default App











// import React, { useState, useEffect } from 'react';

// const App = () => {

//     let [count, setCount] = useState(0);
//     let [city, SetCity]=useState("Goa")
//     useEffect(() => {
//            // console.log("hello");
//            async function call(){
//             let res = await fetch("https://jsonplaceholder.typicode.com/todos")
//             let data = await res.json()
//             console.log(data);
            
//            }
//            call()

//     }, []);

//     return (
//         <div>
//             <h2>{count}</h2>
//             <h4>{city}</h4>

//             <button onClick={()=> SetCity("Manali")}>Change</button>
//             <button onClick={() => setCount(count + 1)}>Click</button>
//         </div>
//     );
// }

// export default App;











// import React, { useState, useEffect } from 'react';

// const App = () => {

//     let [ApiData,SetApiData] = useState([]);
    
//     useEffect(() => {
//            // console.log("hello");
//            async function call(){
//             let res = await fetch("https://jsonplaceholder.typicode.com/todos")
//             let data = await res.json()
//             // console.log(data);
//             SetApiData(data)
            
//            }
//            call()

//     }, []);

//     return (
//         <div>
//             {
//                 ApiData.map((a)=>{
//                     return(
//                         <div>
//                             <h1>{a.id}</h1>
//                         </div>
//                     )
//                 })
//             }
//         </div>
//     );
// }

// // export default App;








// import './App.css'

// const App = () => {

//     let [ApiData,SetApiData] = useState([]);
    
//     useEffect(() => {
//            // console.log("hello");
//            async function call(){
//             let res = await fetch("https://dummyjson.com/products")
//             let data = await res.json()
//             console.log(data.products);
//             SetApiData(data.products)
            
//            }
//            call()

//     }, []);

//     return (
//         <div id ="parent_div"  className="">
//             {
//                 ApiData.map((a)=>{
//                     return(
//                         <div id="card">
//                             <h1>{a.id}</h1>
//                             <img src={a.thumbnail}/>
//                         </div>
//                     )
//                 })
//             }
//         </div>
//     );
// }

// export default App;













// // Dt:-03/06/2026
// // Todo List
// import React from 'react'
// import Todo from "./Todo"

// const App = () => {
//   return (
//     <div>
//       <Todo/>
//     </div>
//   )
// }

// export default App








// // Dt:-08/06/26
// // useContext 


// import React from 'react'
// import Home from "./Home"

// //main-> app-> A-> b-> C



// import NavBar from "./NavBar"

// import { Route, Routes } from "react-router-dom"
// import Cart from "./Cart"

// const App = () => {
//   let [apiData,SetApiData] =   useState([])
//  let [cart,SetCart]= useState([])
//   return (

//     <div>
//       <NavBar/>
//       <Routes>
//         <Route path="/" element={<Home apiData={apiData}  SetApiData={SetApiData} cart={cart}  SetCart={SetCart}/>}/>
//         <Route path="/cart" element={<Cart cart={cart}/>}/>

//       </Routes>
//     </div>
//   )
// }

// export default App







// import React from 'react'
// import Todo from './Todo'

// const App = () => {
//   return (
//     <div>
//       <Todo/>
//     </div>
//   )
// }

// export default App












// import React from 'react'
// import UserList from "./UserList"
// import { Route, Routes } from "react-router-dom"
// import UserProfile from "./UserProfile"

// const App = () => {
//   return (
//     <div>
//      {/* http://localhost:5173/profile/0 */}
//       <Routes>
//         <Route   path="/"   element={ <UserList/>}/>
//         <Route   path="/profile/:id"   element={ <UserProfile/>}/>

//       </Routes>
//     </div>
//   )
// }

// export default App











// const App = () =>{
//   Array.prototype.myMap=function(cb){
//     // let res=[]
//     for(let i=0; i<this.length; i++) {
//       // res.push(cb(this[i], i, this))
//       cb(this[i], i, this)
//       // if (cb(this[i], i, this)){
//       //   res.push(this[i])
//       // }
//     }
//     // return res

//   }
   
//   let arr=[1,2,3,43,5]

//   let data = arr.map((a,b,c)=>{

//     // return a>2
//     console.log(a);

//   }  )
//   console.log(data);
  
// }



const App = ()=>{

  Array.prototype.myR=function(cb, initialData=0){
    let sum = initialData
    for(let i=0; i<this.length; i++) {
      sum=cb(sum,this[i])
    }
    return sum
  }
  let arr=[1,2,3,4,5]
  let data = arr.myR((a,b,c,d)=>{
    return a+b

  })
  console.log(data);


}


