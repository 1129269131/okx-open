package org.dromara.system.domain.vo;

import io.github.linpeilie.AutoMapperConfig;
import io.github.linpeilie.BaseMapper;
import org.dromara.system.domain.SysDictType;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper(
    config = AutoMapperConfig.class,
    uses = {},
    imports = {}
)
public interface SysDictTypeVoToSysDictTypeMapper extends BaseMapper<SysDictTypeVo, SysDictType> {
  SysDictType convert(SysDictTypeVo source, @MappingTarget SysDictType target);
}
