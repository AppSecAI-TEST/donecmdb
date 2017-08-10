package org.onecmdb.facade;

import org.onecmdb.dto.ListFilter;
import org.onecmdb.dto.PageSearch;
import org.onecmdb.dto.RestResult;
import org.onecmdb.service.CURDService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.Page;

import java.util.List;

/**
 * Created by X on 2017/4/17.
 */
public abstract class RestServiceBase<T> implements CURDRestService<T> {

    private static final Logger LOGGER = LoggerFactory.getLogger(RestServiceBase.class);

    public abstract CURDService<T> getService();

    @Override
    public RestResult<List<T>> list(ListFilter listFilter) {
        List<T> list = this.getService().list(listFilter);
        LOGGER.debug("list:{}", list);
        return RestResult.OK(list);
    }

    @Override
    public RestResult<Page<T>> page(PageSearch pageSearch) {
        Page page = this.getService().page(pageSearch);
        LOGGER.debug("pageSearch:{} => {}", pageSearch, page);
        return RestResult.OK(page);
    }

    @Override
    public RestResult<T> create(T petRace) {
        LOGGER.debug("create or update :{}", petRace);
        return RestResult.OK(this.getService().createOrUpdte(petRace));
    }

    @Override
    public RestResult<String> delete(Long uuid) {
        LOGGER.debug("delete :{}", uuid);
        this.getService().delete(uuid);
        return RestResult.OK("删除成功!");
    }

    @Override
    public RestResult<T> detail(Long uuid) {
        return RestResult.OK(this.getService().detail(uuid));
    }
}
