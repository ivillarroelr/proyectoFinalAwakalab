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
 VALUES('ivillarroelr',3);
INSERT INTO authorities_users(username, id_authority)
 VALUES('juanignacio',2);
  INSERT INTO authorities_users(username, id_authority)
 VALUES('kramosl',1);
INSERT INTO authorities_users(username, id_authority)
 VALUES('cristiane',1);

 INSERT INTO users
 VALUES('usuario','apellido', true, 'kathy', 'usuario', '18378858-2', 'admin');

INSERT INTO users
 VALUES('profesional','apellido2', true, 'manu', 'profesional', '18504304-8', 'admin');

 INSERT INTO cliente
 VALUES('usuario');

 INSERT INTO authorities_users(username, id_authority)
 VALUES('usuario',3);

 INSERT INTO profesional
 VALUES('profesional');

 INSERT INTO authorities_users(username, id_authority)
 VALUES('profesional',2);

 INSERT INTO visita
 VALUES(1,'visita1', '2016-06-22 19:10:25-07', 'usuario', 'profesional');

 INSERT INTO pago
 VALUES(1, 'pago 1', '2004-10-19 10:23:54', 12000, 'usuario');

 INSERT INTO accidente
 VALUES(1, 'accidente 1', '2004-10-19 10:23:54', 'usuario');

 INSERT INTO actividad
 VALUES(1, 'actividad 1', '2016-06-22 19:10:25', 'usuario', 'profesional');