package org.dromara.okx.domain.bo;

import io.github.linpeilie.AutoMapperConfig;
import io.github.linpeilie.BaseMapper;
import org.dromara.okx.domain.InstPushInfo;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper(
    config = AutoMapperConfig.class,
    uses = {},
    imports = {}
)
public interface InstPushInfoBoToInstPushInfoMapper extends BaseMapper<InstPushInfoBo, InstPushInfo> {
  InstPushInfo convert(InstPushInfoBo source, @MappingTarget InstPushInfo target);
}
