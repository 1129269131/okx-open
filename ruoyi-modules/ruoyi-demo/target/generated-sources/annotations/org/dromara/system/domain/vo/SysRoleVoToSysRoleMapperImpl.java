package org.dromara.system.domain.vo;

import javax.annotation.processing.Generated;
import org.dromara.system.domain.SysRole;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-02-27T17:29:00+0800",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 21.0.4 (Eclipse Adoptium)"
)
@Component
public class SysRoleVoToSysRoleMapperImpl implements SysRoleVoToSysRoleMapper {

    @Override
    public SysRole convert(SysRoleVo arg0) {
        if ( arg0 == null ) {
            return null;
        }

        SysRole sysRole = new SysRole();

        sysRole.setCreateTime( arg0.getCreateTime() );
        sysRole.setRoleId( arg0.getRoleId() );
        sysRole.setRoleName( arg0.getRoleName() );
        sysRole.setRoleKey( arg0.getRoleKey() );
        sysRole.setRoleSort( arg0.getRoleSort() );
        sysRole.setDataScope( arg0.getDataScope() );
        sysRole.setMenuCheckStrictly( arg0.getMenuCheckStrictly() );
        sysRole.setDeptCheckStrictly( arg0.getDeptCheckStrictly() );
        sysRole.setStatus( arg0.getStatus() );
        sysRole.setRemark( arg0.getRemark() );

        return sysRole;
    }

    @Override
    public SysRole convert(SysRoleVo source, SysRole target) {
        if ( source == null ) {
            return target;
        }

        target.setCreateTime( source.getCreateTime() );
        target.setRoleId( source.getRoleId() );
        target.setRoleName( source.getRoleName() );
        target.setRoleKey( source.getRoleKey() );
        target.setRoleSort( source.getRoleSort() );
        target.setDataScope( source.getDataScope() );
        target.setMenuCheckStrictly( source.getMenuCheckStrictly() );
        target.setDeptCheckStrictly( source.getDeptCheckStrictly() );
        target.setStatus( source.getStatus() );
        target.setRemark( source.getRemark() );

        return target;
    }
}
