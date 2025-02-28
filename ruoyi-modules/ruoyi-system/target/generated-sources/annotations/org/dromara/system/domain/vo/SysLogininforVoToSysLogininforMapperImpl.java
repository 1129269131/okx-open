package org.dromara.system.domain.vo;

import javax.annotation.processing.Generated;
import org.dromara.system.domain.SysLogininfor;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-02-27T17:43:52+0800",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 21.0.4 (Eclipse Adoptium)"
)
@Component
public class SysLogininforVoToSysLogininforMapperImpl implements SysLogininforVoToSysLogininforMapper {

    @Override
    public SysLogininfor convert(SysLogininforVo arg0) {
        if ( arg0 == null ) {
            return null;
        }

        SysLogininfor sysLogininfor = new SysLogininfor();

        sysLogininfor.setInfoId( arg0.getInfoId() );
        sysLogininfor.setTenantId( arg0.getTenantId() );
        sysLogininfor.setUserName( arg0.getUserName() );
        sysLogininfor.setClientKey( arg0.getClientKey() );
        sysLogininfor.setDeviceType( arg0.getDeviceType() );
        sysLogininfor.setStatus( arg0.getStatus() );
        sysLogininfor.setIpaddr( arg0.getIpaddr() );
        sysLogininfor.setLoginLocation( arg0.getLoginLocation() );
        sysLogininfor.setBrowser( arg0.getBrowser() );
        sysLogininfor.setOs( arg0.getOs() );
        sysLogininfor.setMsg( arg0.getMsg() );
        sysLogininfor.setLoginTime( arg0.getLoginTime() );

        return sysLogininfor;
    }

    @Override
    public SysLogininfor convert(SysLogininforVo source, SysLogininfor target) {
        if ( source == null ) {
            return target;
        }

        target.setInfoId( source.getInfoId() );
        target.setTenantId( source.getTenantId() );
        target.setUserName( source.getUserName() );
        target.setClientKey( source.getClientKey() );
        target.setDeviceType( source.getDeviceType() );
        target.setStatus( source.getStatus() );
        target.setIpaddr( source.getIpaddr() );
        target.setLoginLocation( source.getLoginLocation() );
        target.setBrowser( source.getBrowser() );
        target.setOs( source.getOs() );
        target.setMsg( source.getMsg() );
        target.setLoginTime( source.getLoginTime() );

        return target;
    }
}
