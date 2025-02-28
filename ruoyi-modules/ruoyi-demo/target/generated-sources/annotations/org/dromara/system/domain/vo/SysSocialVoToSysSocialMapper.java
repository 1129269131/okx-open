package org.dromara.system.domain.vo;

import io.github.linpeilie.AutoMapperConfig;
import io.github.linpeilie.BaseMapper;
import org.dromara.system.domain.SysSocial;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper(
    config = AutoMapperConfig.class,
    uses = {},
    imports = {}
)
public interface SysSocialVoToSysSocialMapper extends BaseMapper<SysSocialVo, SysSocial> {
  SysSocial convert(SysSocialVo source, @MappingTarget SysSocial target);
}
