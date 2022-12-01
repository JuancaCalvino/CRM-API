import React, {useState, useEffect} from 'react';
import LoginCard from '../Components/LoginCard';

export default function Home() {

    const[email, setEmail] = useState();
    const[password, setPassword] = useState();

    function getLoginData(data) {
        setEmail(data.Email)
        setPassword(data.Password)
    } 

    //Hace el post al back con los datos introducidos en el login
    useEffect(() => {
        const requestOptions = {
          method: "POST",

          headers: { "Content-Type": "application/json" },

          body: JSON.stringify({
            Email: email,
            Password: password,
          }),
        };
        fetch("http://localhost:8080/api/user/searchUser", requestOptions)
    })

    return (
      <main>
        <LoginCard sendLoginData={getLoginData}/>
      </main>
    )
}