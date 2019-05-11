import java.util.ArrayList;


public class Editor extends Worker {

	public Editor() {

	}
	
	//初始化Editor
	public Editor(String name, int age, int salary) {

	}
		
	/**
     * 文本对齐
     *
     * 根据统计经验，用户在手机上阅读英文新闻的时�?�，
     * �?行最多显�?32个字节（1个中文占2个字节）时最适合用户阅读�?
     * 给定�?段字符串，重新排版，使得每行恰好�?32个字节，并输出至控制�?
     * 首行缩进4个字节，其余行数左对齐，每个短句不超�?32个字节，
     * 每行�?后一个有效字符必须为标点符号
     *
     * 示例�?
     * 
     * String：给定一段字符串，重新排版，使得每行恰好�?32个字符，并输出至控制台首行缩进，其余行数左对齐，每个短句不超�?32个字符�??
     * 
     * 控制台输�?:    
     *     给定�?段字符串，重新排版，  
     * 使得每行恰好�?32个字符，
     * 并输出至控制台首行缩进，         
     * 其余行数左对齐，
     * 每个短句不超�?32个字符�??
     * 
     */
    public void  textExtraction(String data){

    }
    

    /**
     * 标题排序
     * 
     * 将给定的新闻标题按照拼音首字母进行排序，
     * 首字母相同则按第二个字母，如果首字母相同，则首字拼音没有后续的首字排在前面，�?  �?(e)与二(er)�?
     *            以鹅为开头的新闻排在以二为开头的新闻前�??
     * 如果新闻标题第一个字的拼音完全相同，则按照后续单词进行排序�?�如 新闻1�? 第一�?...  新闻2�? 第二�?...�?
     *            则新�?2应该排在新闻1之前�?
     * 示例�?
     *            
     * newsList：我是谁；谁是我；我是我
     * 
     * return：谁是我；我是谁；我是我�?
     *
     * @param newsList
     */
    public ArrayList<String> newsSort(ArrayList<String> newsList){
		return newsList;

    }


    /**
     * 热词搜索
     * 
     * 根据给定的新闻内容，找到文中出现频次�?高的�?个词语，词语长度�?少为2（即4个字节），最多为10（即20个字节），且词语中不包含标点符号，可以出现英文，同频词语选择在文中更早出现的词语�?
     * 
     * 示例�?
     * 
     * String: 今天的中国，呈现给世界的不仅有波澜壮阔的改革发展图景，更有一以贯之的平安祥和稳定。这平安祥和稳定的背后，凝聚�?中国治国理政的卓越智慧，也凝结着中国公安民警的辛勤奉献�??
     * 
     * return：中�?
     * 
     * @param newsContent
     */
    public String findHotWords(String newsContent){
		return newsContent;

    }
    
    /**
    *
    *相似度对�?
    *
    * 为了�?测新闻标题之间的相似度，公司�?要一个评估字符串相似度的算法�?
    * 即一个新闻标题A修改到新闻标题B�?要几步操作，我们将最少需要的次数定义�? �?少操作数
    * 操作包括三种�? 替换：一个字符替换成为另�?个字符，
    *              插入：在某位置插入一个字符，
    *              删除：删除某位置的字�?
    *  示例�?
    *      中国队是冠军  -> 我们是冠�?
    *      �?少需要三步来完成。第�?步删除第�?个字�?  "�?"
    *                       第二步替换第二个字符  "�?"->"�?"
    *                       第三步替换第三个字符  "�?"->"�?"
    *      因此 �?少的操作步数就是 3
    *
    * 定义相似�?= 1 - �?少操作次�?/较长字符串的长度
    * 如在上例中：相似度为  (1 - 3/6) * 100= 50.00（结果保�?2位小数，四舍五入，范围在0.00-100.00之间�?
    *
    *
    * @param title1
    * @param title2
    */
   public double minDistance(String title1, String title2){
	return 0;

   }
}