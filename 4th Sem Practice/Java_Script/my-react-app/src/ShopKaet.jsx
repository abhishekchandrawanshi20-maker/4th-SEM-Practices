// import React from "react";

// const products = [
//   {
//     id: 1,
//     name: "Nike Shoes",
//     price: "₹2,999",
//     image: "https://via.placeholder.com/200",
//   },
//   {
//     id: 2,
//     name: "Smart Watch",
//     price: "₹1,999",
//     image: "https://via.placeholder.com/200",
//   },
//   {
//     id: 3,
//     name: "Headphones",
//     price: "₹999",
//     image: "https://via.placeholder.com/200",
//   },
// ];

// function App() {
//   return (
//     <div className="min-h-screen bg-gray-100">
      
//       {/* Navbar */}
//       <nav className="bg-blue-600 text-white p-4 flex justify-between items-center">
//         <h1 className="text-2xl font-bold">ShopKart</h1>
//         <button className="bg-white text-blue-600 px-4 py-2 rounded">
//           Cart
//         </button>
//       </nav>

//       {/* Product Section */}
//       <div className="max-w-6xl mx-auto p-6">
//         <h2 className="text-3xl font-bold mb-6">Products</h2>

//         <div className="grid grid-cols-1 md:grid-cols-2 lg:grid-cols-3 gap-6">
//           {products.map((product) => (
//             <div
//               key={product.id}
//               className="bg-white rounded-lg shadow-md p-4"
//             >
//               <img
//                 src={product.image}
//                 alt={product.name}
//                 className="w-full rounded-md"
//               />

//               <h3 className="text-xl font-semibold mt-3">
//                 {product.name}
//               </h3>

//               <p className="text-green-600 font-bold mt-2">
//                 {product.price}
//               </p>

//               <button className="w-full bg-blue-600 text-white py-2 mt-4 rounded hover:bg-blue-700">
//                 Add to Cart
//               </button>
//             </div>
//           ))}
//         </div>
//       </div>

//     </div>
//   );
// }

// export default App;