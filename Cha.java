//���֣��۰룩���ҷ���ǰ���������к���
public class Cha {
	public static void main(String[] args) {
		int[] s ={0,1,2,3,4,5,6,7,8,9,10};
		int g = 23;//Ҫ���ҵ�����
		int t = 0;//���忪ʼ���ҷ�Χ���±�
		int jie = s.length-1;//����������ҷ�Χ���±�
		int zhong = -1;//�����м�λ�õ��±�
		boolean isFind = false;//����Ƿ��ҵ���false û�ҵ� ��true �ҵ���
		
		do{
			zhong = (t+jie)/2;
			if(s[zhong]==g){
				System.out.println("��ϲ���ҵ���!�±��ǣ�"+t);
				isFind = true;
				break;
			}else if (s[zhong]>g){
				jie = zhong -1;
			}else{
				t = zhong + 1;
			}
		}while(t<=jie);
		if(!isFind){
			System.out.println("��Ǹ������û���ҵ�");
		}
		

		}
	}

//abcd