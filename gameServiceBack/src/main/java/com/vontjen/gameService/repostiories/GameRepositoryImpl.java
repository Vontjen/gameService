package com.vontjen.gameService.repostiories;

import com.vontjen.gameService.model.Game;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

public class GameRepositoryImpl implements GameRepository {

    @PersistenceContext(unitName = "gameServicePU")
    private EntityManager em;

    public Game findById(String id) {
        return em.find(Game.class, id);
    }

    public Game create(Game g) {
        em.persist(g);
        return g;
    }

    public void remove(Long id) {
        em.remove(em.getReference(Game.class, id));
    }

    public Game findByTitle(String title) {
        return em.createQuery("select g from Game g where g.title = :title", Game.class).setParameter("title", title).getSingleResult();
    }

    public List<Game> findAll() {
        return em.createQuery("select g from Game g", Game.class).getResultList();
    }

    public Long countAll() {
        return em.createQuery("select count (g) from Game g", Long.class).getSingleResult();
    }
}
