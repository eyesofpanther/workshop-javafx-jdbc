package com.alcateia.model.dao;

import com.alcateia.model.db.DB;
import com.alcateia.model.dao.impl.DepartmentDaoJDBC;
import com.alcateia.model.dao.impl.SellerDaoJDBC;

public class DaoFactory {

    public static SellerDao createSellerDao(){
        return new SellerDaoJDBC(DB.getConnection());
    }

    public static DepartmentDao createDepartmentDao() {
		return new DepartmentDaoJDBC(DB.getConnection());
	}

}
