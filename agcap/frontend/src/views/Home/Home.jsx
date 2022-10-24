import React from "react";
import Carousel from "../../components/layout/Carousel/Carousel";
import Footer from "../../components/layout/Footer/Footer";
import Header from "../../components/layout/Header/Header";
import ModalLogin from "../../components/layout/Modal/ModalLogin";
import Pacote from "../../components/layout/Pacote/Pacote";
import PosHeader from "../../components/layout/PosHeader/PosHeader";

const Home = (props) => (
  <main className="Home">
    <ModalLogin />
    <Header />
    <PosHeader titulo="Realize a viagem do seu sonho" />
    <Carousel />
    <Pacote />
    <Footer />
  </main>
);

export default Home;
