DROP TABLE IF EXISTS comentario;

DROP TABLE IF EXISTS marcador;

DROP TABLE IF EXISTS tema;

DROP TABLE IF EXISTS usuario;

CREATE TABLE usuario (
  idusuario serial NOT NULL PRIMARY KEY,
  nombre text NOT NULL,
  correo  text NOT NULL,
  contrasenia text NOT NULL,
  rol text NOT NULL
);

CREATE TABLE tema(
	idtema serial NOT NULL,
	dueñotema integer NOT NULL REFERENCES usuario(idusuario),
	nombre text NOT NULL,
	color text NOT NULL,
	PRIMARY KEY (idtema,dueñotema)
);

CREATE TABLE marcador (
  idmarcador serial NOT NULL,
  idtema integer NOT NULL,
  dueñotema integer NOT NULL,
  descripcion text NOT NULL,
  longitud double precision NOT NULL,
  latitud double precision NOT NULL,
  FOREIGN KEY (idtema,dueñotema) REFERENCES tema(idtema,dueñotema) ON DELETE CASCADE,
  PRIMARY KEY (idmarcador,idtema,dueñotema)
  
);

CREATE TABLE comentario(
	idcomentario serial NOT NULL,
	idmarcador integer NOT NULL,
    idtema integer NOT NULL,
    dueñotema integer NOT NULL,
	comentarista integer NOT NULL REFERENCES usuario(idusuario) ON DELETE CASCADE,
	comentario text NOT NULL,
	FOREIGN KEY (idmarcador,idtema,dueñotema) REFERENCES marcador(idmarcador,idtema,dueñotema) ON DELETE CASCADE,
	PRIMARY KEY (idcomentario,comentarista,idmarcador)
);
