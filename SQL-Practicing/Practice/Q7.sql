SELECT 
    annee_publication, 
    COUNT(*) AS Nombre_Livres FROM 
    livres 
GROUP BY 
    annee_publication;