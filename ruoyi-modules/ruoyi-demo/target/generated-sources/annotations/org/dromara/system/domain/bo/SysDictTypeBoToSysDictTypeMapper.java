package org.dromara.system.domain.bo;

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
public interface SysDictTypeBoToSysDictTypeMapper extends BaseMapper<SysDictTypeBo, SysDictType> {
  SysDictType convert(SysDictTypeBo source, @MappingTarget SysDictType target);
}
