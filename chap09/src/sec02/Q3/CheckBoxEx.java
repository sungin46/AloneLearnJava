package sec02.Q3;

public class CheckBoxEx {

	public static void main(String[] args) {
		CheckBox checkBox = new CheckBox();
		checkBox.setOnSelectListener(
			new CheckBox.OnSelectListener() {
				@Override
				public void onSelect() {
					System.out.println("배경을 변경합니다.");
				}
			}
		);
		checkBox.select();
	}

}
