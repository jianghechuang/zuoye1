package timu3;

public  class Pet {
		public String getPetName() {
		return petName;
	}

	public void setPetName(String petName) {
		this.petName = petName;
	}

	public String getSpeakType() {
		return speakType;
	}

	public void setSpeakType(String speakType) {
		this.speakType = speakType;
	}

		private String petName;
		private String speakType;
		
		public  void speakInfo() {
			System.out.println("父类中的speakInfo方法: 名字:宠物 语言类型: 宠物语言");
		}

		public Pet() {
			super();
			// TODO Auto-generated constructor stub
		}

		public Pet(String petName, String speakType) {
			super();
			this.petName = petName;
			this.speakType = speakType;
		};
		
}
