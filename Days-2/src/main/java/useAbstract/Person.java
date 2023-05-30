package useAbstract;

public class Person extends Customer{

    int cid = 0;
    long tc = 0;
    public Person( int cid, long tc ) {
        this.cid = cid;
        this.tc = tc;
    }

    @Override
    int customerNumber() {
        return cid;
    }

    @Override
    long customerTC() {
        return tc;
    }

}
