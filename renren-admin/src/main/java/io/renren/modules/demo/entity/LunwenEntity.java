package io.renren.modules.demo.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

/**
 * 
 *
 * @author Mark sunlightcs@gmail.com
 * @since 1.0.0 2022-12-11
 */
@Data
@TableName("lunwen")
public class LunwenEntity {

    /**
     * 
     */
	private Long id;
    /**
     * 所属部门
     */
	private String depart;
    /**
     * 作者
     */
	private String author;
    /**
     * 论文题目
     */
	private String title;
    /**
     * 论文来源
     */
	private String source;
    /**
     * 检索网址
     */
	private String address;
    /**
     * 刊物名称
     */
	private String pubname;
    /**
     * 刊号
     */
	private String pubnum;
    /**
     * 刊物级别
     */
	private String level;
    /**
     * 起止页码
     */
	private String page;
    /**
     * 收录级别
     */
	private String include;
}