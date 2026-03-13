import { useState } from "react";
import "./Styles/RegisterCard.css";

import validator from "validator"; //Para validaciones de formato de inputs

function RegisterCard({ sendRegisterData }) {

  const [enteredEmail, setEmail] = useState("");
  const [enteredPassword, setPassword] = useState("");
  const [enteredName, setName] = useState("");
  const [enteredPhone, setPhone] = useState("");
  const [enteredAddress, setAddress] = useState("");
  const [message, setMessage] = useState("");

  function passwordChangeHandler(event) {
    setPassword(event.target.value);
  }

  function addressChangeHandler(event) {
    setAddress(event.target.value);
  }

  function handleSubmit(event) {
    event.preventDefault();

    //Paso los datos al registro
    const DatosRegistro = {
      Email: enteredEmail,
      Password: enteredPassword,
      Name: enteredName,
      Phone: enteredPhone,
      Address: enteredAddress
    }

    sendRegisterData(DatosRegistro);

    setEmail("");
    setPassword("");
    setName("");
    setPhone("");
    setAddress("");
  }

  //Valida MAIL
  function validateEmail(e) {
    var email = e.target.value;

    if (validator.isEmail(email)) {
      setEmail(email)
      setMessage("");
    } else {
      setMessage("Please, enter valid Email!");
    }
  }

  //Valida PHONE
  function phoneChangeHandler(event) {
    const result = event.target.value.replace(/\D/g, '');

    if (result !== '') {
      setPhone(Number(result));
    }
  }

  //Valida NAME
  function nameChangeHandler(event) {
    const result = event.target.value.replace(/[^a-z ]/gi, '');
    setName(result);
  }

  return (
    <div className="card">
      <div className="login-form">
        <div className="title">Register</div>
        <div className="form">
          <form onSubmit={handleSubmit}>

            <div className="input-container">
              <label>Name</label>
              <input
                type="text"
                name="name"
                value={enteredName}
                required
                onChange={nameChangeHandler}
              />
            </div>

            <div className="input-container">
              <label>Password</label>
              <input
                type="password"
                name="password"
                value={enteredPassword}
                required
                onChange={passwordChangeHandler}
              />
            </div>

            <div className="input-container">
              <label>Email</label>
              <input
                type="text"
                name="email"
                required
                onChange={validateEmail}
                />
                <br/>
                <span style={{fontWeight: "bold", color: "red"}}>
                    {message}
                </span>
            </div>

            <div className="input-container">
              <label>Phone</label>
              <input
                type="text"
                name="phone"
                value={enteredPhone}
                required
                onChange={phoneChangeHandler}
              />
            </div>

            <div className="input-container">
              <label>Address</label>
              <input
                type="text"
                name="address"
                value={enteredAddress}
                required
                onChange={addressChangeHandler}
              />
            </div>

            <div className="button-container">
              <input type="submit" />
            </div>
          </form>
        </div>
      </div>
    </div>
  );
}
export default RegisterCard;
