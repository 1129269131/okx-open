package org.dromara.system.domain.bo;

import java.util.LinkedHashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import org.dromara.system.domain.SysDictType;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-02-27T17:29:01+0800",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 21.0.4 (Eclipse Adoptium)"
)
@Component
public class SysDictTypeBoToSysDictTypeMapperImpl implements SysDictTypeBoToSysDictTypeMapper {

    @Override
    public SysDictType convert(SysDictTypeBo arg0) {
        if ( arg0 == null ) {
            return null;
        }

        SysDictType sysDictType = new SysDictType();

        sysDictType.setSearchValue( arg0.getSearchValue() );
        sysDictType.setCreateDept( arg0.getCreateDept() );
        sysDictType.setCreateBy( arg0.getCreateBy() );
        sysDictType.setCreateTime( arg0.getCreateTime() );
        sysDictType.setUpdateBy( arg0.getUpdateBy() );
        sysDictType.setUpdateTime( arg0.getUpdateTime() );
        Map<String, Object> map = arg0.getParams();
        if ( map != null ) {
            sysDictType.setParams( new LinkedHashMap<String, Object>( map ) );
        }
        sysDictType.setDictId( arg0.getDictId() );
        sysDictType.setDictName( arg0.getDictName() );
        sysDictType.setDictType( arg0.getDictType() );
        sysDictType.setRemark( arg0.getRemark() );

        return sysDictType;
    }

    @Override
    public SysDictType convert(SysDictTypeBo source, SysDictType target) {
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
        target.setDictId( source.getDictId() );
        target.setDictName( source.getDictName() );
        target.setDictType( source.getDictType() );
        target.setRemark( source.getRemark() );

        return target;
    }
}
