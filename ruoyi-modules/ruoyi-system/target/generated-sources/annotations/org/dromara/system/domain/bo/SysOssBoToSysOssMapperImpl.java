package org.dromara.system.domain.bo;

import java.util.LinkedHashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import org.dromara.system.domain.SysOss;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-02-27T17:43:52+0800",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 21.0.4 (Eclipse Adoptium)"
)
@Component
public class SysOssBoToSysOssMapperImpl implements SysOssBoToSysOssMapper {

    @Override
    public SysOss convert(SysOssBo arg0) {
        if ( arg0 == null ) {
            return null;
        }

        SysOss sysOss = new SysOss();

        sysOss.setSearchValue( arg0.getSearchValue() );
        sysOss.setCreateDept( arg0.getCreateDept() );
        sysOss.setCreateBy( arg0.getCreateBy() );
        sysOss.setCreateTime( arg0.getCreateTime() );
        sysOss.setUpdateBy( arg0.getUpdateBy() );
        sysOss.setUpdateTime( arg0.getUpdateTime() );
        Map<String, Object> map = arg0.getParams();
        if ( map != null ) {
            sysOss.setParams( new LinkedHashMap<String, Object>( map ) );
        }
        sysOss.setOssId( arg0.getOssId() );
        sysOss.setFileName( arg0.getFileName() );
        sysOss.setOriginalName( arg0.getOriginalName() );
        sysOss.setFileSuffix( arg0.getFileSuffix() );
        sysOss.setUrl( arg0.getUrl() );
        sysOss.setService( arg0.getService() );

        return sysOss;
    }

    @Override
    public SysOss convert(SysOssBo source, SysOss target) {
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
        target.setOssId( source.getOssId() );
        target.setFileName( source.getFileName() );
        target.setOriginalName( source.getOriginalName() );
        target.setFileSuffix( source.getFileSuffix() );
        target.setUrl( source.getUrl() );
        target.setService( source.getService() );

        return target;
    }
}
