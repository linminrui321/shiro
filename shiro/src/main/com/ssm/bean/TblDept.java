package ssm.bean;

public class TblDept {
    private Integer deptId;

    private String deptName;


    public TblDept(String deptName) {
        this.deptName = deptName;
    }

    public TblDept() {
    }

    public Integer getDeptId() {
        return deptId;
    }

    public void setDeptId(Integer deptId) {
        this.deptId = deptId;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName == null ? null : deptName.trim();
    }
}