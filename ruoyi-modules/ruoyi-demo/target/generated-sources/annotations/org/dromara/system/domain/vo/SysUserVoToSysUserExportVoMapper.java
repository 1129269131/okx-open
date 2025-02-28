package org.dromara.system.domain.vo;

import io.github.linpeilie.AutoMapperConfig;
import io.github.linpeilie.BaseMapper;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

@Mapper(
    config = AutoMapperConfig.class,
    uses = {},
    imports = {}
)
public interface SysUserVoToSysUserExportVoMapper extends BaseMapper<SysUserVo, SysUserExportVo> {
  @Mapping(
      target = "deptName",
      ignore = false,
      source = "dept.deptName"
  )
  @Mapping(
      target = "leaderName",
      ignore = false,
      source = "dept.leaderName"
  )
  SysUserExportVo convert(SysUserVo source);

  @Mapping(
      target = "deptName",
      ignore = false,
      source = "dept.deptName"
  )
  @Mapping(
      target = "leaderName",
      ignore = false,
      source = "dept.leaderName"
  )
  SysUserExportVo convert(SysUserVo source, @MappingTarget SysUserExportVo target);
}
