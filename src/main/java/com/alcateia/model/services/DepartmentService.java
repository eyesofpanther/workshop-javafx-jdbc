package com.alcateia.model.services;

import java.util.List;

import com.alcateia.model.dao.DaoFactory;
import com.alcateia.model.dao.DepartmentDao;
import com.alcateia.model.entities.Department;

public class DepartmentService {

    private DepartmentDao dao = DaoFactory.createDepartmentDao();


    public List<Department> findAll() {
        return dao.findAll();

    }

    public void saverOrUpdate(Department obj) {
        if (obj.getId() == null) {
            dao.insert(obj);
        }
        else {
            dao.update(obj);
        }

    }

    public void remove(Department obj) {
        dao.deleteId(obj.getId());
    }
}
