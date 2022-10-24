import "./PosHeader.css";

const PosHeader = (props) => {
  return (
    <>
      <section class="container-fluid">
        <div class="row display-4 viagemSonhos text-white text-center py-3">
          <div class="col-12">
            <span>{props.titulo}</span>
          </div>
        </div>
      </section>
    </>
  );
};

export default PosHeader;
