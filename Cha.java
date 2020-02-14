//二分（折半）查找法：前提有序排列好了
public class Cha {
	public static void main(String[] args) {
		int[] s ={0,1,2,3,4,5,6,7,8,9,10};
		int g = 23;//要查找的数字
		int t = 0;//定义开始查找范围的下标
		int jie = s.length-1;//定义结束查找范围的下标
		int zhong = -1;//定义中间位置的下标
		boolean isFind = false;//标记是否找到，false 没找到 ，true 找到了
		
		do{
			zhong = (t+jie)/2;
			if(s[zhong]==g){
				System.out.println("恭喜你找到了!下标是："+t);
				isFind = true;
				break;
			}else if (s[zhong]>g){
				jie = zhong -1;
			}else{
				t = zhong + 1;
			}
		}while(t<=jie);
		if(!isFind){
			System.out.println("抱歉该数字没有找到");
		}
		

		}
	}

//abcd