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
@NoArgsConstructor // �⺻ ������ �ڵ� ����
@AllArgsConstructor // ��� ��� �ʵ带 �Ű������� �����ڸ� ����
@RequiredArgsConstructor 
// @RequiredArgsConstructor�� �� �ʿ��� ��� �ʵ带 �Ű� ����ȣ �ϴ� ������ ����
// �ʿ��� ��� �������� final�̳� @NonNull�� �ִ� ��� �ʵ尡 ��� 1���̻��� 
// �־�� �Ѵ�.
public class Ex001 {
	@NonNull // �翬�� Null�̸� �ȵȴ�.
	private String color;
	private int doors;
	private String manufacturer;
}
