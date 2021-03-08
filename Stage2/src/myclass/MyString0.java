package myclass;

class MyString00 {
    public String reverse(String str,int startIndex,int endIndex)
    {
        if(str!=null) {
            char[] arr = str.toCharArray();
            for (int x = startIndex, y = endIndex; x < y; x++, y--) {
                char temp = arr[x];
                arr[x] = arr[y];
                arr[y] = temp;
            }
            return new String(arr);
        }
        return null;
    }


}

class MyString01 {
    public String reverse1(String str,int startIndex,int endIndex)
    {
            String reserveStr=str.substring(0,startIndex);
            for(int i=endIndex;i>=startIndex;i--)
            {
                reserveStr+=str.charAt(i);
            }
            reserveStr+=str.substring(endIndex+1);
            return reserveStr;
    }


    public String reverse2(String str,int startIndex,int endIndex){
        StringBuilder builder=new StringBuilder(str.length());
        builder.append(str.substring(0,startIndex));
        for(int i=endIndex;i>=startIndex;i--)
        {
            builder.append(str.charAt(i));
        }
        builder.append(str.substring(endIndex+1));
        return builder.toString();

    }

}

public class MyString0{
    public static void main(String[] args){
        MyString00 a=new MyString00();
        String result=a.reverse("abcdefg",2,5);
        System.out.println(result);

        MyString01 s1=new MyString01();
        String result1=s1.reverse1("abcdefg",2,5);
        System.out.println(result1);


        MyString01 s2=new MyString01();
        String result2=s2.reverse2("abcdefg",2,5);
        System.out.println(result2);
    }

}
