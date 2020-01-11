package com.example.hospital.dto;

import com.example.hospital.model.FollowUpRule;
import com.example.hospital.model.Reminders;
import com.example.hospital.model.SelectTemplate;

import java.util.List;

/**
 * @Author 周津锐
 * @date 2020/01/07
 */
public class SuperFollow extends FollowUpRule {
    private List<Reminders> reminders;

    private List<SelectTemplate> selectTemplates;

    public List<SelectTemplate> getSelectTemplates() {
        return selectTemplates;
    }

    public void setSelectTemplates(List<SelectTemplate> selectTemplates) {
        this.selectTemplates = selectTemplates;
    }

    public List<Reminders> getReminders() {
        return reminders;
    }

    public void setReminders(List<Reminders> reminders) {
        this.reminders = reminders;
    }

    @Override
    public String toString() {
        return "SuperFollow{" +
                "reminders=" + reminders +
                ", selectTemplates=" + selectTemplates +
                '}';
    }
}
