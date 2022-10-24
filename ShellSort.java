import java.util.Scanner;

public class ShellSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array:...");
        int n = sc.nextInt();
        int a[];
        a=new int[n];
        //int a[]=new int[n];
        for(int i=0;i<n;i++) {
            System.out.println("Enter element");
            int element = sc.nextInt();
            a[i]=element;
        }
        for(int i=0;i<n;i++){
            System.out.print(a[i]+"   ");
        }
        //Shell sort
        for(int  gap =n/2;gap>=1;gap=gap/2){
            for(int j= gap;j<n;j++){
                for(int i =j-gap;i>=0;i=i-gap){
                    if(a[i+gap]>a[i]){
                        break;
                    }
                    else{
                        int k= a[i+gap];
                        a[i+gap]=a[i];
                        a[i]=k;
                    }
                }
            }
        }
        System.out.println("After sorting:...");
        for(int i=0;i<n;i++){
            System.out.print(a[i]+"   ");
        }
    }

}
