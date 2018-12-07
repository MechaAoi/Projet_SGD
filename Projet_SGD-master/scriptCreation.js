db.jeux.drop()
db.utilisateurs.drop()

db.jeux.insertMany(
  [
    {
      "id" : 1,
      "titre" : "Super Mario Bros.",
      "date_parution" : "13/09/1985",
      "date_ajout" : "4/12/2018",
      "editeur" : "Nintendo",
      "genre" : "Plateforme",
      "plateforme" : [
        "NES", "Wii", "Wii u", "Switch"
      ],
      "prix" : 20,
      "note" : 4.5,
      "nbNote" : 1,
      "disponibilite" : "Disponible",
      "serie" : "Super Mario Bros",
      "description" : "Le tout premier jeu de la célebre série de Nintendo. Evitez les ennemis et déjouez les plans du maléfique Bowser !"
    },
    {
      "id" : 2,
      "titre" : "Megaman 11",
      "date_parution" : "2/10/2018",
      "date_ajout" : "4/12/2018",
      "editeur" : "Capcom",
      "genre" : "Plateforme",
      "plateforme" : [
        "Switch"
      ],
      "prix" : 30,
      "note" : 5,
      "nbNote" : 1,
      "disponibilite" : "Disponible",
      "serie" : "Megaman",
      "description" : "Découvrez le tout dernier jeu de la série des Megaman dans un tout nouveau style graphique. Le Bombardier Bleu possède de nouveaux pouvoir augmentant sa force et sa rapidité. Grâce à son choix de difficulté, c'est le titre idéal pour ceux qui ne se sont jamais essayés à la série."
    },
    {
      "id" : 3,
      "titre" : "Dofus",
      "date_parution" : "1/09/2004",
      "date_ajout" : "4/12/2018",
      "editeur" : "Ankama",
      "genre" : "MMORPG",
      "plateforme" : [
        "PC", "Smartphone", "Tablette"
      ],
      "prix" : 0,
      "note" : 5,
      "nbNote" : 1,
      "disponibilite" : "Disponible",
      "serie" : "Dofus",
      "description" : "Dans le Monde des Douze, les six Dofus primordiaux, des œufs de dragons conférant une grande puissance à leur porteur, ont été volés. Vous êtes un valeureux aventurier, prêt à explorer le vaste monde à la recherche des œufs égarés. Combattre des monstres, triompher des donjons, amasser des richesses et augmenter votre puissance, voilà quels défis vous attendent dans Dofus."
    },
    {
      "id" : 4,
      "titre" : "Super Smash Bros. Ultimate",
      "date_parution" : "07/12/2018",
      "date_ajout" : "4/12/2018",
      "editeur" : "Nintendo",
      "genre" : "Combat",
      "plateforme" : [
        "Switch"
      ],
      "prix" : 60,
      "note" : 5,
      "nbNote" : 1,
      "disponibilite" : "Bientôt disponible",
      "serie" : "Super Smash Bros.",
      "description" : "Super Smash Bros. Ultimate est un jeu de combat et de plateformes rassamblant la plupart des personnage de l'univers de Nintendo avec un système de combat unique ! Cet opus regroupe tous les personnages déjà apparus une fois dans un des précédents jeux de la série, ainsi que quelques nouveaux, comme l'Inkling de Splatoon et Ridley, l'ennemi juré de Samus dans la série Métroid."
    },
    {
      "id" : 5,
      "titre" : "Splatoon 2",
      "date_parution" : "21/07/2017",
      "date_ajout" : "4/12/2018",
      "editeur" : "Nintendo",
      "genre" : "Tir à la troisième personne",
      "plateforme" : [
        "Switch"
      ],
      "prix" : 50,
      "note" : 5,
      "nbNote" : 1,
      "disponibilite" : "Disponible",
      "serie" : "Splatoon",
      "description" : "Dans ce jeu, vous incarnez un Inkling (un calamar ayant une forme humanoïde) combattant avec des armes utilisant de l'encre colorée. Vous pouvez participer à des guerres de territoire, des combats de trois minutes à quatre contre quatre où l'objectif est d'avoir plus recouvert la carte de l'encre de son équipe que l'équipe adverse avant la fin du temps imparti."
    }
  ]
)

db.utilisateurs.insertMany(
  [
    {
      "pseudo" : "Valentin Nicolas",
      "mdp" : "Valentin Nicolas",
      "admin" : 1
    },
    {
      "pseudo" : "Mélanie Gago",
      "mdp" : "Mélanie Gago",
      "admin" : 1
    },
    {
      "pseudo" : "Camille Boulere",
      "mdp" : "Camille Boulere",
      "avis" : [
        {
          "note" : 4.5,
          "jeu" : 1,
          "commentaire" : "Très bon classique de la NES"
        },
        {
          "note" : 5,
          "jeu" : 2,
          "commentaire" : "Un jeu accessible à tous, avec des graphismes magnifiques et un gameplay excelent"
        },
        {
          "note" : 5,
          "jeu" : 3,
          "commentaire" : "Un MMORPG stratégique au tour par tour, riche en contenu, avec un personalisation de personnage, le tout dans un univers riche en personnages et histoires inéressants, que demander de plus ?"
        },
        {
          "note" : 5,
          "jeu" : 4,
          "commentaire" : " Without a doubt the best game ever made !"
        },
        {
          "note" : 5,
          "jeu" : 5,
          "commentaire" : "Un jeu en ligne très adictif très beau, avec des mécaniques de gameplay très intéressantes et beaucoup de possibiltés de customisation de notre personnage"
        }
      ]
    },
    {
      "pseudo" : "Corentin Euvrard",
      "mdp" : "Corentin Euvrard"
    }
  ]
)
