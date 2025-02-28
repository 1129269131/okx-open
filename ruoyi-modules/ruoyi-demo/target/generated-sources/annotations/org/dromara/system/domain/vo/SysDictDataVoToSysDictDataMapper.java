package org.dromara.system.domain.vo;

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
public interface SysDictDataVoToSysDictDataMapper extends BaseMapper<SysDictDataVo, SysDictData> {
  SysDictData convert(SysDictDataVo source, @MappingTarget SysDictData target);
}
