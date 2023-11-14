//برنامه ای بنویسید که یک رشته خوانده و کاراکتر های آن را با یک فاصله نمایش دهد.
//برای حل این تمرین روش های مختلفی وجود دارد ولی شما از حلقه استفاده کنید
//Write a program that reads a string and displays its characters with a space.
//There are different ways to solve this exercise, but you should use the loop
public class test {
    public static void main(String[] args) {

        String name = "Erfan";
        String[] arry = name.split("");
       for (String ss : arry ){
           System.out.print(ss+"\t");
       }
    }
}// out PUt : E r f a n
