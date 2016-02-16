import java.util.ArrayList;
import java.util.List;

public class JavaArraysample {

    public static void main(String[] args) {
        List<List<List<Integer>>> list = new ArrayList<List<List<Integer>>>(); //三次元リストの生成
        for(int i=0;i<10;i++){
            list.add(new ArrayList<List<Integer>>()); //リストの中身を生成（二次元）
            for(int j=0;j<10;j++){
                list.get(i).add(new ArrayList<Integer>());//リストの中身を生成（一時元）
                for(int k=0;k<10;k++){
                    list.get(i).get(j).add(i+j+k);
                }
            }
        }
	//結果の出力
        System.out.println(list.get(0).get(1));
        System.out.println(list.get(0).get(1).get(2));
	System.out.println(list.get(1).get(2));
        System.out.println(list.get(1).get(2).get(3));
	
	/*
	  出力結果
	  [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
	  3
	  [3, 4, 5, 6, 7, 8, 9, 10, 11, 12]
	  6                                
	*/   
    }
    
}
