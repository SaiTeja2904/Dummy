import java.util.*;

class Priyanka
{
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.print("How many people ordered?");
		int orders=scanner.nextInt();
		String names[]=new String[orders];
		int cider[]=new int[orders];
		int juice[]=new int[orders];
		float sub_cider[]=new float[orders];
		float sub_juices[]=new float[orders];
		float total[]=new float[orders];
		int cider_total=0;
		int juices_total=0;
		float total_cider=0.0f;
		float total_juice=0.0f;
		float total_trans=0.0f;

		System.out.println("\n");

		for(int i=0;i<orders;i++)
		{
			System.out.print("Enter the name of person#"+(i+1)+" ");
			names[i]=scanner.next();
			System.out.print("How many orders of cider did "+names[i]+" have? ");
			cider[i]=scanner.nextInt();
			cider_total+=cider[i];
			System.out.print("How many orders of juice did "+names[i]+" have? ");
			juice[i]=scanner.nextInt();
			juices_total+=juice[i];

			sub_cider[i]=(float)cider[i]*(5.50f);
			total_cider+=sub_cider[i];

			sub_juices[i]=(float)juice[i]*(4.50f);
			total_juice+=sub_juices[i];

			total[i]=sub_cider[i]+sub_juices[i];
			total_trans+=total[i];

			System.out.println();
			//System.out.println(names[i]+"\t"+cider[i]+"\t"+juice[i]+"\t"+sub_cider[i]+"\t"+sub_juices[i]+"\t"+total[i]);
		}

		//Displaying Details
		System.out.println("Names\t\tCider\t\tJuice\t\tSubtotal (Cider)\tSubtotal (Juice)\tTotal");
		System.out.println("-----------------------------------------------------------------------------------------------------------------");
		for(int i=0;i<orders;i++)
		{
			System.out.print(names[i]+"\t\t");
			System.out.print(cider[i]+"\t\t");
			System.out.print(juice[i]+"\t\t");
			System.out.print("$ "+sub_cider[i]+"\t\t\t");
			System.out.print("$ "+sub_juices[i]+"\t\t\t");
			System.out.print("$ "+total[i]);
			System.out.println();
		}
		System.out.println("-----------------------------------------------------------------------------------------------------------------");
		System.out.print("Total\t\t");
		System.out.print(cider_total+"\t\t");
		System.out.print(juices_total+"\t\t");
		System.out.print("$ "+total_cider+"\t\t\t");
		System.out.print("$ "+total_juice+"\t\t\t");
		System.out.print("$ "+total_trans);
		System.out.println();
		System.out.print("Average\t\t");
		System.out.print((cider_total/(float)orders)+"\t\t");
		System.out.print((juices_total/(float)orders)+"\t\t");
		System.out.print("$ "+(total_cider/(float)orders)+"\t\t\t");
		System.out.print("$ "+(total_juice/(float)orders)+"\t\t\t");
		System.out.print("$ "+(total_trans/(float)orders));

	}
}