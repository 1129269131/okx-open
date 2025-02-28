package org.dromara.okx.domain.bo;

import java.util.LinkedHashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import org.dromara.okx.domain.SubPosHis;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-02-27T17:43:57+0800",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 21.0.4 (Eclipse Adoptium)"
)
@Component
public class SubPosHisBoToSubPosHisMapperImpl implements SubPosHisBoToSubPosHisMapper {

    @Override
    public SubPosHis convert(SubPosHisBo arg0) {
        if ( arg0 == null ) {
            return null;
        }

        SubPosHis subPosHis = new SubPosHis();

        subPosHis.setSearchValue( arg0.getSearchValue() );
        subPosHis.setCreateDept( arg0.getCreateDept() );
        subPosHis.setCreateBy( arg0.getCreateBy() );
        subPosHis.setCreateTime( arg0.getCreateTime() );
        subPosHis.setUpdateBy( arg0.getUpdateBy() );
        subPosHis.setUpdateTime( arg0.getUpdateTime() );
        Map<String, Object> map = arg0.getParams();
        if ( map != null ) {
            subPosHis.setParams( new LinkedHashMap<String, Object>( map ) );
        }
        subPosHis.setId( arg0.getId() );
        subPosHis.setInstId( arg0.getInstId() );
        subPosHis.setSubPosId( arg0.getSubPosId() );
        subPosHis.setPosSide( arg0.getPosSide() );
        subPosHis.setMgnMode( arg0.getMgnMode() );
        subPosHis.setLever( arg0.getLever() );
        subPosHis.setOpenAvgPx( arg0.getOpenAvgPx() );
        subPosHis.setOpenTimeDate( arg0.getOpenTimeDate() );
        subPosHis.setSubPos( arg0.getSubPos() );
        subPosHis.setCloseTimeDate( arg0.getCloseTimeDate() );
        subPosHis.setCloseAvgPx( arg0.getCloseAvgPx() );
        subPosHis.setPnl( arg0.getPnl() );
        subPosHis.setPnlRatio( arg0.getPnlRatio() );
        subPosHis.setInstType( arg0.getInstType() );
        subPosHis.setMargin( arg0.getMargin() );
        subPosHis.setCcy( arg0.getCcy() );
        subPosHis.setUniqueCode( arg0.getUniqueCode() );

        return subPosHis;
    }

    @Override
    public SubPosHis convert(SubPosHisBo source, SubPosHis target) {
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
        target.setCloseTimeDate( source.getCloseTimeDate() );
        target.setCloseAvgPx( source.getCloseAvgPx() );
        target.setPnl( source.getPnl() );
        target.setPnlRatio( source.getPnlRatio() );
        target.setInstType( source.getInstType() );
        target.setMargin( source.getMargin() );
        target.setCcy( source.getCcy() );
        target.setUniqueCode( source.getUniqueCode() );

        return target;
    }
}
