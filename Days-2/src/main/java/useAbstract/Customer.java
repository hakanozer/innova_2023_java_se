package useAbstract;

abstract public class Customer {

    abstract int customerNumber();
    abstract long customerTC();

    public int total() {
        int cid = customerNumber();
        if ( cid == 100 ) {
            return 1000000;
        }else if ( cid == 101 ) {
            return 2000000;
        }else if ( cid == 102 ) {
            return 3000000;
        }
        return 0;
    }

    public String name() {
        int cid = customerNumber();
        switch (cid) {
            case 100:
                return "Erkan Bilsin";
            case 101:
                return "Zehra Bil";
            case 102:
                return "Ayşe Bilirim";
            default:
                return "";
        }
    }

}
