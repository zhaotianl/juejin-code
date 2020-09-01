package com.jpsite.interesting.domain;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

/**
 * @author jiangpeng
 * @date 2019/11/2715:24
 */
@Entity
@Data
@NoArgsConstructor
@ToString
public class ShortLink {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String url;
    private Date createTime;

    public ShortLink(String url, Date date){
        this.url = url;
        this.createTime =date;
    }
}
