import { useState } from "react";
import "./Styles/LoginCard.css";

function LoginCard() {

    const [enteredEmail, setEmail] = useState();
    const [enteredPassword, setPassword] = useState();

    function useInput({})
    {
        const [value, set]
    }

    function emailChange() {

        setEmail()
    }

    function handleSubmit(event)
    {
        event.preventDefault();

        //Hago el post
    }

    return (
      <div className="card">
        <div className="login-form">
          <div className="title">Sign In</div>
          <div className="form">
            <form onSubmit={handleSubmit}>
              <div className="input-container">
                <label>Username </label>
                <input type="text" name="email" required onChange={emailChange}/>
              </div>
              <div className="input-container">
                <label>Password </label>
                <input type="password" name="password" required onChange={passwordChange}/>
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