INSERT INTO banques (nom, adresse) VALUES ('Banque Nationale', '123 Rue Principale');
INSERT INTO banques (nom, adresse) VALUES ('Banque Provinciale', '456 Rue Secondaire');

INSERT INTO clients (nom, prenom, banque_id) VALUES ('Doe', 'John', 1);
INSERT INTO clients (nom, prenom, banque_id) VALUES ('Smith', 'Jane', 2);

INSERT INTO comptes_bancaires (numero_compte, solde, proprietaire_id) VALUES ('123456789', 1000, 1);
INSERT INTO comptes_bancaires (numero_compte, solde, proprietaire_id) VALUES ('987654321', 2000, 2);
