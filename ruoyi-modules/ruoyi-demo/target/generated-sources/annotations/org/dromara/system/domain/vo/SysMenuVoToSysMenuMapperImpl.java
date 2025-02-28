package org.dromara.system.domain.vo;

import java.util.List;
import javax.annotation.processing.Generated;
import org.dromara.system.domain.SysMenu;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-02-27T17:29:00+0800",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 21.0.4 (Eclipse Adoptium)"
)
@Component
public class SysMenuVoToSysMenuMapperImpl implements SysMenuVoToSysMenuMapper {

    @Override
    public SysMenu convert(SysMenuVo arg0) {
        if ( arg0 == null ) {
            return null;
        }

        SysMenu sysMenu = new SysMenu();

        sysMenu.setCreateDept( arg0.getCreateDept() );
        sysMenu.setCreateTime( arg0.getCreateTime() );
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
        sysMenu.setChildren( convert( arg0.getChildren() ) );

        return sysMenu;
    }

    @Override
    public SysMenu convert(SysMenuVo source, SysMenu target) {
        if ( source == null ) {
            return target;
        }

        target.setCreateDept( source.getCreateDept() );
        target.setCreateTime( source.getCreateTime() );
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
        if ( target.getChildren() != null ) {
            List<SysMenu> list = convert( source.getChildren() );
            if ( list != null ) {
                target.getChildren().clear();
                target.getChildren().addAll( list );
            }
            else {
                target.setChildren( null );
            }
        }
        else {
            List<SysMenu> list = convert( source.getChildren() );
            if ( list != null ) {
                target.setChildren( list );
            }
        }

        return target;
    }
}
