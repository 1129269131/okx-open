package org.dromara.system.domain.vo;

import javax.annotation.processing.Generated;
import org.dromara.system.domain.SysOssConfig;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-02-27T17:29:00+0800",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 21.0.4 (Eclipse Adoptium)"
)
@Component
public class SysOssConfigVoToSysOssConfigMapperImpl implements SysOssConfigVoToSysOssConfigMapper {

    @Override
    public SysOssConfig convert(SysOssConfigVo arg0) {
        if ( arg0 == null ) {
            return null;
        }

        SysOssConfig sysOssConfig = new SysOssConfig();

        sysOssConfig.setOssConfigId( arg0.getOssConfigId() );
        sysOssConfig.setConfigKey( arg0.getConfigKey() );
        sysOssConfig.setAccessKey( arg0.getAccessKey() );
        sysOssConfig.setSecretKey( arg0.getSecretKey() );
        sysOssConfig.setBucketName( arg0.getBucketName() );
        sysOssConfig.setPrefix( arg0.getPrefix() );
        sysOssConfig.setEndpoint( arg0.getEndpoint() );
        sysOssConfig.setDomain( arg0.getDomain() );
        sysOssConfig.setIsHttps( arg0.getIsHttps() );
        sysOssConfig.setRegion( arg0.getRegion() );
        sysOssConfig.setStatus( arg0.getStatus() );
        sysOssConfig.setExt1( arg0.getExt1() );
        sysOssConfig.setRemark( arg0.getRemark() );
        sysOssConfig.setAccessPolicy( arg0.getAccessPolicy() );

        return sysOssConfig;
    }

    @Override
    public SysOssConfig convert(SysOssConfigVo source, SysOssConfig target) {
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
