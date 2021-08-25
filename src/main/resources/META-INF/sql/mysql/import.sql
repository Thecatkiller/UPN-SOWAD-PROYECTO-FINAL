INSERT INTO document_type(name) VALUES ('DNI');
INSERT INTO document_type(name) VALUES ('PASAPORTE');
INSERT INTO document_type(name) VALUES ('CARNET EXTRANJERIA');

INSERT INTO users(password,username)VALUES ('123456', 'diego');
INSERT INTO users(password,username)VALUES ('123456', 'quezada');

INSERT INTO persons(document_number,lastname,mothers_last_name,name,document_type_id,user_id) VALUES ('74715976', 'Calderon', 'Alvarado', 'Diego Sebastian', 1, 1);
INSERT INTO persons(document_number,lastname,mothers_last_name,name,document_type_id,user_id) VALUES ('74921506', 'Quezada', 'Perez', 'Johnny Danny', 1, 2);
INSERT INTO persons(document_number,lastname,mothers_last_name,name,document_type_id,user_id) VALUES ('74921501', 'Haro', 'Antezana', 'Hanz', 1, null);
INSERT INTO persons(document_number,lastname,mothers_last_name,name,document_type_id,user_id) VALUES ('74921502', 'Chilque', 'Antezana', 'Bryan', 1, null);


INSERT INTO teachers(email,phone_number,salary,teacher_id) VALUES ('dsebas0@hotmail.com', '946368628', 6000, 1);
INSERT INTO students VALUES (2);
INSERT INTO guardians(address,email,phone_number,guardian_id) VALUES ('Jr. nunca jamas 123', 'correo@correo.com', '999666999', 3);
INSERT INTO guardians(address,email,phone_number,guardian_id) VALUES ('Jr. nunca jamas 123', 'correo@correo.com', '999666998', 4);