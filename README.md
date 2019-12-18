# PFE2019#026 - Un langage sûr pour exprimer des contrats intelligents
_By Theo BONNET, Guillaume VINCENT_

## Description
Ce Github contient l'implémentation du language dédié "LegalSC" permettant, de manière simplifiée, de permettre la construction, et le déploiement d'un contrat intelligent (Smart Contract). Ce language permet la définition du contrat physique (sous format PDF) et d'y associer, à chaque clause textuelle, une expression d'execution définie. Les objectifs de ce language sont:
- D'être proche d'un language naturel.
- D'être facile d'utilisation.
- D'être assez générique pour construire tous types de contrat.
- D'être adaptable et extensible.

## Le language  LegalSC 
### 1 - Modèle

Un contrat se découpe en deux partie :
- Une **entête**.
- Des **sections** de clauses.

L'**entête** comporte toutes les informations "statiques" au début du contrat. Autrement di, c'est ici que l'on définie toutes nos variables qui doivent apparaitre dans le contrat. Certaines valeurs sont indispensables :
- La date de début du contrat.
- Au moins deux parties impliqués dans le contrat, un Client et un Prestataire.

On pourra y ajouter d'autres renseignement, pour l'execution ou non.

Les **sections** de clauses regroupe des clauses qui entrent dans un même contexte. L'idée est de pouvoir créer une communauté qui resence plusieurs sections de clause prédéfinies, qui suffirait d'importer pour les reutiliser.

Une **clause** est définie par un titre, un texte qui explicite la clause et, optionnellement, une execution.
### 2 - Installation
TODO
### 3 - Ecrire un premier contrat
TODO
### 4 - Déploiement de contrats
TODO
### 5 - Amélioration possible pour les utilisateurs 
TODO
