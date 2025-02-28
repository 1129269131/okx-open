package org.dromara.common.log.event;

import java.util.Arrays;
import javax.annotation.processing.Generated;
import org.dromara.system.domain.bo.SysOperLogBo;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-02-27T17:43:52+0800",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 21.0.4 (Eclipse Adoptium)"
)
@Component
public class OperLogEventToSysOperLogBoMapperImpl implements OperLogEventToSysOperLogBoMapper {

    @Override
    public SysOperLogBo convert(OperLogEvent arg0) {
        if ( arg0 == null ) {
            return null;
        }

        SysOperLogBo sysOperLogBo = new SysOperLogBo();

        sysOperLogBo.setOperId( arg0.getOperId() );
        sysOperLogBo.setTenantId( arg0.getTenantId() );
        sysOperLogBo.setTitle( arg0.getTitle() );
        sysOperLogBo.setBusinessType( arg0.getBusinessType() );
        Integer[] businessTypes = arg0.getBusinessTypes();
        if ( businessTypes != null ) {
            sysOperLogBo.setBusinessTypes( Arrays.copyOf( businessTypes, businessTypes.length ) );
        }
        sysOperLogBo.setMethod( arg0.getMethod() );
        sysOperLogBo.setRequestMethod( arg0.getRequestMethod() );
        sysOperLogBo.setOperatorType( arg0.getOperatorType() );
        sysOperLogBo.setOperName( arg0.getOperName() );
        sysOperLogBo.setDeptName( arg0.getDeptName() );
        sysOperLogBo.setOperUrl( arg0.getOperUrl() );
        sysOperLogBo.setOperIp( arg0.getOperIp() );
        sysOperLogBo.setOperLocation( arg0.getOperLocation() );
        sysOperLogBo.setOperParam( arg0.getOperParam() );
        sysOperLogBo.setJsonResult( arg0.getJsonResult() );
        sysOperLogBo.setStatus( arg0.getStatus() );
        sysOperLogBo.setErrorMsg( arg0.getErrorMsg() );
        sysOperLogBo.setOperTime( arg0.getOperTime() );
        sysOperLogBo.setCostTime( arg0.getCostTime() );

        return sysOperLogBo;
    }

    @Override
    public SysOperLogBo convert(OperLogEvent source, SysOperLogBo target) {
        if ( source == null ) {
            return target;
        }

        target.setOperId( source.getOperId() );
        target.setTenantId( source.getTenantId() );
        target.setTitle( source.getTitle() );
        target.setBusinessType( source.getBusinessType() );
        Integer[] businessTypes = source.getBusinessTypes();
        if ( businessTypes != null ) {
            target.setBusinessTypes( Arrays.copyOf( businessTypes, businessTypes.length ) );
        }
        else {
            target.setBusinessTypes( null );
        }
        target.setMethod( source.getMethod() );
        target.setRequestMethod( source.getRequestMethod() );
        target.setOperatorType( source.getOperatorType() );
        target.setOperName( source.getOperName() );
        target.setDeptName( source.getDeptName() );
        target.setOperUrl( source.getOperUrl() );
        target.setOperIp( source.getOperIp() );
        target.setOperLocation( source.getOperLocation() );
        target.setOperParam( source.getOperParam() );
        target.setJsonResult( source.getJsonResult() );
        target.setStatus( source.getStatus() );
        target.setErrorMsg( source.getErrorMsg() );
        target.setOperTime( source.getOperTime() );
        target.setCostTime( source.getCostTime() );

        return target;
    }
}
