package example0201.my;

public class HelloWorld
{

	public static void main(String[] args)
	{
		// TODO 自动生成的方法存根
		//这是一个测试
		//在知道园的半径的条件下，求它的面积，以及知道高的情况下，以它为底面的圆柱体的体积
	//		 int r = 5;
	//		 double high  = 3.2;
	//		 double mianji;//面积
	//		 double tiji;//体积
	//		 double pai = 3.1415926;
	//		 mianji  = pai * r *r;
	//		 tiji = mianji * high;
	//		 System.out.println("圆的面积："+mianji+"\n"+"圆柱的体积是："+tiji);
	//		
//
//		int num = 100 ;
//		int i = 1;
//		System.out.println("100以内能被3整除的数有：");
//		for (i=1;i<=num;i++)
//		{
//			if(!(i%3>0))
//			{
//				System.out.println(i);
//			}
//		}
//		
//		//判断一个数是否在[10，20]或[50，60]之间
//		int i = 131;
//		if(((i >= 10) && (i <= 20))||(i >= 50 && i <= 60))
//		{
//			System.out.println(i);
//		}else {
//			System.out.println(i+"不在范围内");
//		}
		//给定一个数，显示它的绝对值
//		int i = -12;
//		if(i<0)
//		{
//			System.out.print((-i));
//		}else {
//			System.out.println(i);
//		}
		
//		//冒泡排序
//		int[] arr = {3,6,4,10,1,2,8,7,9,5};
//		//int[] newarr = new int[10];
//		for (int i=0;i<arr.length;i++)
//		{
//			
//			
//			for (int j =i+1 ; j<arr.length ; j++)
//			{
//				
//				if (arr[i] < arr[j])
//				{
//					int temp = arr[j];
//					arr[j] = arr[i];
//					arr[i] = temp;
//					
//				}
//				
//
//				
//			}
//			System.out.println("由大到小依次为：" + arr[i]);
//			
//		}
		/*
		 * 旧个税税率表					新个税税率表
		 * <1500      3%    0			<3000           3%     0
		 * 1500~4500  10%   105			3000~12000      10%    210
		 * 4500~9000  20%   555			12000~25000     20%    1410
		 * 9000~35000 25%   1005		25000~35000		25%	   2660
		 * 35000~55000 30%  2755		35000~55000		30%		4410
		 * 55000~80000 35%  5505		55000~80000		35%     7160
		 * >80000	   45%  13505		>80000			45%		15160
		 */
		double taxableAmount = 0;//应税金额
		double oldTax = 0;
		double newTax = 0;
		double difference = 0;
		double deduction = 0;//扣除数
		double taxRate = 0;//税率
		
		HelloWorld h =new HelloWorld();
		double[] arr = {5000,6500,8000,9000,9500,12000,12500,14000,15500,17000,25000,28500,30000,35000,38500,40000,55000,58500,60000,80000,83500,85000,100000,150000};
		for(int i = 0; i < arr.length;i++){
			double taxNew = h.tax(arr[i]+1,"new");
			double taxOld = h.tax(arr[i]+1,"old");
			System.out.println("应税金融为："+arr[i]+"  老税率该交税："+taxOld+"   "+"新税率下：" + taxNew + "  少交："+(taxOld-taxNew));
		}	
	}
	public String toString()
	{
		//for (int i=0;i<tax1.length;)
		return "1";
	}
	public double tax (double taxableAmount,String status) 
	{
		double taxRateOld = 0;
		double deductionOld= 0;
		double taxRateNew = 0;
		double deductionNew = 0;
		double taxableAmount1 = 0;
		double taxOld = 0;
		double taxNew = 0;
		if(status == "new") {
			 taxableAmount1 = taxableAmount - 5000;
		}else {
			 taxableAmount1 = taxableAmount - 3500;
		}
		
		if(taxableAmount1<=1500) {
			taxRateOld = taxRateNew = 0.03;
			deductionOld = deductionNew = 0;
			
		}else if(taxableAmount1 > 1500 && taxableAmount1<=3000) {
			taxRateOld = 0.1;
			deductionOld = 105;
			taxRateNew = 0.03;
			deductionNew = 0;
		}else if(taxableAmount1>3000 && taxableAmount1 <= 4500) {
			taxRateOld = 0.1;
			deductionOld = 105;
			taxRateNew = 0.1;
			deductionNew = 210;
		}else if(taxableAmount1 >4500 && taxableAmount1 <= 9000) {
			taxRateOld = 0.2;
			deductionOld = 555;
			taxRateNew = 0.1;
			deductionNew = 210;
		}else if(taxableAmount1 >9000 && taxableAmount1 <= 12000) {
			taxRateOld = 0.25;
			deductionOld = 1005;
			taxRateNew = 0.1;
			deductionNew = 210;
		}else if(taxableAmount1 >12000 && taxableAmount1 <= 25000) {
			taxRateOld = 0.25;
			deductionOld = 1005;
			taxRateNew = 0.2;
			deductionNew = 1410;
		}else if(taxableAmount1 >25000 && taxableAmount1 <= 35000) {
			taxRateOld = 0.25;
			deductionOld = 1005;
			taxRateNew = 0.25;
			deductionNew = 2660;
		}else if(taxableAmount1 >35000 && taxableAmount1 <= 55000) {
			taxRateOld = 0.3;
			deductionOld = 2755;
			taxRateNew = 0.3;
			deductionNew = 4410;
		}else if(taxableAmount1 >55000 && taxableAmount1 <= 80000) {
			taxRateOld = 0.35;
			deductionOld = 5505;
			taxRateNew = 0.35;
			deductionNew = 7160;
		}else if(taxableAmount1 >80000) {
			taxRateOld = 0.45;
			deductionOld = 13505;
			taxRateNew = 0.45;
			deductionNew = 15160;
		}
		
		if(status == "new") {
			if(taxableAmount1<0)
			{
				taxNew = 0;
			}else {
				taxNew = taxableAmount1 * taxRateNew - deductionNew;
			}
			return taxNew;
			  
		}else {
			if(taxableAmount1<0)
			{
				taxOld = 0;
			}else {
				taxOld = taxableAmount1 * taxRateOld - deductionOld;
			}
			 return taxOld;
		}
	}
}
