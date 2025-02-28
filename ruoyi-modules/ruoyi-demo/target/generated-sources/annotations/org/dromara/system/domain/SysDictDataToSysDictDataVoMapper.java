package org.dromara.system.domain;

import io.github.linpeilie.AutoMapperConfig;
import io.github.linpeilie.BaseMapper;
import org.dromara.system.domain.vo.SysDictDataVo;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper(
    config = AutoMapperConfig.class,
    uses = {},
    imports = {}
)
public interface SysDictDataToSysDictDataVoMapper extends BaseMapper<SysDictData, SysDictDataVo> {
  SysDictDataVo convert(SysDictData source, @MappingTarget SysDictDataVo target);
}
