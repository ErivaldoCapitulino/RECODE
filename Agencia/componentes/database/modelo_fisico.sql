CREATE DATABASE agcap;
USE agcap;

CREATE TABLE pacote (
id INTEGER PRIMARY KEY auto_increment,
quantidadeDeDias INTEGER,
itinerario VARCHAR(150),
custo NUMERIC(50),
desconto NUMERIC(10)
);

CREATE TABLE reserva (
id INTEGER PRIMARY KEY auto_increment,
dataDaReserva DATETIME,
dataSaida DATETIME,
tipoPagamento VARCHAR(50),
numeroAcompanhante INTEGER,
valorTotal NUMERIC(50),
id_cliente INTEGER,
id_pacote INTEGER,
FOREIGN KEY(id_pacote) REFERENCES pacote (id)
);

CREATE TABLE endereco (
id INTEGER PRIMARY KEY auto_increment,
rua VARCHAR(150),
numero VARCHAR(15),
bairro VARCHAR(150),
cidade VARCHAR(150),
estado VARCHAR(50),
cep VARCHAR(10),
id_cliente INTEGER
);

CREATE TABLE cliente (
id INTEGER PRIMARY KEY auto_increment,
nome VARCHAR(150),
email VARCHAR(50)
);

CREATE TABLE telefone (
id INTEGER PRIMARY KEY auto_increment,
numero VARCHAR(15),
id_cliente INTEGER,
FOREIGN KEY(id_cliente) REFERENCES cliente (id)
);

CREATE TABLE destino (
id INTEGER PRIMARY KEY auto_increment,
lugares VARCHAR(150),
id_pacote INTEGER,
FOREIGN KEY(id_pacote) REFERENCES pacote (id)
);

ALTER TABLE reserva ADD FOREIGN KEY(id_cliente) REFERENCES cliente (id);
ALTER TABLE endereco ADD FOREIGN KEY(id_cliente) REFERENCES cliente (id);



SELECT * FROM cliente;
SELECT * FROM endereco;
SELECT * FROM pacote;
select * from pacote;