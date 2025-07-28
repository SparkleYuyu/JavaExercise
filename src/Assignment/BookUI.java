package Assignment;

public class BookUI {
    public static void main(String[] args) {
        BookStore bookStore = new BookStore();

        //添加书籍
        bookStore.addBook("ISBN001", "Java核心技术");
        bookStore.addBook("ISBN002", "Effective Java");
        bookStore.addBook("ISBN003", "Python数据分析");
        bookStore.addBook("ISBN004", "计算机网络");
        bookStore.addBook("ISBN005", "数据结构与算法");

        //模拟销售
        bookStore.recordSales("ISBN001", 10);  // Java核心技术 售出10本
        bookStore.recordSales("ISBN002", 15);  // Effective Java 售出15本
        bookStore.recordSales("ISBN003", 8);   // Python数据分析 售出8本
        bookStore.recordSales("ISBN001", 5);   // Java核心技术 再售出5本

        //显示畅销榜
        bookStore.displayTop3();

        //继续模拟销售
        bookStore.recordSales("ISBN004", 20);  // 计算机网络 售出20本
        bookStore.recordSales("ISBN005", 12);  // 数据结构与算法 售出12本

        //再次显示畅销榜
        bookStore.displayTop3();

    }
}
