package com.alcateia.model.services;

import java.util.List;

import com.alcateia.model.dao.DaoFactory;
import com.alcateia.model.dao.SellerDao;
import com.alcateia.model.entities.Seller;

public class SellerService {

    private SellerDao dao = DaoFactory.createSellerDao();


    public List<Seller> findAll() {
        return dao.findAll();

    }

    public void saverOrUpdate(Seller obj) {
        if (obj.getId() == null) {
            dao.insert(obj);
        }
        else {
            dao.update(obj);
        }

    }

    public void remove(Seller obj) {
        dao.deleteId(obj.getId());
    }
}
