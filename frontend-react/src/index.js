import React from 'react';
import ReactDOM from 'react-dom/client';
import './index.css';

import reportWebVitals from './reportWebVitals';

import {
  createBrowserRouter,
  RouterProvider,
  Route,
} from "react-router-dom";

import Home from "./Routes/Home";
import Root from './Routes/root';
import Register from "./Routes/Register";
import MainMenu from "./Routes/MainMenu";

const router = createBrowserRouter([
  {
    path: "/",
    element: <Root/>,
    children: [
      { //Login
        path: "/",
        element: <Home/>
      },
      { //Principal de registro
        path: "/Register",
        element: <Register/>
      },
      { //Principal de oportunidades
        path: "/MainMenu",
        element: <MainMenu/>
      },
      { //Para añadir más
        path: "/",
        element: <></>
      }
    ]
  }
])


const root = ReactDOM.createRoot(document.getElementById('root'));
root.render(
  <React.StrictMode>
    <RouterProvider router={router} />
  </React.StrictMode>
);

// If you want to start measuring performance in your app, pass a function
// to log results (for example: reportWebVitals(console.log))
// or send to an analytics endpoint. Learn more: https://bit.ly/CRA-vitals
reportWebVitals();
