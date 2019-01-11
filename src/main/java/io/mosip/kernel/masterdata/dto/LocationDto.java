package io.mosip.kernel.masterdata.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Data;

/**
 * 
 * @author Srinivasan
 * @since 1.0.0
 *
 */
@Data

public class LocationDto {

	
	
	@Size(min = 1, max = 36)
	@NotBlank
	private String code;

	
	@Size(min = 1, max = 128)
	@NotBlank
	private String name;

	@NotNull
	private int hierarchyLevel;

	
	@Size(min = 1, max = 64)
	@NotBlank
	private String hierarchyName;

	
	@Size(min = 1, max = 32)
	@NotBlank
	private String parentLocCode;

	
	@Size(min = 1, max = 3)
	@NotBlank
	private String langCode;

	@NotNull
	private Boolean isActive;

}
