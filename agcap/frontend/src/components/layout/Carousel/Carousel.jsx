import "./Carousel.css";
import Paris from "../../../assets/img/internacionais/paris.jpg";
import Noronha from "../../../assets/img/nacionais/fernando-de-noronha.jpg";
import Recife from "../../../assets/img/cidades/Recife.jpg";
import RioJaneiro from "../../../assets/img/cidades/Rio_de_Janeiro.jpg";
import React from "react";
import CarouselItem from "./CarouselItem";
import PainelDescricao from "./PainelDescricao";

export default function Carousel() {
  return (
    <section className="container-fluid">
      <div className="row mt-5">
        <div className="col-lg-7 p-0">
          <div
            id="carouselExampleFade"
            className="carousel slide carousel-fade"
            data-bs-ride="carousel"
          >
            <div className="carousel-inner">
              <CarouselItem titulo="Paris" imagem={Paris} />
              <CarouselItem titulo="Fernando de Noronha" imagem={Noronha} />
              <CarouselItem titulo="Recife" imagem={Recife} />
              <CarouselItem titulo="Rio de Janeiro" imagem={RioJaneiro} />
            </div>

            <button
              className="carousel-control-prev"
              type="button"
              data-bs-target="#carouselExampleFade"
              data-bs-slide="prev"
            >
              <span
                className="carousel-control-prev-icon"
                aria-hidden="true"
              ></span>
              <span className="visually-hidden">Previous</span>
            </button>
            <button
              className="carousel-control-next"
              type="button"
              data-bs-target="#carouselExampleFade"
              data-bs-slide="next"
            >
              <span
                className="carousel-control-next-icon"
                aria-hidden="true"
              ></span>
              <span className="visually-hidden">Next</span>
            </button>
          </div>
        </div>
        <PainelDescricao />
      </div>
    </section>
  );
}
