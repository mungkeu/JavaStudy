package ch01;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor // 기본 생성자 자동 구현
@AllArgsConstructor // 모든 멤버 필드를 매개변수로 생성자를 구현
@RequiredArgsConstructor 
// @RequiredArgsConstructor는 꼭 필요한 멤버 필드를 매개 변수호 하는 생성자 구현
// 필요한 멤버 변수에는 final이나 @NonNull이 있는 멤버 필드가 적어도 1개이상은 
// 있어야 한다.
public class Ex001 {
	@NonNull // 당연히 Null이면 안된다.
	private String color;
	private int doors;
	private String manufacturer;
}
