package org.dromara.system.domain;

import javax.annotation.processing.Generated;
import org.dromara.system.domain.vo.SysTenantPackageVo;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-02-27T17:29:01+0800",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 21.0.4 (Eclipse Adoptium)"
)
@Component
public class SysTenantPackageToSysTenantPackageVoMapperImpl implements SysTenantPackageToSysTenantPackageVoMapper {

    @Override
    public SysTenantPackageVo convert(SysTenantPackage arg0) {
        if ( arg0 == null ) {
            return null;
        }

        SysTenantPackageVo sysTenantPackageVo = new SysTenantPackageVo();

        sysTenantPackageVo.setPackageId( arg0.getPackageId() );
        sysTenantPackageVo.setPackageName( arg0.getPackageName() );
        sysTenantPackageVo.setMenuIds( arg0.getMenuIds() );
        sysTenantPackageVo.setRemark( arg0.getRemark() );
        sysTenantPackageVo.setMenuCheckStrictly( arg0.getMenuCheckStrictly() );
        sysTenantPackageVo.setStatus( arg0.getStatus() );

        return sysTenantPackageVo;
    }

    @Override
    public SysTenantPackageVo convert(SysTenantPackage source, SysTenantPackageVo target) {
        if ( source == null ) {
            return target;
        }

        target.setPackageId( source.getPackageId() );
        target.setPackageName( source.getPackageName() );
        target.setMenuIds( source.getMenuIds() );
        target.setRemark( source.getRemark() );
        target.setMenuCheckStrictly( source.getMenuCheckStrictly() );
        target.setStatus( source.getStatus() );

        return target;
    }
}
