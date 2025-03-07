 SELECT EMP.id_emprunteur, EMP.nom, 
  AVG(DATEDIFF(EM.date_retour, EM.date_emprunt)) AS Duree_Moyenne_Emprunt 
  
 FROM emprunts AS EM, emprunteurs AS EMP 
 WHERE 
EM.id_emprunteur = EMP.id_emprunteur 
 GROUP BY 
EMP.id_emprunteur, 
EMP.nom;
