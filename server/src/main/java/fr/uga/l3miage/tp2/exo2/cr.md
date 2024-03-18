La stratégie SINGLE_TABLE peut donner lieu à de nombreuses colonnes qui sont généralement vides (elle crée des colonnes 
pour tous les attributs d'une table, même si certaines colonnes ne sont pas présentes pour certaines sous-classes).
Dans la stratégie JOINED, chaque classe d'entité est mappée dans sa propre table et les tables des sous-classes sont reliées aux tables de la classe de base par des clés étrangères. 
Cette stratégie permet de maintenir les tables normalisées et de réduire les colonnes vides, 
mais peut réduire les performances des requêtes en raison de la nécessité d'effectuer des opérations de JOIN.
