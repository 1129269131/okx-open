package org.dromara.system.domain;

import io.github.linpeilie.AutoMapperConfig;
import io.github.linpeilie.BaseMapper;
import org.dromara.system.domain.vo.SysRoleVo;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper(
    config = AutoMapperConfig.class,
    uses = {},
    imports = {}
)
public interface SysRoleToSysRoleVoMapper extends BaseMapper<SysRole, SysRoleVo> {
  SysRoleVo convert(SysRole source, @MappingTarget SysRoleVo target);
}
