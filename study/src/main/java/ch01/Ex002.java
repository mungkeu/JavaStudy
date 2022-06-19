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
 * Lombok�� @Data�� �����ϸ� ������ �ֳ����̼��� ȿ���� ����ȴ�.
 * @Getter
 * @Setter
 * @ToString
 * @EqualsAndHashCode
 * @RequiredArgsConstructor
 */
