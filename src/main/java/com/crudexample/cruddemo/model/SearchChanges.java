package com.crudexample.cruddemo.model;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;

@Entity
@Table(name = "search_changes_v2")
@EntityListeners(AuditingEntityListener.class)
public class SearchChanges {

    @Id
    private Long id;

    @Column(name = "ITEMID", nullable = false)
    private Long itemId;

    @Column(name = "UPDATE_COUNTER", nullable = false)
    private String update_counter;

    @Column(name = "UPDATE_FLAG", nullable = false)
    private String update_flag;

    @Column(name = "UPDATE_DATE", nullable = false)
    private String update_date;

    public SearchChanges() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getItemId() {
        return itemId;
    }

    public void setItemId(Long itemId) {
        this.itemId = itemId;
    }

    public String getUpdate_counter() {
        return update_counter;
    }

    public void setUpdate_counter(String update_counter) {
        this.update_counter = update_counter;
    }

    public String getUpdate_flag() {
        return update_flag;
    }

    public void setUpdate_flag(String update_flag) {
        this.update_flag = update_flag;
    }

    public String getUpdate_date() {
        return update_date;
    }

    public void setUpdate_date(String update_date) {
        this.update_date = update_date;
    }

    @Override
    public String toString() {
        return "SearchChanges{" +
                "id=" + id +
                ", itemId='" + itemId + '\'' +
                ", update_counter='" + update_counter + '\'' +
                ", update_flag='" + update_flag + '\'' +
                ", update_data='" + update_date + '\'' +
                '}';
    }
}
