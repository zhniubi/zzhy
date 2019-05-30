package com.jk.model;

import java.io.Serializable;
import java.util.List;

public class TreeBean implements Serializable {
    private static final long serialVersionUID = -2430219220702731185L;
    private Integer id;

    private String text;

    private String path;

    private Integer pid;

    private List<TreeBean> nodes;

    private Boolean selectable;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public List<TreeBean> getNodes() {
        return nodes;
    }

    public void setNodes(List<TreeBean> nodes) {
        this.nodes = nodes;
    }

    public Boolean getSelectable() {
        return selectable;
    }

    public void setSelectable(Boolean selectable) {
        this.selectable = selectable;
    }

    @Override
    public String toString() {
        return "TreeBean{" +
                "id=" + id +
                ", text='" + text + '\'' +
                ", path='" + path + '\'' +
                ", pid=" + pid +
                ", nodes=" + nodes +
                ", selectable=" + selectable +
                '}';
    }
}
