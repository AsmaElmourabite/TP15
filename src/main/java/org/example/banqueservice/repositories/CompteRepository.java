package org.example.banqueservice.repositories;

import org.example.banqueservice.entites.Compte;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface CompteRepository extends JpaRepository<Compte, Long> {

    @Query("SELECT COALESCE(SUM(c.solde), 0) FROM Compte c")
    double sumSoldes();
}
