package org.dromara.okx.domain;

import javax.annotation.processing.Generated;
import org.dromara.okx.domain.vo.SubPosCurrentVo;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-02-27T17:43:57+0800",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 21.0.4 (Eclipse Adoptium)"
)
@Component
public class SubPosCurrentToSubPosCurrentVoMapperImpl implements SubPosCurrentToSubPosCurrentVoMapper {

    @Override
    public SubPosCurrentVo convert(SubPosCurrent arg0) {
        if ( arg0 == null ) {
            return null;
        }

        SubPosCurrentVo subPosCurrentVo = new SubPosCurrentVo();

        subPosCurrentVo.setId( arg0.getId() );
        subPosCurrentVo.setInstId( arg0.getInstId() );
        subPosCurrentVo.setPosSide( arg0.getPosSide() );
        subPosCurrentVo.setMgnMode( arg0.getMgnMode() );
        subPosCurrentVo.setLever( arg0.getLever() );
        subPosCurrentVo.setOpenAvgPx( arg0.getOpenAvgPx() );
        subPosCurrentVo.setOpenTimeDate( arg0.getOpenTimeDate() );
        subPosCurrentVo.setSubPos( arg0.getSubPos() );
        subPosCurrentVo.setInstType( arg0.getInstType() );
        subPosCurrentVo.setMargin( arg0.getMargin() );
        subPosCurrentVo.setUpl( arg0.getUpl() );
        subPosCurrentVo.setUplRatio( arg0.getUplRatio() );
        subPosCurrentVo.setMarkPx( arg0.getMarkPx() );
        subPosCurrentVo.setUniqueCode( arg0.getUniqueCode() );

        return subPosCurrentVo;
    }

    @Override
    public SubPosCurrentVo convert(SubPosCurrent source, SubPosCurrentVo target) {
        if ( source == null ) {
            return target;
        }

        target.setId( source.getId() );
        target.setInstId( source.getInstId() );
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
