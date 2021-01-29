package com.example.testDemo.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

@Data
public class SysDTO {
    /**
     * 主键
     */
    @ApiModelProperty(value = "主键")
    protected Integer id;

    /**
     * 创建时间
     */
    @ApiModelProperty(value = "创建时间,此字段不必传递")
    protected Date createTime;

    /**
     * 修改时间
     */
    @ApiModelProperty(value = "更新时间,此字段不必传递")
    protected Date updateTime;

    /**
     * 创建人
     */
    @ApiModelProperty(value = "创建用户Id", notes = "创建记录时传递,默认为当前登录用户")
    protected Integer creatorId;

    /**
     * 修改人
     */
    @ApiModelProperty(value = "更新用户Id", notes = "更新记录时传递,默认为当前登录用户")
    protected Integer updaterId;

    /**
     * 用于后续saas服务租户字段
     */
    @ApiModelProperty(value = "租户id")
    protected String siteNum;
}
