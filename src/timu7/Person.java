package timu7;

public class Person {
		private char sex;

		public char getSex() {
			return sex;
		}

		public void setSex(char sex) throws Sexjiance {
			if(!('男'==sex||'女'==sex)){
				throw new Sexjiance("请正确输入年龄!!");
			}else {
				this.sex=sex;
			}
			
		}
		
}
