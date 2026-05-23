package com.alcateia.model.dao;

import java.util.List;

import com.alcateia.model.entities.Department;
import com.alcateia.model.entities.Seller;

    public interface SellerDao {
    void insert (Seller obj);
    void update (Seller obj);
    void deleteId (Integer id);
    Seller findById(Integer id);
    List<Seller> findAll();
    List<Seller> findByDepartment(Department department);
}
