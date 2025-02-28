package org.dromara.system.domain.bo;

import java.util.LinkedHashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import org.dromara.system.domain.SysMenu;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-02-27T17:29:01+0800",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 21.0.4 (Eclipse Adoptium)"
)
@Component
public class SysMenuBoToSysMenuMapperImpl implements SysMenuBoToSysMenuMapper {

    @Override
    public SysMenu convert(SysMenuBo arg0) {
        if ( arg0 == null ) {
            return null;
        }

        SysMenu sysMenu = new SysMenu();

        sysMenu.setSearchValue( arg0.getSearchValue() );
        sysMenu.setCreateDept( arg0.getCreateDept() );
        sysMenu.setCreateBy( arg0.getCreateBy() );
        sysMenu.setCreateTime( arg0.getCreateTime() );
        sysMenu.setUpdateBy( arg0.getUpdateBy() );
        sysMenu.setUpdateTime( arg0.getUpdateTime() );
        Map<String, Object> map = arg0.getParams();
        if ( map != null ) {
            sysMenu.setParams( new LinkedHashMap<String, Object>( map ) );
        }
        sysMenu.setMenuId( arg0.getMenuId() );
        sysMenu.setParentId( arg0.getParentId() );
        sysMenu.setMenuName( arg0.getMenuName() );
        sysMenu.setOrderNum( arg0.getOrderNum() );
        sysMenu.setPath( arg0.getPath() );
        sysMenu.setComponent( arg0.getComponent() );
        sysMenu.setQueryParam( arg0.getQueryParam() );
        sysMenu.setIsFrame( arg0.getIsFrame() );
        sysMenu.setIsCache( arg0.getIsCache() );
        sysMenu.setMenuType( arg0.getMenuType() );
        sysMenu.setVisible( arg0.getVisible() );
        sysMenu.setStatus( arg0.getStatus() );
        sysMenu.setPerms( arg0.getPerms() );
        sysMenu.setIcon( arg0.getIcon() );
        sysMenu.setRemark( arg0.getRemark() );

        return sysMenu;
    }

    @Override
    public SysMenu convert(SysMenuBo source, SysMenu target) {
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
        target.setMenuId( source.getMenuId() );
        target.setParentId( source.getParentId() );
        target.setMenuName( source.getMenuName() );
        target.setOrderNum( source.getOrderNum() );
        target.setPath( source.getPath() );
        target.setComponent( source.getComponent() );
        target.setQueryParam( source.getQueryParam() );
        target.setIsFrame( source.getIsFrame() );
        target.setIsCache( source.getIsCache() );
        target.setMenuType( source.getMenuType() );
        target.setVisible( source.getVisible() );
        target.setStatus( source.getStatus() );
        target.setPerms( source.getPerms() );
        target.setIcon( source.getIcon() );
        target.setRemark( source.getRemark() );

        return target;
    }
}
