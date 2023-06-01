package sn.dev.entities;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "classe_tb")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Classe implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "nom", length = 100, unique = true, nullable = false)
    private String libelle;
    @Column(name = "nbEtudiants", columnDefinition = "integer default 0")
    private int effectif;
    @OneToMany(mappedBy = "classe")
    private List<Etudiant> etudiants;
}
