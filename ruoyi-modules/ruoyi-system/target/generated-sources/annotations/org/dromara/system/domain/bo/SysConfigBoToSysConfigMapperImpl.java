package org.dromara.system.domain.bo;

import java.util.LinkedHashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import org.dromara.system.domain.SysConfig;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-02-27T17:43:53+0800",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 21.0.4 (Eclipse Adoptium)"
)
@Component
public class SysConfigBoToSysConfigMapperImpl implements SysConfigBoToSysConfigMapper {

    @Override
    public SysConfig convert(SysConfigBo arg0) {
        if ( arg0 == null ) {
            return null;
        }

        SysConfig sysConfig = new SysConfig();

        sysConfig.setSearchValue( arg0.getSearchValue() );
        sysConfig.setCreateDept( arg0.getCreateDept() );
        sysConfig.setCreateBy( arg0.getCreateBy() );
        sysConfig.setCreateTime( arg0.getCreateTime() );
        sysConfig.setUpdateBy( arg0.getUpdateBy() );
        sysConfig.setUpdateTime( arg0.getUpdateTime() );
        Map<String, Object> map = arg0.getParams();
        if ( map != null ) {
            sysConfig.setParams( new LinkedHashMap<String, Object>( map ) );
        }
        sysConfig.setConfigId( arg0.getConfigId() );
        sysConfig.setConfigName( arg0.getConfigName() );
        sysConfig.setConfigKey( arg0.getConfigKey() );
        sysConfig.setConfigValue( arg0.getConfigValue() );
        sysConfig.setConfigType( arg0.getConfigType() );
        sysConfig.setRemark( arg0.getRemark() );

        return sysConfig;
    }

    @Override
    public SysConfig convert(SysConfigBo source, SysConfig target) {
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
        target.setConfigId( source.getConfigId() );
        target.setConfigName( source.getConfigName() );
        target.setConfigKey( source.getConfigKey() );
        target.setConfigValue( source.getConfigValue() );
        target.setConfigType( source.getConfigType() );
        target.setRemark( source.getRemark() );

        return target;
    }
}
