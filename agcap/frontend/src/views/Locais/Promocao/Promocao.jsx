import Footer from "../../../components/layout/Footer/Footer";
import Header from "../../../components/layout/Header/Header";
import ModalLogin from "../../../components/layout/Modal/ModalLogin";
import PosHeader from "../../../components/layout/PosHeader/PosHeader";

import Alemanha from "../../../assets/img/internacionais/alemanha.jpg";
import FernandoDeNoronha from "../../../assets/img/nacionais/fernando-de-noronha.jpg";
import Cruzeiro from "../../../assets/img/cruzeiro/cruzeiro5.jpg";

export default function Promocao() {
  return (
    <>
      <ModalLogin />
      <Header />
      <PosHeader titulo="Promoção" />

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
          </div>

          <div className="col-lg">
            <div className="galeria-imagem">
              <img
                className="img-fluid"
                data-bs-toggle="modal"
                data-bs-target="#modal-fernandoNoronha"
                src={FernandoDeNoronha}
                alt="Fernando de Noronha"
              />
              <p>Fernando de Noronha</p>
              <a
                className="btn btn-primary"
                data-bs-toggle="modal"
                data-bs-target="#modal-fernandoNoronha"
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
                data-bs-target="#modal-americaSul"
                src={Cruzeiro}
                alt="América do Sul"
              />
              <p>América do Sul</p>
              <a
                className="btn btn-primary"
                data-bs-toggle="modal"
                data-bs-target="#modal-americaSul"
                href="/"
              >
                Saiba Mais
              </a>
            </div>
          </div>
        </div>
      </div>
      <Footer />
    </>
  );
}
