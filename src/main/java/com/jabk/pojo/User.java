package com.jabk.pojo;
import java.io.Serializable;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.experimental.Accessors;
@Data
@Accessors(chain = true)
@TableName//(value = "user")
public class User implements Serializable {
	private static final long serialVersionUID = -7608936516759666971L;
	@TableId(type = IdType.AUTO)
	private Integer id;
	//@TableField(value = "name")
	private String name;
	private Integer age;
	private String sex;
	
}
