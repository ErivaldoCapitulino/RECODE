import "./Content.css";
import React from "react";
import { Routes, Route } from "react-router-dom";

import Home from "../../views/Home/Home";
import Cruzeiro from "../../views/Locais/Cruzeiro/Cruzeiro";
import Internacional from "../../views/Locais/Internacional/Internacional";
import Nacional from "../../views/Locais/Nacional/Nacional";
import Promocao from "../../views/Locais/Promocao/Promocao";
import Plano from "../../views/Plano/Plano";

const Content = (props) => (
  <main className="Content">
    <Routes>
      <Route path="/" element={<Home />} />
      <Route path="/home" element={<Home />} />
      <Route path="/internacional" element={<Internacional />} />
      <Route path="/nacional" element={<Nacional />} />
      <Route path="/cruzeiro" element={<Cruzeiro />} />
      <Route path="/promocao" element={<Promocao />} />
      <Route path="/plano" element={<Plano />} />
    </Routes>
  </main>
);

export default Content;
