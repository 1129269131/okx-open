package org.dromara.system.domain.bo;

import java.util.LinkedHashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import org.dromara.system.domain.SysRole;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-02-27T17:43:52+0800",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 21.0.4 (Eclipse Adoptium)"
)
@Component
public class SysRoleBoToSysRoleMapperImpl implements SysRoleBoToSysRoleMapper {

    @Override
    public SysRole convert(SysRoleBo arg0) {
        if ( arg0 == null ) {
            return null;
        }

        SysRole sysRole = new SysRole();

        sysRole.setSearchValue( arg0.getSearchValue() );
        sysRole.setCreateDept( arg0.getCreateDept() );
        sysRole.setCreateBy( arg0.getCreateBy() );
        sysRole.setCreateTime( arg0.getCreateTime() );
        sysRole.setUpdateBy( arg0.getUpdateBy() );
        sysRole.setUpdateTime( arg0.getUpdateTime() );
        Map<String, Object> map = arg0.getParams();
        if ( map != null ) {
            sysRole.setParams( new LinkedHashMap<String, Object>( map ) );
        }
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
    public SysRole convert(SysRoleBo source, SysRole target) {
        if ( source == null ) {
            return target;
        }

        target.setSearchValue( source.getSearchValue() );
        target.setCreateDept( source.getCreateDept() );
        target.setCreateBy( source.getCreateBy() );
        target.setCreateTime( source.getCreateTime() );
        target.setUpdateBy( source.getUpdateBy() );
        target.setUpdateTime( source.getUpdateTime() );
        if ( target.getParams() != null ) {
            Map<String, Object> map = source.getParams();
            if ( map != null ) {
                target.getParams().clear();
                target.getParams().putAll( map );
            }
            else {
                target.setParams( null );
            }
        }
        else {
            Map<String, Object> map = source.getParams();
            if ( map != null ) {
                target.setParams( new LinkedHashMap<String, Object>( map ) );
            }
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

        return target;
    }
}
