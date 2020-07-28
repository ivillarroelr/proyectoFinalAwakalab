INSERT INTO authority(id, authority) VALUES(1, 'ADMINISTRADOR');
INSERT INTO authority(id, authority) VALUES(2, 'PROFESIONAL');
INSERT INTO authority(id, authority) VALUES(3, 'CLIENTE');

INSERT INTO users(username, password, enabled)
VALUES('ivillarroelr', '$2a$04$wMZKNRu.HWMsvYJ.vHU9deZMJHNOMEyCh7ddhvtYBLxvE2M838rgC', true);

INSERT INTO users(username, password, enabled)
VALUES('juanignacio', '$2a$04$wMZKNRu.HWMsvYJ.vHU9deZMJHNOMEyCh7ddhvtYBLxvE2M838rgC', true);

INSERT INTO users(username, password, enabled)
VALUES('kramosl', '$2a$04$wMZKNRu.HWMsvYJ.vHU9deZMJHNOMEyCh7ddhvtYBLxvE2M838rgC', true);

INSERT INTO users(username, password, enabled)
VALUES('cristiane', '$2a$04$wMZKNRu.HWMsvYJ.vHU9deZMJHNOMEyCh7ddhvtYBLxvE2M838rgC', true);

 INSERT INTO authorities_users(username, id_authority)
 VALUES('ivillarroelr',1);
INSERT INTO authorities_users(username, id_authority)
 VALUES('juanignacio',1);
  INSERT INTO authorities_users(username, id_authority)
 VALUES('kramosl',1);
INSERT INTO authorities_users(username, id_authority)
 VALUES('cristiane',1);

 INSERT INTO users
 VALUES('usuario','apellido', 'true', 'kathy', 'elefante', '18378858-2', 'admin');

INSERT INTO users
 VALUES('profesional','apellido2', 'true', 'manu', 'ironman', '18504304-8', 'admin');

 INSERT INTO cliente
 VALUES('usuario');

 INSERT INTO profesional
 VALUES('profesional');

 INSERT INTO visita
 VALUES(1,'visita1', '2016-06-22 19:10:25-07', '2016-06-22 19:10:25-07', 'usuario', 'profesional');