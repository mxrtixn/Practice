 SELECT 
    AVG(DATEDIFF(date_retour, date_emprunt)) AS Duree_Moyenne_Emprunt 
 FROM emprunts;
