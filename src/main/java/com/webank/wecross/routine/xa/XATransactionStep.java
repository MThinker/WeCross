package com.webank.wecross.routine.xa;

public class XATransactionStep {
    private int seq;
    private String contract;
    private String path;
    private String timestamp;
    private String func;
    private String args;

    public int getSeq() {
        return seq;
    }

    public void setSeq(int seq) {
        this.seq = seq;
    }

    public String getContract() {
        return contract;
    }

    public void setContract(String contract) {
        this.contract = contract;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public String getFunc() {
        return func;
    }

    public void setFunc(String func) {
        this.func = func;
    }

    public String getArgs() {
        return args;
    }

    public void setArgs(String args) {
        this.args = args;
    }

    @Override
    public String toString() {
        return "XATransactionStep{"
                + "seq="
                + seq
                + ", contract='"
                + contract
                + '\''
                + ", path='"
                + path
                + '\''
                + ", timestamp='"
                + timestamp
                + '\''
                + ", func='"
                + func
                + '\''
                + ", args='"
                + args
                + '\''
                + '}';
    }
}
