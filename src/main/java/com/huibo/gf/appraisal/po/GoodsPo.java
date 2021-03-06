package com.huibo.gf.appraisal.po;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * @author 谢亮
 * @date 2020/5/23
 * 商品信息实体类
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class GoodsPo {
    //商品序号
    private String goodsId;
    //原商品序号
    private String sourceGoodsId;
    //流程实例ID
    private String procInstId;
    //品牌编号
    private String brandCode;
    //大类编号
    private String catCode;
    //二级分类
    private String subCatCode;
    //三级分类
    private String detailCatCode;
    //商品名称
    private String goodsName;
    //门店编号
    private String shopCode;
    //仓库编号
    private String whCode;
    //商品货号
    private String articleNumber;
    //客户首买价
    private String firstPrice;
    //官方价
    private String officialPrice;
    //估值价格
    private String valuationPrice;
    //典当价
    private String pawnPrice;
    //收购价
    private String purchasePrice;
    //售卖价
    private String sellingPrice;
    //租价
    private String rentPrice;
    //最低价格
    private String bottomPrice;
    //商品描述
    private String goodsDesc;
    //录入人
    private String inputUser;
    //录入时间
//    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(timezone = "Asia/Shanghai",pattern = "yyyy-MM-dd")
    private Date inputDate;
    //鉴定人
    private String surveyor;
    //鉴定时间
    @JsonFormat(timezone = "Asia/Shanghai",pattern = "yyyy-MM-dd")
    private Date   surveyTime;
    //评估人
    private String assessor;
    //评估时间
    @JsonFormat(timezone = "Asia/Shanghai",pattern = "yyyy-MM-dd")
    private Date assessTime;
    //是否可租
    private String isRentable;
    //是否可售
    private String isSalable;
    //商品来源
    private String sourceType;
    //是否处于流程中
    private String isInProc;
    //库存状态
    private String stockState;
    //状态
    private String goodsState;
    //创建人
    private String createBy;
    //创建时间
    @JsonFormat(timezone = "Asia/Shanghai",pattern = "yyyy-MM-dd")
    private Date createTime;
    //修改人
    private String modifyBy;
    //修改时间
    @JsonFormat(timezone = "Asia/Shanghai",pattern = "yyyy-MM-dd")
    private Date modifyTime;
    //保存图片的地址，和图片属性的字符串
    private String goodsDef;

}
