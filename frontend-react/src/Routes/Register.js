import React from 'react';
import RegisterCard from '../Components/RegisterCard';
import { useNavigate } from 'react-router-dom';

export default function Register() {

    const navigate = useNavigate();

    // Hace el post al back con los datos introducidos en el registro
    function handleRegister(data) {
        const requestOptions = {
          method: "POST",
          headers: { "Content-Type": "application/json" },
          body: JSON.stringify({
            email: data.Email,
            password: data.Password,
            address: data.Address,
            phone: data.Phone,
            name: data.Name,
          }),
        };

        fetch("http://localhost:8080/api/user/createUser", requestOptions)
          .then((response) => {
            if (response.ok) {
              navigate("/MainMenu");
            }
          })
          .catch((error) => {
            console.error("Error en registro:", error);
          });
    }

    return (
        <main>
            <RegisterCard sendRegisterData={handleRegister}/>
        </main>
    )
}