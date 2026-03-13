import React from 'react';
import LoginCard from '../Components/LoginCard';
import { useNavigate } from 'react-router-dom';

export default function Home() {

    const navigate = useNavigate();

    // Hace el post al back con los datos introducidos en el login
    function handleLogin(data) {
        const requestOptions = {
          method: "POST",
          headers: { "Content-Type": "application/json" },
          body: JSON.stringify({
            email: data.Email,
            password: data.Password,
          }),
        };

        fetch("http://localhost:8080/api/user/searchUser", requestOptions)
          .then((response) => {
            if (response.ok) {
              navigate("/MainMenu");
            }
          })
          .catch((error) => {
            console.error("Error en login:", error);
          });
    }

    return (
      <main>
        <LoginCard sendLoginData={handleLogin}/>
      </main>
    )
}