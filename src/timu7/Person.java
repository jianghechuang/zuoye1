package timu7;

public class Person {
		private char sex;

		public char getSex() {
			return sex;
		}

		public void setSex(char sex) throws Sexjiance {
			if(!('��'==sex||'Ů'==sex)){
				throw new Sexjiance("����ȷ��������!!");
			}else {
				this.sex=sex;
			}
			
		}
		
}
