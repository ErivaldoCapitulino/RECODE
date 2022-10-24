import "./Pacote.css";
import Internacionais from "../../../assets/img/internacionais/paris.jpg";
import RioJaneiro from "../../../assets/img/nacionais/rio-de-janeiro.jpg";
import Cruzeiro from "../../../assets/img/cruzeiro/cruzeiro1.jpg";
import Recife from "../../../assets/img/cidades/Recife.jpg";

export default function Pacote() {
  return (
    <section className="py-5">
      <div className="row">
        <div className="col-lg-3 md-2 centralizar display-4 text-white p-3">
          <a href="paginas/internacionais.html">
            <div className="carousel-inner">
              <div className="carousel-item active">
                <img
                  className="imagem-lado"
                  src={Internacionais}
                  alt="Primeiro Slide"
                />
                <div className="carousel-caption">
                  <h2>Internacionais</h2>
                </div>
              </div>
            </div>
          </a>
        </div>
        <div className="col-lg-3 centralizar display-4 text-white p-3">
          <a href="paginas/nacionais.html">
            <div className="carousel-inner">
              <div className="carousel-item active">
                <img
                  className="imagem-lado"
                  src={RioJaneiro}
                  alt="Rio de Janeiro"
                />
                <div className="carousel-caption ">
                  <h2>Nacionais</h2>
                </div>
              </div>
            </div>
          </a>
        </div>
        <div className="col-lg-3 centralizar display-4 text-white p-3">
          <a href="paginas/cruzeiro.html">
            <div className="carousel-inner">
              <div className="carousel-item active">
                <img className="imagem-lado" src={Cruzeiro} alt="Cruzeiro" />
                <div className="carousel-caption ">
                  <h2>Cruzeiros</h2>
                </div>
              </div>
            </div>
          </a>
        </div>
        <div className="col-lg-3 centralizar display-4 text-white p-3">
          <a href="paginas/promocao.html">
            <div className="carousel-inner">
              <div className="carousel-item active">
                <img className="imagem-lado" src={Recife} alt="Recife" />
                <div className="carousel-caption ">
                  <h2>Promoções</h2>
                </div>
              </div>
            </div>
          </a>
        </div>
      </div>
    </section>
  );
}
