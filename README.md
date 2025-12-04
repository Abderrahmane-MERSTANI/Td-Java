TD 2 – Bases de l’héritage

Objectifs principaux :

Comprendre comment créer des super-classes et des sous-classes.

Utiliser super, les constructeurs et la redéfinition de méthodes (override).

Appréhender les modificateurs d’accès (private, protected, public) dans le contexte de l’héritage.

Contenu étudié :

Personne / Etudiant / Enseignant : création de classes hiérarchiques, polymorphisme via une liste de Personne, exploration de l’impact de protected vs private.

Hiérarchie de formes géométriques : classes Forme, Cercle, Rectangle, Carre, calcul d’aire et périmètre, utilisation de l’héritage pour factoriser le code.

Questions théoriques : surcharge vs redéfinition, mot-clé final, avantages/inconvénients de l’héritage.

TD 3 – Polymorphisme avancé et classes abstraites

Objectifs principaux :

Manipuler des références de type super-classe.

Comprendre instanceof, upcasting et downcasting.

Concevoir des classes abstraites et utiliser le polymorphisme efficacement.

Contenu étudié :

Appareils : classe abstraite Appareil, sous-classes Imprimante et Scanner, appel de méthodes polymorphes via une liste de Appareil.

Compte bancaire : classes abstraites Compte, sous-classes CompteCourant et CompteEpargne, polymorphisme dans les opérations deposer et retirer.

Refactoring sans instanceof : éviter les conditions avec instanceof et utiliser le polymorphisme pour un code plus propre et extensible.

TD 4 – Interfaces

Objectifs principaux :

Définir et implémenter des interfaces.

Programmer “contre une interface” pour favoriser la flexibilité et le polymorphisme.

Appliquer le patron de conception Strategy (concept introduit).

Contenu étudié :

Interface Affichable : implémentée par plusieurs types (Personne, Produit, Cours).

Polymorphisme via interfaces : création d’une liste d’objets Affichable et appel de afficher() sur des objets de types différents sans connaître leur type exact.

En résumé, ces TD progressent du simple héritage vers le polymorphisme avancé et les interfaces, en mettant l’accent sur :

la réutilisation du code,

la factorisation grâce à l’héritage,

et la programmation flexible et propre grâce aux classes abstraites et interfaces.
