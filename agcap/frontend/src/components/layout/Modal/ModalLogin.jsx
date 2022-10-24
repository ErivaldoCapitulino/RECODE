const ModalLogin = (props) => {
  return (
    <>
      <div
        className="modal fade"
        id="modal-login"
        tabindex="-1"
        aria-labelledby="titulo"
        aria-hidden="true"
      >
        <div className="modal-dialog">
          <div className="modal-content">
            <div className="modal-header">
              <h5 className="modal-title" id="titulo">
                Entre na Sua Conta
              </h5>
            </div>

            <div className="modal-body">
              <form>
                <div className="mb-3">
                  <label for="loginEmail" className="form-label">
                    Email
                  </label>
                  <input
                    type="email"
                    className="form-control"
                    id="loginEmail"
                  />
                </div>
                <div className="mb-3">
                  <label for="loginSenha" className="form-label">
                    Senha
                  </label>
                  <input
                    type="password"
                    className="form-control"
                    id="loginSenha"
                  />
                </div>
                <button type="submit" className="btn btn-primary">
                  Entrar na Conta
                </button>
              </form>
              <div id="emailHelp" className="form-text">
                Esqueceu a senha <a href=" #">clique aqui</a>
              </div>
            </div>
          </div>
        </div>
      </div>
    </>
  );
};

export default ModalLogin;
