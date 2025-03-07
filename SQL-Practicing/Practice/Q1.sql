SELECT titre, nom, nationalite
FROM auteurs AS A, livres AS L
WHERE A.id_auteur = L.id_auteur ;
