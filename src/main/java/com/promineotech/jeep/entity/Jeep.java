package com.promineotech.jeep.entity;

import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Jeep {
	private Long modelPk;
	private JeepModel modelID;
	private String trimLevel;
	private int numDoors;
	private int wheelSize;
	private BigDecimal basePrice;

	@JsonIgnore
	public Long getModelPk() {
		return modelPk;
	}
}
