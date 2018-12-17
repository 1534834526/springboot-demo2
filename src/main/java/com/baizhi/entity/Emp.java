package com.baizhi.entity;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Table;
import java.util.Date;


@Table(name="t_test")
@Data
@AllArgsConstructor
    @NoArgsConstructor
    public class Emp {
        Long tid;
        String tname;
        String email;
      //实体类上加注解或配置文件覆盖jackson的bean  @JsonFormat(timezone = "GTM+8",pattern = "yyyy-MM-dd HH:mm:ss")

        @JSONField(format = "yyyy-MM-dd HH:mm:ss")
        Date birthday;

}
