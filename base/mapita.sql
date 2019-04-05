DROP TABLE IF EXISTS usuario;

DROP TABLE IF EXISTS marcador;

DROP TABLE IF EXISTS tema;

DROP TABLE IF EXISTS comentario;

CREATE TABLE usuario (
  idusuario serial NOT NULL,
  nombre text NOT NULL,
  correo  text NOT NULL,
  contrasenia text NOT NULL,
  fechanacimiento date,
  rol text NOT NULL,
  PRIMARY KEY (idusuario)
);

CREATE TABLE tema(
	idtema serial NOT NULL,
	idusuario integer NOT NULL REFERENCES usuario(idusuario),
	nombre text NOT NULL,
	color text NOT NULL,
	PRIMARY KEY (idtema,idusuario)
);

CREATE TABLE marcador (
  idmarcador serial NOT NULL,
  idtema integer NOT NULL,
  idusuario integer NOT NULL,
  descripcion text NOT NULL,
  longitud double precision NOT NULL,
  latitud double precision NOT NULL,
  PRIMARY KEY (idmarcador,idtema,idusuario),
  FOREIGN KEY (idtema,idusuario) REFERENCES tema(idtema,idusuario) ON DELETE CASCADE
);

CREATE TABLE comentario(
	idcomentario serial NOT NULL,
	idmarcador integer NOT NULL,
	idusuario integer NOT NULL REFERENCES usuario(idusuario) ON DELETE CASCADE,
	comentario text NOT NULL,
	FOREIGN KEY (idmarcador,idusuario) REFERENCES marcador(idmarcador) ON DELETE CASCADE,
	PRIMARY KEY (idcomentario,idmarcador,idusuario)
);
