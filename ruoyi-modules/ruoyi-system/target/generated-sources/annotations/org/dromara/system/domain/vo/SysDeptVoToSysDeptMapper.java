package org.dromara.system.domain.vo;

import io.github.linpeilie.AutoMapperConfig;
import io.github.linpeilie.BaseMapper;
import org.dromara.system.domain.SysDept;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper(
    config = AutoMapperConfig.class,
    uses = {},
    imports = {}
)
public interface SysDeptVoToSysDeptMapper extends BaseMapper<SysDeptVo, SysDept> {
  SysDept convert(SysDeptVo source, @MappingTarget SysDept target);
}
