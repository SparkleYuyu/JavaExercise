package Assignment;

import java.util.*;

public class BookStore {

    private Map<String, Book> bookRegistration;
    private Map<String, Integer> bookSales;
    private List<Book> salesTop3;

    public BookStore() {
        //调用构造方法登记一本书，应该同时在bookRegister，bookSales和bookSalesTop中new一个对象
        bookRegistration = new HashMap<>();
        bookSales = new HashMap<>();
        salesTop3 = new ArrayList<>();
    }

    //登记书ISBN和书名，实例化键值对
    public void addBook(String isbn, String title) {
        //创建一本书
        Book tempBook = new Book(isbn, title);
        bookRegistration.put(isbn, tempBook);
    }

    //实时记录书销量，实例化键值对
    public void recordSales(String isbn, int sales) {
        //检测是否存在这本书可以销售,即检查是否存在key为isbn
        if(bookRegistration.containsKey(isbn)) {
            //使用get()，不存在的键会返回null无法+；使用getOrDefault，不存在的键会返回默认值
            //进入if，说明库存里面有这本书，假设这本书是第一次卖，那么在bookSales就没有这个键（值对），会返回null
            //但我们想要的是没有这个键，那么就返回0，因为这本书在库存里面存在只是没有卖出
            int newSales = bookSales.getOrDefault(isbn, 0) + sales;
            bookSales.put(isbn, newSales);
            updateTop3();
        } else { //库存里面没有这本书
            System.out.println("Error ISBN");
        }

    }

    //更新书的畅销榜前三
    private void updateTop3() {
        //将所有的键值对Map Entry转化成List
        List<Map.Entry<String, Integer>> tempSalesList = new ArrayList<>(bookSales.entrySet());//回忆起来当时for-entrySet，()里面是初始化这个List内容

//        //冒泡排序：销量降序
//        for(int i = 0; i < tempSalesList.size() - 1; i++) {
//            for(int j = 0; j < tempSalesList.size() - 1 - i; j++) {
//                if(tempSalesList.get(j).getValue() < tempSalesList.get(j + 1).getValue()) {
//                    //交换位置
//                    Map.Entry<String, Integer> temp = tempSalesList.get(j);
//                    tempSalesList.set(j, tempSalesList.get(j + 1));//实际上就是value的交换
//                    tempSalesList.set(j + 1, temp) ;
//                }
//            }
//        }

//        //快速排序
//        quickSort(tempSalesList, 0,tempSalesList.size() - 1);

        // 按销量降序排序
        tempSalesList.sort((e1, e2) -> e2.getValue() - e1.getValue());


        //清空旧列表的前三名
        salesTop3.clear();

        //填写新的前三名,先找到book
        int count = Math.min(3, tempSalesList.size());  // 防止越界
        for(int k = 0; k < count; k++) {
            String tempKey = tempSalesList.get(k).getKey();
            Book tempBook = bookRegistration.get(tempKey);
            salesTop3.add(tempBook);
        }

    }

    //展示书的畅销榜
    public void displayTop3() {
        System.out.println("\n--- 畅销榜 Top 3 ---");
        for(int i = 0; i < salesTop3.size(); i++) {
            Book bookInfo = salesTop3.get(i);
            System.out.println("销量第" + (i + 1) + "名： " + bookInfo.getTitle() + ", 销量： " + bookSales.get(bookInfo.getISBN()));
        }
        System.out.println("..................................................");

    }


    //快排
    private void quickSort(List<Map.Entry<String, Integer>> list, int left, int right) {
        if (left >= right) return;

        int pivotIndex = partition(list, left, right);
        quickSort(list, left, pivotIndex - 1);
        quickSort(list, pivotIndex + 1, right);
    }

    private int partition(List<Map.Entry<String, Integer>> list, int left, int right) {
        Map.Entry<String, Integer> pivot = list.get(right);
        int i = left - 1;

        for (int j = left; j < right; j++) {
            // 排序规则：销量从大到小
            if (list.get(j).getValue() >= pivot.getValue()) {
                i++;
                // 交换 list[i] 和 list[j]
                Map.Entry<String, Integer> temp = list.get(i);
                list.set(i, list.get(j));
                list.set(j, temp);
            }
        }

        // 把 pivot 放到中间
        Map.Entry<String, Integer> temp = list.get(i + 1);
        list.set(i + 1, list.get(right));
        list.set(right, temp);

        return i + 1;
    }

}
