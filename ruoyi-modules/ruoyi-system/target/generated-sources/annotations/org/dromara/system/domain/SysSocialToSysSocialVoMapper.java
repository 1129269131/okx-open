package org.dromara.system.domain;

import io.github.linpeilie.AutoMapperConfig;
import io.github.linpeilie.BaseMapper;
import org.dromara.system.domain.vo.SysSocialVo;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper(
    config = AutoMapperConfig.class,
    uses = {},
    imports = {}
)
public interface SysSocialToSysSocialVoMapper extends BaseMapper<SysSocial, SysSocialVo> {
  SysSocialVo convert(SysSocial source, @MappingTarget SysSocialVo target);
}
