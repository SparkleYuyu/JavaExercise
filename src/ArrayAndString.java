public class ArrayAndString {
    public static void main(String[] args){
        System.out.println("Array And String");

        int[] array = {1, 2, 3, 4, 5};
        int size = array.length;
        System.out.println(size);

        int[] nums = new int[5];//此时数组的每个元素都是0
        int sizeOfNums = nums.length;
        System.out.println(sizeOfNums);

        //for loop-visit array
        for(int i = 0; i < nums.length; i++){
            System.out.println(nums[i]);
        }

        //edit element
        for(int j = 0; j < nums.length; j++){
            nums[j] = j;
            System.out.println(nums[j]);
        }

        //String
        String str = "Hello，World";

        //charAt
        char c = str.charAt(1);//e
        System.out.println(c);

        //concat
        String first = "Hello";
        String second = "World";
        String result1 = first + second;
        System.out.println(result1);
        String result2 = first.concat(second);

        //equals
        System.out.println(result1.equals(result2));

        //length,字符串中的length是通过length()方法,数组中是直接使用.length即可访问
        String testString = "Hello";
        System.out.println(testString.length());
        int index = 0;
        if(index >= 0 && index < testString.length()){
            System.out.println(testString.charAt(index));
        }else{
            System.out.println("索引错误！");
        }

        //substring
        System.out.println(testString.substring(2, 4));//ll
        System.out.println(testString.substring(2));//llo


    }
}
