package db;

/**
 * Created by Bruno on 3/31/2015.
 */
public class Contain {
    private int parentId;
    private int childId;

    public Contain(int parentId, int childId) {
        this.parentId = parentId;
        this.childId = childId;
    }

    public int getParentId() {
        return parentId;
    }

    public int getChildId() {
        return childId;
    }

    public void setParentId(int parentId) {
        this.parentId = parentId;
    }

    public void setChildId(int childId) {
        this.childId = childId;
    }
}
