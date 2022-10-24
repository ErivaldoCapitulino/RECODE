import Header from "../../../components/layout/Header/Header";
import ModalEscrever from "../../../components/layout/Modal/ModalEscrever";
import ModalLogin from "../../../components/layout/Modal/ModalLogin";
import PosHeader from "../../../components/layout/PosHeader/PosHeader";

import CaboSantoAgostinho from "../../../assets/img/nacionais/cabo-santo-agostinho.jpg";
import FernandoDeNoronha from "../../../assets/img/nacionais/fernando-de-noronha.jpg";
import Curitiba from "../../../assets/img/nacionais/curitiba.jpg";
import Fortaleza from "../../../assets/img/nacionais/fortaleza.jpg";
import RioDeJaneiro from "../../../assets/img/nacionais/rio-de-janeiro.jpg";
import JoaoPessoa from "../../../assets/img/nacionais/joao-pessoa.jpg";
import Footer from "../../../components/layout/Footer/Footer";

export default function Nacional() {
  return (
    <>
      <ModalLogin />
      <ModalEscrever />
      <Header />
      <PosHeader titulo="Nacionais" />
      <div className="container mt-4">
        <div className="row text-center">
          <div className="col-lg">
            <div className="galeria-imagem">
              <img
                className="img-fluid"
                data-bs-toggle="modal"
                data-bs-target="#modal-caboSantoAgostinho"
                src={CaboSantoAgostinho}
                alt="Cabo Santo Agostinho"
              />
              <p>Cabo Santo Agostinho</p>
              <a
                className="btn btn-primary"
                data-bs-toggle="modal"
                data-bs-target="#modal-caboSantoAgostinho"
                href="/"
              >
                Saiba Mais
              </a>
            </div>

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
                data-bs-target="#modal-curitiba"
                src={Curitiba}
                alt="Curitiba"
              />
              <p>Curitiba</p>
              <a
                className="btn btn-primary"
                data-bs-toggle="modal"
                data-bs-target="#modal-curitiba"
                href="/"
              >
                Saiba Mais
              </a>
            </div>
            <div className="galeria-imagem">
              <img
                className="img-fluid"
                data-bs-toggle="modal"
                data-bs-target="#modal-fortaleza"
                src={Fortaleza}
                alt="Fortaleza"
              />
              <p>Fortaleza</p>
              <a
                className="btn btn-primary"
                data-bs-toggle="modal"
                data-bs-target="#modal-fortaleza"
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
                data-bs-target="#modal-rioJaneiro"
                src={RioDeJaneiro}
                alt="Rio de Janeiro"
              />
              <p>Rio de Janeiro</p>
              <a
                className="btn btn-primary"
                data-bs-toggle="modal"
                data-bs-target="#modal-rioJaneiro"
                href="/"
              >
                Saiba Mais
              </a>
            </div>
            <div className="galeria-imagem">
              <img
                className="img-fluid"
                data-bs-toggle="modal"
                data-bs-target="#modal-joaoPessoa"
                src={JoaoPessoa}
                alt="João Pessoa"
              />
              <p>João Pessoa</p>
              <a
                className="btn btn-primary"
                data-bs-toggle="modal"
                data-bs-target="#modal-joaoPessoa"
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
