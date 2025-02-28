package org.dromara.system.domain.bo;

import io.github.linpeilie.AutoMapperConfig;
import io.github.linpeilie.BaseMapper;
import org.dromara.system.domain.SysUser;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper(
    config = AutoMapperConfig.class,
    uses = {},
    imports = {}
)
public interface SysUserBoToSysUserMapper extends BaseMapper<SysUserBo, SysUser> {
  SysUser convert(SysUserBo source, @MappingTarget SysUser target);
}
