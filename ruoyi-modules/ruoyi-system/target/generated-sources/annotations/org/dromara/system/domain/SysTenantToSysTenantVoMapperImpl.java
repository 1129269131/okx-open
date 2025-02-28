package org.dromara.system.domain;

import javax.annotation.processing.Generated;
import org.dromara.system.domain.vo.SysTenantVo;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-02-27T17:43:53+0800",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 21.0.4 (Eclipse Adoptium)"
)
@Component
public class SysTenantToSysTenantVoMapperImpl implements SysTenantToSysTenantVoMapper {

    @Override
    public SysTenantVo convert(SysTenant arg0) {
        if ( arg0 == null ) {
            return null;
        }

        SysTenantVo sysTenantVo = new SysTenantVo();

        sysTenantVo.setId( arg0.getId() );
        sysTenantVo.setTenantId( arg0.getTenantId() );
        sysTenantVo.setContactUserName( arg0.getContactUserName() );
        sysTenantVo.setContactPhone( arg0.getContactPhone() );
        sysTenantVo.setCompanyName( arg0.getCompanyName() );
        sysTenantVo.setLicenseNumber( arg0.getLicenseNumber() );
        sysTenantVo.setAddress( arg0.getAddress() );
        sysTenantVo.setDomain( arg0.getDomain() );
        sysTenantVo.setIntro( arg0.getIntro() );
        sysTenantVo.setRemark( arg0.getRemark() );
        sysTenantVo.setPackageId( arg0.getPackageId() );
        sysTenantVo.setExpireTime( arg0.getExpireTime() );
        sysTenantVo.setAccountCount( arg0.getAccountCount() );
        sysTenantVo.setStatus( arg0.getStatus() );

        return sysTenantVo;
    }

    @Override
    public SysTenantVo convert(SysTenant source, SysTenantVo target) {
        if ( source == null ) {
            return target;
        }

        target.setId( source.getId() );
        target.setTenantId( source.getTenantId() );
        target.setContactUserName( source.getContactUserName() );
        target.setContactPhone( source.getContactPhone() );
        target.setCompanyName( source.getCompanyName() );
        target.setLicenseNumber( source.getLicenseNumber() );
        target.setAddress( source.getAddress() );
        target.setDomain( source.getDomain() );
        target.setIntro( source.getIntro() );
        target.setRemark( source.getRemark() );
        target.setPackageId( source.getPackageId() );
        target.setExpireTime( source.getExpireTime() );
        target.setAccountCount( source.getAccountCount() );
        target.setStatus( source.getStatus() );

        return target;
    }
}
