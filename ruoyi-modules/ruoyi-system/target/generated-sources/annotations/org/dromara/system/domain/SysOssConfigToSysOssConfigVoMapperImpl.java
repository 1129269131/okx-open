package org.dromara.system.domain;

import javax.annotation.processing.Generated;
import org.dromara.system.domain.vo.SysOssConfigVo;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-02-27T17:43:53+0800",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 21.0.4 (Eclipse Adoptium)"
)
@Component
public class SysOssConfigToSysOssConfigVoMapperImpl implements SysOssConfigToSysOssConfigVoMapper {

    @Override
    public SysOssConfigVo convert(SysOssConfig arg0) {
        if ( arg0 == null ) {
            return null;
        }

        SysOssConfigVo sysOssConfigVo = new SysOssConfigVo();

        sysOssConfigVo.setOssConfigId( arg0.getOssConfigId() );
        sysOssConfigVo.setConfigKey( arg0.getConfigKey() );
        sysOssConfigVo.setAccessKey( arg0.getAccessKey() );
        sysOssConfigVo.setSecretKey( arg0.getSecretKey() );
        sysOssConfigVo.setBucketName( arg0.getBucketName() );
        sysOssConfigVo.setPrefix( arg0.getPrefix() );
        sysOssConfigVo.setEndpoint( arg0.getEndpoint() );
        sysOssConfigVo.setDomain( arg0.getDomain() );
        sysOssConfigVo.setIsHttps( arg0.getIsHttps() );
        sysOssConfigVo.setRegion( arg0.getRegion() );
        sysOssConfigVo.setStatus( arg0.getStatus() );
        sysOssConfigVo.setExt1( arg0.getExt1() );
        sysOssConfigVo.setRemark( arg0.getRemark() );
        sysOssConfigVo.setAccessPolicy( arg0.getAccessPolicy() );

        return sysOssConfigVo;
    }

    @Override
    public SysOssConfigVo convert(SysOssConfig source, SysOssConfigVo target) {
        if ( source == null ) {
            return target;
        }

        target.setOssConfigId( source.getOssConfigId() );
        target.setConfigKey( source.getConfigKey() );
        target.setAccessKey( source.getAccessKey() );
        target.setSecretKey( source.getSecretKey() );
        target.setBucketName( source.getBucketName() );
        target.setPrefix( source.getPrefix() );
        target.setEndpoint( source.getEndpoint() );
        target.setDomain( source.getDomain() );
        target.setIsHttps( source.getIsHttps() );
        target.setRegion( source.getRegion() );
        target.setStatus( source.getStatus() );
        target.setExt1( source.getExt1() );
        target.setRemark( source.getRemark() );
        target.setAccessPolicy( source.getAccessPolicy() );

        return target;
    }
}
