package com.ooooo.demo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author <a href="https://github.com/ooooo-youwillsee">ooooo</a>
 * @since 1.0.0
 */
@Data
@TableName("user")
public class User {

    @TableId(type = IdType.ASSIGN_ID)
    private Long id;

    private String name;

    public User(String name) {
        this.name = name;
    }
}
