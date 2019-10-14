package model;

/**
 * Created by Administrator on 2018/11/22.
 */

public class _User{


    private String Name;
    private Integer In_id;
    private String In_sex;
    private int In_pvecorrect;
    private int In_pvetotal;
    private int In_tx;

    public _User() {

    }

    public _User(String name,Integer in_id, String in_sex, int in_pvecorrect, int in_pvetotal, int in_tx) {
        Name = name;
        In_id = in_id;
        In_sex = in_sex;
        In_pvecorrect = in_pvecorrect;
        In_pvetotal = in_pvetotal;
        In_tx = in_tx;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public long getIn_id() {
        return In_id;
    }

    public void setIn_id(Integer in_id) {
        In_id = in_id;
    }

    public String getIn_sex() {
        return In_sex;
    }

    public void setIn_sex(String in_sex) {
        In_sex = in_sex;
    }

    public int getIn_pvecorrect() {
        return In_pvecorrect;
    }

    public void setIn_pvecorrect(int in_pvecorrect) {
        In_pvecorrect = in_pvecorrect;
    }

    public int getIn_pvetotal() {
        return In_pvetotal;
    }

    public void setIn_pvetotal(int in_pvetotal) {
        In_pvetotal = in_pvetotal;
    }

    public int getIn_tx() {
        return In_tx;
    }

    public void setIn_tx(int in_tx) {
        In_tx = in_tx;
    }
}
