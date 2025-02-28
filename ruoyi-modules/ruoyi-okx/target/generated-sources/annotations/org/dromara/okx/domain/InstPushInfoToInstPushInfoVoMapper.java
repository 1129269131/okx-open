package org.dromara.okx.domain;

import io.github.linpeilie.AutoMapperConfig;
import io.github.linpeilie.BaseMapper;
import org.dromara.okx.domain.vo.InstPushInfoVo;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper(
    config = AutoMapperConfig.class,
    uses = {},
    imports = {}
)
public interface InstPushInfoToInstPushInfoVoMapper extends BaseMapper<InstPushInfo, InstPushInfoVo> {
  InstPushInfoVo convert(InstPushInfo source, @MappingTarget InstPushInfoVo target);
}
