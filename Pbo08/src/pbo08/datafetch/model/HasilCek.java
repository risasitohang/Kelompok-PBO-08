/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo08.datafetch.model;

import interfacee.hasilCekInterface;
import java.util.List;
import mapping.Hasil;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.HibernateUtil;

/**
 *
 * @author MZ17
 */
public class HasilCek implements hasilCekInterface{
     Session session;
    Transaction transaction;

    @Override
    public void Save(Hasil T) {
        session = HibernateUtil.getSessionFactory().openSession();
        transaction = session.beginTransaction();
        session.save(T);
        transaction.commit();
        session.close();
    }
}
