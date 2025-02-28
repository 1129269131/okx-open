package org.dromara.okx.domain.bo;

import java.util.LinkedHashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import org.dromara.okx.domain.SubPosCurrent;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-02-27T17:43:57+0800",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 21.0.4 (Eclipse Adoptium)"
)
@Component
public class SubPosCurrentBoToSubPosCurrentMapperImpl implements SubPosCurrentBoToSubPosCurrentMapper {

    @Override
    public SubPosCurrent convert(SubPosCurrentBo arg0) {
        if ( arg0 == null ) {
            return null;
        }

        SubPosCurrent subPosCurrent = new SubPosCurrent();

        subPosCurrent.setSearchValue( arg0.getSearchValue() );
        subPosCurrent.setCreateDept( arg0.getCreateDept() );
        subPosCurrent.setCreateBy( arg0.getCreateBy() );
        subPosCurrent.setCreateTime( arg0.getCreateTime() );
        subPosCurrent.setUpdateBy( arg0.getUpdateBy() );
        subPosCurrent.setUpdateTime( arg0.getUpdateTime() );
        Map<String, Object> map = arg0.getParams();
        if ( map != null ) {
            subPosCurrent.setParams( new LinkedHashMap<String, Object>( map ) );
        }
        subPosCurrent.setId( arg0.getId() );
        subPosCurrent.setInstId( arg0.getInstId() );
        subPosCurrent.setSubPosId( arg0.getSubPosId() );
        subPosCurrent.setPosSide( arg0.getPosSide() );
        subPosCurrent.setMgnMode( arg0.getMgnMode() );
        subPosCurrent.setLever( arg0.getLever() );
        subPosCurrent.setOpenAvgPx( arg0.getOpenAvgPx() );
        subPosCurrent.setOpenTimeDate( arg0.getOpenTimeDate() );
        subPosCurrent.setSubPos( arg0.getSubPos() );
        subPosCurrent.setInstType( arg0.getInstType() );
        subPosCurrent.setMargin( arg0.getMargin() );
        subPosCurrent.setUpl( arg0.getUpl() );
        subPosCurrent.setUplRatio( arg0.getUplRatio() );
        subPosCurrent.setMarkPx( arg0.getMarkPx() );
        subPosCurrent.setUniqueCode( arg0.getUniqueCode() );

        return subPosCurrent;
    }

    @Override
    public SubPosCurrent convert(SubPosCurrentBo source, SubPosCurrent target) {
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
        target.setInstId( source.getInstId() );
        target.setSubPosId( source.getSubPosId() );
        target.setPosSide( source.getPosSide() );
        target.setMgnMode( source.getMgnMode() );
        target.setLever( source.getLever() );
        target.setOpenAvgPx( source.getOpenAvgPx() );
        target.setOpenTimeDate( source.getOpenTimeDate() );
        target.setSubPos( source.getSubPos() );
        target.setInstType( source.getInstType() );
        target.setMargin( source.getMargin() );
        target.setUpl( source.getUpl() );
        target.setUplRatio( source.getUplRatio() );
        target.setMarkPx( source.getMarkPx() );
        target.setUniqueCode( source.getUniqueCode() );

        return target;
    }
}
