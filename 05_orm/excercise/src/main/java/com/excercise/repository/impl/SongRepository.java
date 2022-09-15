package com.excercise.repository.impl;

import com.excercise.model.Song;
import com.excercise.repository.ConnectionUtil;
import com.excercise.repository.ISongRepository;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public class SongRepository implements ISongRepository {


    @Override
    public List<Song> findAll() {
        Session session = null;
        List<Song> songList;

        try {
            session = ConnectionUtil.sessionFactory.openSession();
            songList = session.createQuery("From Song").getResultList();
        } finally {
            if (session != null) {
                session.close();
            }
        }
        return songList;
    }

    @Override
    public void save(Song song) {
        Session session = null;
        Transaction transaction = null;
        try {
            session = ConnectionUtil.sessionFactory.openSession();
            transaction = session.beginTransaction();

            session.save(song);
            transaction.commit();
        } finally {
            if (session != null) {
                session.close();
            }
        }

    }


    @Override
    public void update(Song song) {
        Session session = null;
        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();
            session.update(song);
            transaction.rollback();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
        } finally {
            if (session != null) {
                session.close();
            }
        }
    }


    @Override
    public Song findById(int id) {
        Session session = null;
        Song song;
        try {
            session = ConnectionUtil.sessionFactory.openSession();
            song = (Song) session.createQuery(" from Song s where s.id = :id").setParameter("id", id).getSingleResult();
        } finally {
            if (session != null) {
                session.close();
            }
        }
        return song;
    }

    @Override
    public void delete(int id) {
        Session session = null;
        Transaction transaction = null;

        try {
            session = ConnectionUtil.sessionFactory.openSession();
            transaction = session.beginTransaction();

            session.remove(findById(id));
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.commit();
            }
        } finally {
            if (session != null) {
                session.close();
            }
        }
    }
}
