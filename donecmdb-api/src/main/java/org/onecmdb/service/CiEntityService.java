package org.onecmdb.service;

import org.onecmdb.dto.IPath;
import org.onecmdb.dto.ListFilter;
import org.onecmdb.entity.CiEntity;

import java.util.List;

/**
 * Created by tom on 2017/8/10.
 */
public interface CiEntityService  extends CURDService<CiEntity> {

    /**
     * 根据 路径获取
     * @param path
     * @return
     */
    CiEntity findCi(IPath<String> path);

    /**
     * 根据 别名 搜索配置信息
     * @param path
     * @return
     */
    CiEntity findCiByAlias(IPath<String> path);

    /**
     *
     * @param alias
     * @param listFilter
     * @return
     */
    List<CiEntity> getInstanceByAlias(String alias, ListFilter listFilter);
}
