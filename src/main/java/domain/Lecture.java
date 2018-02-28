package domain;

public class Lecture {

    String lid;
    String lname;
    int lnum;
    String lcategory;
    String lexplain;
    String lecturer;
    int tnum;
    int rlycount;
    int topiccount;
    String lastjson;

    public Lecture() {}
    public Lecture(String lid, String lname, int lnum, String lcategory, String lexplain, String lecturer) {
        this.lid = lid;
        this.lname = lname;
        this.lnum = lnum;
        this.lcategory = lcategory;
        this.lexplain = lexplain;
        this.lecturer = lecturer;
    }
    public Lecture(String lid, String lname, int lnum, String lcategory, String lexplain, String lecturer, int tnum) {
        this.lid = lid;
        this.lname = lname;
        this.lnum = lnum;
        this.lcategory = lcategory;
        this.lexplain = lexplain;
        this.lecturer = lecturer;
        this.tnum = tnum;
    }

    public String getLid() {
        return lid;
    }
    public String getLname() {
        return lname;
    }
    public int getLnum() {
        return lnum;
    }
    public String getLcategory() {
        return lcategory;
    }
    public String getLexplain() {
        return lexplain;
    }
    public String getLecturer() {
        return lecturer;
    }
    public int getTnum() {
        return tnum;
    }
    public int getRlycount() {
        return rlycount;
    }
    public int getTopiccount() {
        return topiccount;
    }
    public String getLastjson() {
        return lastjson;
    }

    public void setLid(String lid) {
        this.lid = lid;
    }
    public void setLname(String lname) {
        this.lname = lname;
    }
    public void setLnum(int lnum) {
        this.lnum = lnum;
    }
    public void setLcategory(String lcategory) {
        this.lcategory = lcategory;
    }
    public void setLexplain(String lexplain) {
        this.lexplain = lexplain;
    }
    public void setLecturer(String lecturer) {
        this.lecturer = lecturer;
    }
    public void setTnum(int tnum) {
        this.tnum = tnum;
    }
    public void setRlycount(int rlycount) {
        this.rlycount = rlycount;
    }
    public void setTopiccount(int topiccount) {
        this.topiccount = topiccount;
    }
    public void setLastjson(String lastjson) {
        this.lastjson = lastjson;
    }
}
