import { useState } from "react";
import "./Styles/LoginCard.css";

function LoginCard(props) {
  const [enteredEmail, setEmail] = useState();
  const [enteredPassword, setPassword] = useState();

  function emailChangeHandler(event) {
    setEmail(event.target.value);
  }
  function passwordChangeHandler(event) {
    setPassword(event.target.value);
  }

  function handleSubmit(event) {
    event.preventDefault();

    //Paso los datos al login

    const DatosLogin = {
      Email: enteredEmail,
      Password: enteredPassword
    }

    props.sendLoginData(DatosLogin);

    setEmail("");
    setPassword("");
  }

  return (
    <div className="card">
      <div className="login-form">
        <div className="title">Sign In</div>
        <div className="form">
          <form onSubmit={handleSubmit}>
            <div className="input-container">
              <label>Username </label>
              <input
                type="text"
                name="email"
                value={enteredEmail}
                required
                onChange={emailChangeHandler}
              />
            </div>
            <div className="input-container">
              <label>Password </label>
              <input
                type="password"
                name="password"
                value={enteredPassword}
                required
                onChange={passwordChangeHandler}
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
export default LoginCard;
