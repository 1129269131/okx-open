package org.dromara.okx.domain;

import javax.annotation.processing.Generated;
import org.dromara.okx.domain.vo.SubPosHisVo;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-02-27T17:43:57+0800",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 21.0.4 (Eclipse Adoptium)"
)
@Component
public class SubPosHisToSubPosHisVoMapperImpl implements SubPosHisToSubPosHisVoMapper {

    @Override
    public SubPosHisVo convert(SubPosHis arg0) {
        if ( arg0 == null ) {
            return null;
        }

        SubPosHisVo subPosHisVo = new SubPosHisVo();

        subPosHisVo.setId( arg0.getId() );
        subPosHisVo.setInstId( arg0.getInstId() );
        subPosHisVo.setPosSide( arg0.getPosSide() );
        subPosHisVo.setMgnMode( arg0.getMgnMode() );
        subPosHisVo.setLever( arg0.getLever() );
        subPosHisVo.setOpenAvgPx( arg0.getOpenAvgPx() );
        subPosHisVo.setOpenTimeDate( arg0.getOpenTimeDate() );
        subPosHisVo.setSubPos( arg0.getSubPos() );
        subPosHisVo.setCloseTimeDate( arg0.getCloseTimeDate() );
        subPosHisVo.setCloseAvgPx( arg0.getCloseAvgPx() );
        subPosHisVo.setPnl( arg0.getPnl() );
        subPosHisVo.setPnlRatio( arg0.getPnlRatio() );
        subPosHisVo.setInstType( arg0.getInstType() );
        subPosHisVo.setMargin( arg0.getMargin() );
        subPosHisVo.setCcy( arg0.getCcy() );
        subPosHisVo.setUniqueCode( arg0.getUniqueCode() );

        return subPosHisVo;
    }

    @Override
    public SubPosHisVo convert(SubPosHis source, SubPosHisVo target) {
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
