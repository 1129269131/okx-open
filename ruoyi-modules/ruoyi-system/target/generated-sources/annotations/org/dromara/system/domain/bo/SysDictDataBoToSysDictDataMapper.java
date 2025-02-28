package org.dromara.system.domain.bo;

import io.github.linpeilie.AutoMapperConfig;
import io.github.linpeilie.BaseMapper;
import org.dromara.system.domain.SysDictData;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper(
    config = AutoMapperConfig.class,
    uses = {},
    imports = {}
)
public interface SysDictDataBoToSysDictDataMapper extends BaseMapper<SysDictDataBo, SysDictData> {
  SysDictData convert(SysDictDataBo source, @MappingTarget SysDictData target);
}
