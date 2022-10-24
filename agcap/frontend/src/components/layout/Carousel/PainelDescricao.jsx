export default function PainelDescricao() {
  return (
    <>
      <div className="col-lg-5 p-5 text-center">
        <h1 className="display-5">
          Os melhores lugares do mundo ao seu alcanse
        </h1>
        <p className="lead">
          Agora você pode realizar aquela tão esperada viagem,{" "}
          <strong>agdcap-viagem</strong> tem pocotes e promoções que irão fazer
          você realizar o seu sonho.
        </p>

        <div className="input-group mb-3">
          <input
            type="text"
            className="form-control"
            placeholder="E-mail"
            aria-label="Recipient's username"
            aria-describedby="inscricao"
          />
          <button className="btn btn-primary" type="button" id="inscricao">
            Inscreva-se
          </button>
        </div>
      </div>
    </>
  );
}
