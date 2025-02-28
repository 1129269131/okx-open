package org.dromara.okx.domain.bo;

import java.util.LinkedHashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import org.dromara.okx.domain.CopytradingInfo;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-02-27T17:43:57+0800",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 21.0.4 (Eclipse Adoptium)"
)
@Component
public class CopytradingInfoBoToCopytradingInfoMapperImpl implements CopytradingInfoBoToCopytradingInfoMapper {

    @Override
    public CopytradingInfo convert(CopytradingInfoBo arg0) {
        if ( arg0 == null ) {
            return null;
        }

        CopytradingInfo copytradingInfo = new CopytradingInfo();

        copytradingInfo.setSearchValue( arg0.getSearchValue() );
        copytradingInfo.setCreateDept( arg0.getCreateDept() );
        copytradingInfo.setCreateBy( arg0.getCreateBy() );
        copytradingInfo.setCreateTime( arg0.getCreateTime() );
        copytradingInfo.setUpdateBy( arg0.getUpdateBy() );
        copytradingInfo.setUpdateTime( arg0.getUpdateTime() );
        Map<String, Object> map = arg0.getParams();
        if ( map != null ) {
            copytradingInfo.setParams( new LinkedHashMap<String, Object>( map ) );
        }
        copytradingInfo.setId( arg0.getId() );
        copytradingInfo.setName( arg0.getName() );
        copytradingInfo.setUniqueCode( arg0.getUniqueCode() );
        copytradingInfo.setRecomIndex( arg0.getRecomIndex() );
        copytradingInfo.setPlatform( arg0.getPlatform() );

        return copytradingInfo;
    }

    @Override
    public CopytradingInfo convert(CopytradingInfoBo source, CopytradingInfo target) {
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
        target.setName( source.getName() );
        target.setUniqueCode( source.getUniqueCode() );
        target.setRecomIndex( source.getRecomIndex() );
        target.setPlatform( source.getPlatform() );

        return target;
    }
}
