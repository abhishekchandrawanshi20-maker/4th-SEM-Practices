
// let h1= document.querySelectorAll("h1");
//  let h1=     document.getElementsByClassName("two");

//  let h3= document.querySelector("h3");
//  let name=  prompt("Enter your name");

//  h3.innerText="Name"+""+name;
//  h1[0].style.color



// let h1=document.querySelector("h1");

// let p=     document.createElement("p");
// p.innerText="hello";
// h1.appendChild(p);
// console.log(h1);

//h1.innerText="hello";


// let inp= document.querySelector("input");
// let h1= document.querySelector("h1");
// let btn = document.querySelector("button");
// console.log(btn,hii);


// btn.addEventListener("click",function(e){
//     console.log("hello");
//     let data = input.value;
//     h1.innerText = data;
//     input.value = "";
    
// })
//     inp.addEventListener("input", function(e){
//  //   console.log(e.target.value);
//    h1.innerText= e.target.value 
// })


// for(let i of h1){
//     h[i].style.color="red"
// }


// Calculator

let inp =document.querySelector("input");
let buttons = document.querySelectorAll("button");
   for(let btn of buttons){
       btn.addEventListener("click",()=>{
              let btnText = btn.innerText;
              console.log(btnText);
              if(btnText === "AC"){
                inp.value=""
              }else if(btnText==='='){

                inp.value= eval(inp.value)
              }else{
                inp.value+=btnText
              }
              

       })
 }

