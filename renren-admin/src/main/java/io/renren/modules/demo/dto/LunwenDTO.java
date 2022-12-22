package io.renren.modules.demo.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;


/**
 * 
 *
 * @author Mark sunlightcs@gmail.com
 * @since 1.0.0 2022-12-11
 */
@Data
@ApiModel(value = "")
public class LunwenDTO implements Serializable {
    private static final long serialVersionUID = 1L;

	@ApiModelProperty(value = "")
	private Long id;

	@ApiModelProperty(value = "所属部门")
	private String depart;

	@ApiModelProperty(value = "作者")
	private String author;

	@ApiModelProperty(value = "论文题目")
	private String title;

	@ApiModelProperty(value = "论文来源")
	private String source;

	@ApiModelProperty(value = "检索网址")
	private String address;

	@ApiModelProperty(value = "刊物名称")
	private String pubname;

	@ApiModelProperty(value = "刊号")
	private String pubnum;

	@ApiModelProperty(value = "刊物级别")
	private String level;

	@ApiModelProperty(value = "起止页码")
	private String page;

	@ApiModelProperty(value = "收录级别")
	private String include;


}