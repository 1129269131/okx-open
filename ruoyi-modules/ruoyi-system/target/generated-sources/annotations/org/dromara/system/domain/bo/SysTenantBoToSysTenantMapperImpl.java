package org.dromara.system.domain.bo;

import java.util.LinkedHashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import org.dromara.system.domain.SysTenant;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-02-27T17:43:52+0800",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 21.0.4 (Eclipse Adoptium)"
)
@Component
public class SysTenantBoToSysTenantMapperImpl implements SysTenantBoToSysTenantMapper {

    @Override
    public SysTenant convert(SysTenantBo arg0) {
        if ( arg0 == null ) {
            return null;
        }

        SysTenant sysTenant = new SysTenant();

        sysTenant.setSearchValue( arg0.getSearchValue() );
        sysTenant.setCreateDept( arg0.getCreateDept() );
        sysTenant.setCreateBy( arg0.getCreateBy() );
        sysTenant.setCreateTime( arg0.getCreateTime() );
        sysTenant.setUpdateBy( arg0.getUpdateBy() );
        sysTenant.setUpdateTime( arg0.getUpdateTime() );
        Map<String, Object> map = arg0.getParams();
        if ( map != null ) {
            sysTenant.setParams( new LinkedHashMap<String, Object>( map ) );
        }
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
    public SysTenant convert(SysTenantBo source, SysTenant target) {
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
