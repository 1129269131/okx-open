package org.dromara.system.domain.bo;

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
public interface SysDeptBoToSysDeptMapper extends BaseMapper<SysDeptBo, SysDept> {
  SysDept convert(SysDeptBo source, @MappingTarget SysDept target);
}
