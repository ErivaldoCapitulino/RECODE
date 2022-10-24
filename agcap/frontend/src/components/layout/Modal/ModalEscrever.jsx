const ModalEscrever = (props) => {
  return (
    <>
      <div
        className="modal fade"
        id="modal-escrever"
        tabindex="-1"
        role="dialog"
        aria-labelledby="modalLoginTitulo"
        aria-hidden="true"
      >
        <div className="modal-dialog" role="document">
          <div className="modal-content">
            <div className="modal-header">
              <h5 className="modal-title" id="modalLoginTitulo">
                Escolha o seu plano
              </h5>
            </div>
            <div className="modal-body escrever">
              <div>
                <a href="../paginas/inscricaoGold.html" target="_blank">
                  Planos Nacionais
                </a>
              </div>

              <div>
                <a
                  href="../paginas/inscricaoInternacionais.html"
                  target="_blank"
                >
                  Planos Internacionais
                </a>
              </div>
            </div>
          </div>
        </div>
      </div>
    </>
  );
};

export default ModalEscrever;
