package org.dromara.system.domain;

import io.github.linpeilie.AutoMapperConfig;
import io.github.linpeilie.BaseMapper;
import org.dromara.system.domain.vo.SysDeptVo;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper(
    config = AutoMapperConfig.class,
    uses = {},
    imports = {}
)
public interface SysDeptToSysDeptVoMapper extends BaseMapper<SysDept, SysDeptVo> {
  SysDeptVo convert(SysDept source, @MappingTarget SysDeptVo target);
}
