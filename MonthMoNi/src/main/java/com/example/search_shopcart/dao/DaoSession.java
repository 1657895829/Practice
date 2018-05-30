package com.example.search_shopcart.dao;

import java.util.Map;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.AbstractDaoSession;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.identityscope.IdentityScopeType;
import org.greenrobot.greendao.internal.DaoConfig;

import com.example.search_shopcart.bean.SearchDaoBean;

import com.example.search_shopcart.dao.SearchDaoBeanDao;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.

/**
 * {@inheritDoc}
 * 
 * @see org.greenrobot.greendao.AbstractDaoSession
 */
public class DaoSession extends AbstractDaoSession {

    private final DaoConfig searchDaoBeanDaoConfig;

    private final SearchDaoBeanDao searchDaoBeanDao;

    public DaoSession(Database db, IdentityScopeType type, Map<Class<? extends AbstractDao<?, ?>>, DaoConfig>
            daoConfigMap) {
        super(db);

        searchDaoBeanDaoConfig = daoConfigMap.get(SearchDaoBeanDao.class).clone();
        searchDaoBeanDaoConfig.initIdentityScope(type);

        searchDaoBeanDao = new SearchDaoBeanDao(searchDaoBeanDaoConfig, this);

        registerDao(SearchDaoBean.class, searchDaoBeanDao);
    }
    
    public void clear() {
        searchDaoBeanDaoConfig.clearIdentityScope();
    }

    public SearchDaoBeanDao getSearchDaoBeanDao() {
        return searchDaoBeanDao;
    }

}