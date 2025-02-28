package org.dromara.system.domain.bo;

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
public interface SysSocialBoToSysSocialMapper extends BaseMapper<SysSocialBo, SysSocial> {
  SysSocial convert(SysSocialBo source, @MappingTarget SysSocial target);
}
