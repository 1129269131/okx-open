package org.dromara.system.domain.bo;

import java.util.LinkedHashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import org.dromara.system.domain.SysUser;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-02-27T17:43:53+0800",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 21.0.4 (Eclipse Adoptium)"
)
@Component
public class SysUserBoToSysUserMapperImpl implements SysUserBoToSysUserMapper {

    @Override
    public SysUser convert(SysUserBo arg0) {
        if ( arg0 == null ) {
            return null;
        }

        SysUser sysUser = new SysUser();

        sysUser.setSearchValue( arg0.getSearchValue() );
        sysUser.setCreateDept( arg0.getCreateDept() );
        sysUser.setCreateBy( arg0.getCreateBy() );
        sysUser.setCreateTime( arg0.getCreateTime() );
        sysUser.setUpdateBy( arg0.getUpdateBy() );
        sysUser.setUpdateTime( arg0.getUpdateTime() );
        Map<String, Object> map = arg0.getParams();
        if ( map != null ) {
            sysUser.setParams( new LinkedHashMap<String, Object>( map ) );
        }
        sysUser.setUserId( arg0.getUserId() );
        sysUser.setDeptId( arg0.getDeptId() );
        sysUser.setUserName( arg0.getUserName() );
        sysUser.setNickName( arg0.getNickName() );
        sysUser.setUserType( arg0.getUserType() );
        sysUser.setEmail( arg0.getEmail() );
        sysUser.setPhonenumber( arg0.getPhonenumber() );
        sysUser.setSex( arg0.getSex() );
        sysUser.setPassword( arg0.getPassword() );
        sysUser.setStatus( arg0.getStatus() );
        sysUser.setRemark( arg0.getRemark() );

        return sysUser;
    }

    @Override
    public SysUser convert(SysUserBo source, SysUser target) {
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
        target.setUserId( source.getUserId() );
        target.setDeptId( source.getDeptId() );
        target.setUserName( source.getUserName() );
        target.setNickName( source.getNickName() );
        target.setUserType( source.getUserType() );
        target.setEmail( source.getEmail() );
        target.setPhonenumber( source.getPhonenumber() );
        target.setSex( source.getSex() );
        target.setPassword( source.getPassword() );
        target.setStatus( source.getStatus() );
        target.setRemark( source.getRemark() );

        return target;
    }
}
