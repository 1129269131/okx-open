package org.dromara.system.domain;

import javax.annotation.processing.Generated;
import org.dromara.system.domain.vo.SysRoleVo;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-02-27T17:29:01+0800",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 21.0.4 (Eclipse Adoptium)"
)
@Component
public class SysRoleToSysRoleVoMapperImpl implements SysRoleToSysRoleVoMapper {

    @Override
    public SysRoleVo convert(SysRole arg0) {
        if ( arg0 == null ) {
            return null;
        }

        SysRoleVo sysRoleVo = new SysRoleVo();

        sysRoleVo.setRoleId( arg0.getRoleId() );
        sysRoleVo.setRoleName( arg0.getRoleName() );
        sysRoleVo.setRoleKey( arg0.getRoleKey() );
        sysRoleVo.setRoleSort( arg0.getRoleSort() );
        sysRoleVo.setDataScope( arg0.getDataScope() );
        sysRoleVo.setMenuCheckStrictly( arg0.getMenuCheckStrictly() );
        sysRoleVo.setDeptCheckStrictly( arg0.getDeptCheckStrictly() );
        sysRoleVo.setStatus( arg0.getStatus() );
        sysRoleVo.setRemark( arg0.getRemark() );
        sysRoleVo.setCreateTime( arg0.getCreateTime() );

        return sysRoleVo;
    }

    @Override
    public SysRoleVo convert(SysRole source, SysRoleVo target) {
        if ( source == null ) {
            return target;
        }

        target.setRoleId( source.getRoleId() );
        target.setRoleName( source.getRoleName() );
        target.setRoleKey( source.getRoleKey() );
        target.setRoleSort( source.getRoleSort() );
        target.setDataScope( source.getDataScope() );
        target.setMenuCheckStrictly( source.getMenuCheckStrictly() );
        target.setDeptCheckStrictly( source.getDeptCheckStrictly() );
        target.setStatus( source.getStatus() );
        target.setRemark( source.getRemark() );
        target.setCreateTime( source.getCreateTime() );

        return target;
    }
}
