SELECT 
    emprunteurs.nom AS Nom_Emprunteur, 
    livres.titre AS Titre_Livre, 
    auteurs.nom AS Nom_Auteur, 
    emprunts.id_emprunt
FROM 
    emprunts 
JOIN 
    emprunteurs ON emprunts.id_emprunteur = emprunteurs.id_emprunteur 
JOIN 
    livres ON emprunts.id_livre = livres.id_livre 
JOIN 
    auteurs ON livres.id_auteur = auteurs.id_auteur
;