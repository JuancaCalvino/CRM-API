import React, {useState, useEffect} from 'react';
import RegisterCard from '../Components/RegisterCard';

export default function Register() {

    const[email, setEmail] = useState();
    const[password, setPassword] = useState();
    const[name, setName] = useState();
    const[phone, setPhone] = useState();
    const[address, setAddress] = useState();

    function getRegisterData(data) {
        setEmail(data.Email)
        setPassword(data.Password)
        setName(data.Name)
        setPhone(data.Phone)
        setAddress(data.Address)
    }

    //Hace el post al back con los datos introducidos en el registro
    useEffect(() => {
        const requestOptions = {
          method: "POST",

          headers: { "Content-Type": "application/json" },

          body: JSON.stringify({
            Email: email,
            Password: password,
            Address: address,
            Phone: phone,
            Name: name,
          }),
        };
        fetch("http://localhost:8080/api/user/createUser", requestOptions)
    })

    return (
        <main>
            <RegisterCard sendRegisterData={getRegisterData}/>
        </main>
    )
}