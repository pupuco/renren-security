package io.renren.modules.demo.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import io.renren.common.service.impl.CrudServiceImpl;
import io.renren.modules.demo.dao.LunwenDao;
import io.renren.modules.demo.dto.LunwenDTO;
import io.renren.modules.demo.entity.LunwenEntity;
import io.renren.modules.demo.service.LunwenService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * 
 *
 * @author Mark sunlightcs@gmail.com
 * @since 1.0.0 2022-12-11
 */
@Service
public class LunwenServiceImpl extends CrudServiceImpl<LunwenDao, LunwenEntity, LunwenDTO> implements LunwenService {

    @Override
    public QueryWrapper<LunwenEntity> getWrapper(Map<String, Object> params){
        String id = (String)params.get("id");

        QueryWrapper<LunwenEntity> wrapper = new QueryWrapper<>();
        wrapper.eq(StringUtils.isNotBlank(id), "id", id);

        return wrapper;
    }


}