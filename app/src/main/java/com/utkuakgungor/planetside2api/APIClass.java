package com.utkuakgungor.planetside2api;

import java.util.List;

public class APIClass {
    private List<Result> result;

    public class Result{
        public int worldId;
        public int timestamp;
        public int vs;
        public int nc;
        public int tr;
        public int ns;
        public int unknown;
    }

    public List<Result> getResult() {
        return result;
    }

    public void setResult(List<Result> result) {
        this.result = result;
    }
}
