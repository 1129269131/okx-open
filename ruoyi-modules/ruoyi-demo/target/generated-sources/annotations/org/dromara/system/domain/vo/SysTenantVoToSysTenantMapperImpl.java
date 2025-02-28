package org.dromara.system.domain.vo;

import javax.annotation.processing.Generated;
import org.dromara.system.domain.SysTenant;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-02-27T17:29:00+0800",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 21.0.4 (Eclipse Adoptium)"
)
@Component
public class SysTenantVoToSysTenantMapperImpl implements SysTenantVoToSysTenantMapper {

    @Override
    public SysTenant convert(SysTenantVo arg0) {
        if ( arg0 == null ) {
            return null;
        }

        SysTenant sysTenant = new SysTenant();

        sysTenant.setId( arg0.getId() );
        sysTenant.setTenantId( arg0.getTenantId() );
        sysTenant.setContactUserName( arg0.getContactUserName() );
        sysTenant.setContactPhone( arg0.getContactPhone() );
        sysTenant.setCompanyName( arg0.getCompanyName() );
        sysTenant.setLicenseNumber( arg0.getLicenseNumber() );
        sysTenant.setAddress( arg0.getAddress() );
        sysTenant.setDomain( arg0.getDomain() );
        sysTenant.setIntro( arg0.getIntro() );
        sysTenant.setRemark( arg0.getRemark() );
        sysTenant.setPackageId( arg0.getPackageId() );
        sysTenant.setExpireTime( arg0.getExpireTime() );
        sysTenant.setAccountCount( arg0.getAccountCount() );
        sysTenant.setStatus( arg0.getStatus() );

        return sysTenant;
    }

    @Override
    public SysTenant convert(SysTenantVo source, SysTenant target) {
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
