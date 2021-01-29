package com.example.testDemo.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;


@Data
@MappedSuperclass
public class SysEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Integer id;

    /**
     * 创建时间
     */
    @Column(updatable = false)
    protected Date createTime;

    /**
     * 修改时间
     */
    protected Date updateTime;

    /**
     * 创建人
     */
    @Column(updatable = false)
    protected Integer creatorId;

    /**
     * 修改人
     */
    @Column(insertable = false)
    protected Integer updaterId;

    /**
     * 用于后续saas服务租户字段
     */
    protected String siteNum;

}
