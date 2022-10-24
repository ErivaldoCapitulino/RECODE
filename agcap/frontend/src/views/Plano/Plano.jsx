export default function Plano() {
  return (
    <>
      <section className="container">
        <div className="text-center my-5">
          <span className="h6 d-block">SEU PLANO, SUA VIAGEM</span>
          <h1 className="display-4 text-primary">Escolha o Plano</h1>
        </div>
        <div className="row">
          <div className="col-md mb-5">
            <div className="bg-light rounded p-4 box-shadow">
              <h2>Planos Nacionais</h2>
              <ul className="list-unstyled">
                <li>→ 30 dias de viagem</li>
                <li>→ 3 destinos diferentes</li>
                <li>→ Tudo pago pela empresa</li>
                <li>→ Ingressos para festas</li>
              </ul>
              <form>
                <div className="form-group">
                  <select className="form-control bg-light" id="inputCidades">
                    <option>Selecione a cidade</option>
                    <option>Cabo Santo Agostinho</option>
                    <option>Curitiba</option>
                    <option>Rio de Janeiro</option>
                    <option>Fernando de Noronha</option>
                    <option>Fortaleza</option>
                    <option>João Pessoa</option>
                  </select>
                </div>
              </form>
              <div className="row align-items-center mt-4">
                <div className="col">
                  <a
                    href="../paginas/inscricaoGold.html"
                    className="btn btn-primary btn-lg btn-block"
                  >
                    Comprar Plano
                  </a>
                </div>
                <div className="col">
                  <span className="h4">R$5.000</span>
                </div>
              </div>
            </div>
          </div>
          <div className="col-md mb-5">
            <div className="bg-light rounded p-4 box-shadow">
              <h2>Planos Internacionais</h2>
              <ul className="lista-plano list-unstyled">
                <li>→ 60 dias de viagem</li>
                <li>→ 3 destinos diferentes</li>
                <li>→ Tudo pago pela empresa</li>
                <li>→ Ingressos para festas</li>
              </ul>
              <form>
                <div className="form-group">
                  <select className="form-control bg-light" id="inputCidades">
                    <option>Selecione o pais</option>
                    <option>Alemanhã</option>
                    <option>Holanda</option>
                    <option>Inglaterra</option>
                    <option>Estados Unidos</option>
                    <option>Portugal</option>
                    <option>Paris</option>
                  </select>
                </div>
              </form>
              <div className="row align-items-center mt-4">
                <div className="col">
                  <a
                    href="../paginas/inscricaoInternacionais.html"
                    className="btn btn-primary btn-lg btn-block"
                  >
                    Comprar Plano
                  </a>
                </div>
                <div className="col">
                  <span className="h4">R$9.000</span>
                </div>
              </div>
            </div>
          </div>
        </div>
      </section>
    </>
  );
}
