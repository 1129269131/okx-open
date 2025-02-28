package org.dromara.okx.domain.bo;

import java.util.LinkedHashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import org.dromara.okx.domain.InstPushInfo;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-02-27T17:43:57+0800",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 21.0.4 (Eclipse Adoptium)"
)
@Component
public class InstPushInfoBoToInstPushInfoMapperImpl implements InstPushInfoBoToInstPushInfoMapper {

    @Override
    public InstPushInfo convert(InstPushInfoBo arg0) {
        if ( arg0 == null ) {
            return null;
        }

        InstPushInfo instPushInfo = new InstPushInfo();

        instPushInfo.setSearchValue( arg0.getSearchValue() );
        instPushInfo.setCreateDept( arg0.getCreateDept() );
        instPushInfo.setCreateBy( arg0.getCreateBy() );
        instPushInfo.setCreateTime( arg0.getCreateTime() );
        instPushInfo.setUpdateBy( arg0.getUpdateBy() );
        instPushInfo.setUpdateTime( arg0.getUpdateTime() );
        Map<String, Object> map = arg0.getParams();
        if ( map != null ) {
            instPushInfo.setParams( new LinkedHashMap<String, Object>( map ) );
        }
        instPushInfo.setId( arg0.getId() );
        instPushInfo.setName( arg0.getName() );
        instPushInfo.setInstId( arg0.getInstId() );
        instPushInfo.setInstType( arg0.getInstType() );

        return instPushInfo;
    }

    @Override
    public InstPushInfo convert(InstPushInfoBo source, InstPushInfo target) {
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
        target.setInstId( source.getInstId() );
        target.setInstType( source.getInstType() );

        return target;
    }
}
