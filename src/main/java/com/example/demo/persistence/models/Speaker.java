package com.example.demo.persistence.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "speakers")
public class Speaker implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long speaker_id;
    @Column(nullable = false,
            length = 30)
    private String first_name;
    @Column(nullable = false,
            length = 30)
    private String last_name;
    @Column(nullable = false,
            length = 40)
    private String title;
    @Column(nullable = false,
            length = 50)
    private String company;
    @Column(nullable = false,
            length = 2000)
    private String speaker_bio;
    @Lob
    @Type(type = "org.hibernate.type.BinaryType")
    private byte[] speaker_photo;
    @ManyToMany(mappedBy = "speakers")
    @JsonIgnore
    private List<Session> sessions;


    public Speaker() {
    }

    public Speaker(Long speaker_id, String first_name, String last_name, String title, String company, String speaker_bio, byte[] speaker_photo) {
        this.speaker_id = speaker_id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.title = title;
        this.company = company;
        this.speaker_bio = speaker_bio;
        this.speaker_photo = speaker_photo;
    }

    public Speaker(Long speaker_id, String first_name, String last_name, String title, String company, String speaker_bio, byte[] speaker_photo, List<Session> sessions) {
        this.speaker_id = speaker_id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.title = title;
        this.company = company;
        this.speaker_bio = speaker_bio;
        this.speaker_photo = speaker_photo;
        this.sessions = sessions;
    }

    public Long getSpeaker_id() {
        return speaker_id;
    }

    public void setSpeaker_id(Long speaker_id) {
        this.speaker_id = speaker_id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getSpeaker_bio() {
        return speaker_bio;
    }

    public void setSpeaker_bio(String speaker_bio) {
        this.speaker_bio = speaker_bio;
    }

    public byte[] getSpeaker_photo() {
        return speaker_photo;
    }

    public void setSpeaker_photo(byte[] speaker_photo) {
        this.speaker_photo = speaker_photo;
    }

    public List<Session> getSessions() {
        return sessions;
    }

    public void setSessions(List<Session> sessions) {
        this.sessions = sessions;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Speaker speaker = (Speaker) o;

        if (!Objects.equals(speaker_id, speaker.speaker_id)) return false;
        if (!Objects.equals(first_name, speaker.first_name)) return false;
        if (!Objects.equals(last_name, speaker.last_name)) return false;
        if (!Objects.equals(title, speaker.title)) return false;
        if (!Objects.equals(company, speaker.company)) return false;
        if (!Objects.equals(speaker_bio, speaker.speaker_bio)) return false;
        if (!Arrays.equals(speaker_photo, speaker.speaker_photo)) return false;
        return Objects.equals(sessions, speaker.sessions);
    }

    @Override
    public int hashCode() {
        int result = speaker_id != null ? speaker_id.hashCode() : 0;
        result = 31 * result + (first_name != null ? first_name.hashCode() : 0);
        result = 31 * result + (last_name != null ? last_name.hashCode() : 0);
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + (company != null ? company.hashCode() : 0);
        result = 31 * result + (speaker_bio != null ? speaker_bio.hashCode() : 0);
        result = 31 * result + Arrays.hashCode(speaker_photo);
        result = 31 * result + (sessions != null ? sessions.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Speaker{" +
                "speaker_id=" + speaker_id +
                ", first_name='" + first_name + '\'' +
                ", last_name='" + last_name + '\'' +
                ", title='" + title + '\'' +
                ", company='" + company + '\'' +
                ", speaker_bio='" + speaker_bio + '\'' +
                ", speaker_photo=" + Arrays.toString(speaker_photo) +
                ", sessions=" + sessions +
                '}';
    }
}
