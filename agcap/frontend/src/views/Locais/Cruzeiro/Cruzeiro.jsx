import Header from "../../../components/layout/Header/Header";
import Cruzeiro1 from "../../../assets/img/cruzeiro/cruzeiro1.jpg";
import Cruzeiro2 from "../../../assets/img/cruzeiro/cruzeiro2.jpg";
import Cruzeiro3 from "../../../assets/img/cruzeiro/cruzeiro3.jpg";
import Cruzeiro4 from "../../../assets/img/cruzeiro/cruzeiro4.jpg";
import Cruzeiro5 from "../../../assets/img/cruzeiro/cruzeiro5.jpg";
import Cruzeiro6 from "../../../assets/img/cruzeiro/cruzeiro6.jpg";
import Footer from "../../../components/layout/Footer/Footer";
import PosHeader from "../../../components/layout/PosHeader/PosHeader";
import ModalLogin from "../../../components/layout/Modal/ModalLogin";

export default function Cruzeiro() {
  return (
    <>
      <Header />
      <PosHeader titulo="Cruzeiros" />
      {/* <section className="container-fluid">
        <div className="row display-4 viagemSonhos text-white text-center py-3">
          <div className="col-12">
            <span>Cruzeiros</span>
          </div>
        </div>
      </section> */}
      <ModalLogin />
      <div className="container mt-4">
        <div className="row text-center">
          <div className="col-lg">
            <div className="galeria-imagem">
              <img
                className="img-fluid"
                data-bs-toggle="modal"
                data-bs-target="#modal-santos"
                src={Cruzeiro1}
                alt="Cruzeiro"
              />
              <p>embarques em Santos, Salvador e Maceió</p>
              <a
                className="btn btn-primary"
                data-bs-toggle="modal"
                data-bs-target="#modal-santos"
                href="/"
              >
                Saiba Mais
              </a>
            </div>

            <div className="galeria-imagem">
              <img
                className="img-fluid"
                data-bs-toggle="modal"
                data-bs-target="#modal-rj"
                src={Cruzeiro2}
                alt="Cruzeiro"
              />
              <p>Embarques no Rio de Janeiro</p>
              <a
                className="btn btn-primary"
                data-bs-toggle="modal"
                data-bs-target="#modal-rj"
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
                data-bs-target="#modal-santos"
                src={Cruzeiro3}
                alt="Cruzeiro"
              />
              <p>Embarques em Santos</p>
              <a
                className="btn btn-primary"
                data-bs-toggle="modal"
                data-bs-target="#modal-santos"
                href="/"
              >
                Saiba Mais
              </a>
            </div>
            <div className="galeria-imagem">
              <img
                className="img-fluid"
                data-bs-toggle="modal"
                data-bs-target="#modal-itajai"
                src={Cruzeiro4}
                alt="Cruzeiro"
              />
              <p>Embarques em Itajaí</p>
              <a
                className="btn btn-primary"
                data-bs-toggle="modal"
                data-bs-target="#modal-itajai"
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
                src={Cruzeiro5}
                alt="Rio de Janeiro"
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
            <div className="galeria-imagem">
              <img
                className="img-fluid"
                data-bs-toggle="modal"
                data-bs-target="#modal-europeu"
                src={Cruzeiro6}
                alt="João Pessoa"
              />
              <p>Europeu</p>
              <a
                className="btn btn-primary"
                data-bs-toggle="modal"
                data-bs-target="#modal-europeu"
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
