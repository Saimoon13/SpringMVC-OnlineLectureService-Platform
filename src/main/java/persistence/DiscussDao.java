package persistence;

import domain.Discuss;
import domain.Topics;
import pageutil.PaginationCriteria;

import java.util.Date;
import java.util.List;

public interface DiscussDao {

    List<Discuss> selectAllcate();
    List<Topics> selectTopicsByLid(String lid);
    int insert(Topics topics);
    int getCountByLid(String lid);
    List<Topics> selectPage(String lid, PaginationCriteria c);
    Topics selectTopicByTnumber(int tnumber);
    int updateLast(String writer, int tnumber, String title, String ld);
    int updateViews(int tnumber);
    int updateTopic(Topics topics);
    int deleteTopic(int tnumber);
    int searchCountTopicsByLid(String searchType, String searchKeyword, String lid);
    List<Topics> searchedList(String searchType, String searchKeyword, String lid);
    int updateTopicCount(String lid);
    int selectLastTnumber(String writer, Date topicdate);
    int topicTotalCount();
}
