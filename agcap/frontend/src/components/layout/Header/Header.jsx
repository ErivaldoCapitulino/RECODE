import "./Header.css";
import Logo from "../../../assets/img/icones/logo.png";

import { Link } from "react-router-dom";

export default function Header() {
  return (
    <>
      <Header />
      <nav className="navbar navbar-expand-md nav-color  fixed-top box-shadow">
        <div className="container-fluid">
          <Link to="/home" className="navbar-brand">
            <img src={Logo} alt="Logo" />
          </Link>
          <i className="bi bi-telephone-fill"></i>
          <span className="phoneNumber">+55 (99) 9999-9999</span>
          <a href="/">
            <i className="bi bi-instagram"></i>
          </a>
          <a href="/">
            <i className="bi bi-facebook"></i>
          </a>
          <a href="/">
            <i className="bi bi-messenger"></i>
          </a>
          <button
            className="navbar-toggler"
            type="button"
            data-bs-toggle="collapse"
            data-bs-target="#navbarSupportedContent"
            aria-controls="navbarSupportedContent"
            aria-expanded="false"
            aria-label="Toggle navigation"
          >
            <span className="navbar-toggler-icon"></span>
          </button>
          <div className="collapse navbar-collapse" id="navbarSupportedContent">
            <ul className="navbar-nav ms-auto" id="navbarSupportedContent">
              <li className="nav-item">
                <Link to="/home" className="nav-link">
                  {" "}
                  Home{" "}
                </Link>
              </li>

              <li className="nav-item dropdown">
                <a
                  className="nav-link dropdown-toggle"
                  type="button"
                  id="dropdownMenuButton1"
                  data-bs-toggle="dropdown"
                  aria-expanded="false"
                  href="/"
                >
                  Locais
                </a>
                <ul
                  className="dropdown-menu"
                  aria-labelledby="dropdownMenuButton1"
                >
                  <li>
                    <Link to="/internacional" className="dropdown-item">
                      {" "}
                      Internacionais{" "}
                    </Link>
                  </li>
                  <li>
                    <Link to="/nacional" className="dropdown-item">
                      {" "}
                      Nacionais{" "}
                    </Link>
                  </li>
                  <li>
                    <Link to="/cruzeiro" className="dropdown-item">
                      {" "}
                      Cruzeiro{" "}
                    </Link>
                  </li>
                  <li>
                    <Link to="/promocao" className="dropdown-item">
                      {" "}
                      Promoção{" "}
                    </Link>
                  </li>
                </ul>
              </li>

              <li className="nav-item">
                <Link to="/plano" className="nav-link">
                  {" "}
                  Plano{" "}
                </Link>
              </li>
              <li className="nav-item">
                <a
                  className="nav-link"
                  data-bs-toggle="modal"
                  data-bs-target="#modal-login"
                  href="/"
                >
                  Login
                </a>
              </li>
              <li className="nav-item">
                <a
                  className="btn btn-outline-primary ms-md-2"
                  data-bs-toggle="modal"
                  data-bs-target="#modal-escrever"
                  href="/"
                >
                  Inscreva-se
                </a>
              </li>
            </ul>
          </div>
        </div>
      </nav>
    </>
  );
}
