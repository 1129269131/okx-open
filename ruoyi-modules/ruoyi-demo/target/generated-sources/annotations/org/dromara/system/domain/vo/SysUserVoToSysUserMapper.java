package org.dromara.system.domain.vo;

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
public interface SysUserVoToSysUserMapper extends BaseMapper<SysUserVo, SysUser> {
  SysUser convert(SysUserVo source, @MappingTarget SysUser target);
}
