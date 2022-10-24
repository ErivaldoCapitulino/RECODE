export default function CarouselItem(props) {
  return (
    <div className="carousel-item active">
      <img
        src={props.imagem}
        className="d-block w-100 imagem-centralizada"
        alt="Paris"
      />
      <div className="carousel-caption d-none d-md-block">
        <h3>{props.titulo}</h3>
      </div>
    </div>
  );
}
