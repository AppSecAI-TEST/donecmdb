package org.onecmdb.service;

import lombok.Getter;
import org.onecmdb.entity.AttributeEntity;
import org.onecmdb.repository.AttributeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 属性信息
 *
 * Created by tom on 2017-03-07 13:25:01.
 */


@Service
@Getter
public class AttributeEntityServiceImpl extends CURDServiceBase<AttributeEntity> implements AttributeEntityService {

    @Autowired
    private AttributeDao dao;

}
