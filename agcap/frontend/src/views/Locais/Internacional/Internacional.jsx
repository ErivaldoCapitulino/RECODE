import "./Internacional.css";
import Footer from "../../../components/layout/Footer/Footer";
import Header from "../../../components/layout/Header/Header";
import PosHeader from "../../../components/layout/PosHeader/PosHeader";

import Alemanha from "../../../assets/img/internacionais/alemanha.jpg";
import EstadosUnidos from "../../../assets/img/internacionais/estados-unidos.jpg";
import Holanda from "../../../assets/img/internacionais/holanda.jpg";
import Portugal from "../../../assets/img/internacionais/portugal.jpg";
import Inglaterra from "../../../assets/img/internacionais/inglaterra.jpg";
import Paris from "../../../assets/img/internacionais/paris.jpg";
import ModalLogin from "../../../components/layout/Modal/ModalLogin";

export default function Internacional() {
  return (
    <>
      <ModalLogin></ModalLogin>
      <Header />
      <PosHeader titulo="Internacionais" />

      <div className="container mt-4">
        <div className="row text-center">
          <div className="col-lg">
            <div className="galeria-imagem">
              <img
                className="img-fluid"
                data-bs-toggle="modal"
                data-bs-target="#modal-alemanha"
                src={Alemanha}
                alt="Alemanhã"
              />
              <p>Alemanhã</p>
              <a
                className="btn btn-primary"
                data-bs-toggle="modal"
                data-bs-target="#modal-alemanha"
                href="internacionais/alemanha.html"
              >
                Saiba Mais
              </a>
            </div>

            <div className="galeria-imagem">
              <img
                className="img-fluid"
                data-bs-toggle="modal"
                data-bs-target="#modal-eua"
                src={EstadosUnidos}
                alt="Estados Unidos"
              />
              <p>Estados Unidos</p>
              <a
                className="btn btn-primary"
                data-bs-toggle="modal"
                data-bs-target="#modal-eua"
                href="internacionais/estadosUnidos.html"
              >
                Saiba Mais
              </a>
            </div>
          </div>

          <div className="col-lg">
            <div className="galeria-imagem">
              <img
                className="img-fluid"
                data-bs-toggle="modal"
                data-bs-target="#modal-holanda"
                src={Holanda}
                alt="Holanda"
              />
              <p>Holanda</p>
              <a
                className="btn btn-primary"
                data-bs-toggle="modal"
                data-bs-target="#modal-holanda"
                href="/"
              >
                Saiba Mais
              </a>
            </div>
            <div className="galeria-imagem">
              <img
                className="img-fluid"
                data-bs-toggle="modal"
                data-bs-target="#modal-portugal"
                src={Portugal}
                alt="Portugal"
              />
              <p>Portugal</p>
              <a
                className="btn btn-primary"
                data-bs-toggle="modal"
                data-bs-target="#modal-portugal"
                href="/"
              >
                Saiba Mais
              </a>
            </div>
          </div>

          <div className="col-lg">
            <div className="galeria-imagem">
              <img
                className="img-fluid"
                data-bs-toggle="modal"
                data-bs-target="#modal-inglaterra"
                src={Inglaterra}
                alt="inglaterra"
              />
              <p>Inglaterra</p>
              <a
                className="btn btn-primary"
                data-bs-toggle="modal"
                data-bs-target="#modal-inglaterra"
                href="/"
              >
                Saiba Mais
              </a>
            </div>

            <div className="col-lg">
              <div className="galeria-imagem">
                <img
                  className="img-fluid"
                  data-bs-toggle="modal"
                  data-bs-target="#modal-inglaterra"
                  src={Paris}
                  alt="paris"
                />
                <p>Paris</p>
                <a
                  className="btn btn-primary"
                  data-bs-toggle="modal"
                  data-bs-target="#modal-inglaterra"
                  href="/"
                >
                  Saiba Mais
                </a>
              </div>
            </div>
          </div>
        </div>
      </div>

      <Footer />
    </>
  );
}
