package ch01;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Data
public class Ex002 {
	private String color;
	private int doors;
	private String manufacturer;
}
/*
 * Lombok의 @Data를 적용하면 다음의 애너테이션의 효과가 적용된다.
 * @Getter
 * @Setter
 * @ToString
 * @EqualsAndHashCode
 * @RequiredArgsConstructor
 */
