package com.example.demo.persistence.models;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "sessions")
public class Session implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long session_id;
    @Column(nullable = false,
            length = 80)
    private String session_name;
    @Column(nullable = false,
            length = 1024)
    private String session_description;
    private Integer session_length;

    @ManyToMany
    @JoinTable(name = "session_speakers",
            joinColumns = @JoinColumn(name = "session_id"),
            inverseJoinColumns = @JoinColumn(name = "speaker_id"))
    private List<Speaker> speakers;

    public Session() {
    }

    public Session(Long session_id, String session_name, String session_description, Integer session_length) {
        this.session_id = session_id;
        this.session_name = session_name;
        this.session_description = session_description;
        this.session_length = session_length;
    }

    public Long getSession_id() {
        return session_id;
    }

    public void setSession_id(Long session_id) {
        this.session_id = session_id;
    }

    public String getSession_name() {
        return session_name;
    }

    public void setSession_name(String session_name) {
        this.session_name = session_name;
    }

    public String getSession_description() {
        return session_description;
    }

    public void setSession_description(String session_description) {
        this.session_description = session_description;
    }

    public Integer getSession_length() {
        return session_length;
    }

    public void setSession_length(Integer session_length) {
        this.session_length = session_length;
    }

    public List<Speaker> getSpeakers() {
        return speakers;
    }

    public void setSpeakers(List<Speaker> speakers) {
        this.speakers = speakers;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Session session = (Session) o;

        if (!Objects.equals(session_id, session.session_id)) return false;
        if (!Objects.equals(session_name, session.session_name))
            return false;
        if (!Objects.equals(session_description, session.session_description))
            return false;
        return Objects.equals(session_length, session.session_length);
    }

    @Override
    public int hashCode() {
        int result = session_id != null ? session_id.hashCode() : 0;
        result = 31 * result + (session_name != null ? session_name.hashCode() : 0);
        result = 31 * result + (session_description != null ? session_description.hashCode() : 0);
        result = 31 * result + (session_length != null ? session_length.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Session{" +
                "session_id=" + session_id +
                ", session_name='" + session_name + '\'' +
                ", session_description='" + session_description + '\'' +
                ", session_length=" + session_length +
                '}';
    }
}
