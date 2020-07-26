INSERT INTO authority(id, authority) VALUES(1, 'ADMINISTRADOR');
INSERT INTO authority(id, authority) VALUES(2, 'PROFESIONAL');
INSERT INTO authority(id, authority) VALUES(1, 'CLIENTE');

INSERT INTO users(username, password, enabled)
VALUES('ivillarroelr', '$2a$04$wMZKNRu.HWMsvYJ.vHU9deZMJHNOMEyCh7ddhvtYBLxvE2M838rgC', true);

INSERT INTO users(username, password, enabled)
VALUES('juanignacio', '$2a$04$wMZKNRu.HWMsvYJ.vHU9deZMJHNOMEyCh7ddhvtYBLxvE2M838rgC', true);

INSERT INTO users(username, password, enabled)
VALUES('kramosl', '$2a$04$wMZKNRu.HWMsvYJ.vHU9deZMJHNOMEyCh7ddhvtYBLxvE2M838rgC', true);

INSERT INTO users(username, password, enabled)
VALUES('cristiane', '$2a$04$wMZKNRu.HWMsvYJ.vHU9deZMJHNOMEyCh7ddhvtYBLxvE2M838rgC', true);

 INSERT INTO authorities_users(usuario_id, authority_id)
 VALUES(1,1);
INSERT INTO authorities_users(usuario_id, authority_id)
 VALUES(2,1);
  INSERT INTO authorities_users(usuario_id, authority_id)
 VALUES(3,1);
INSERT INTO authorities_users(usuario_id, authority_id)
 VALUES(4,1);