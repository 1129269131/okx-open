package org.dromara.okx.domain.vo;

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
public interface InstPushInfoVoToInstPushInfoMapper extends BaseMapper<InstPushInfoVo, InstPushInfo> {
  InstPushInfo convert(InstPushInfoVo source, @MappingTarget InstPushInfo target);
}
