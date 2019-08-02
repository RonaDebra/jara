package com.jara;

public class unit {
    private Long id;
    private String unitName;
    private String enrollmentKey;


    public unit(String unitName) {
        this.unitName = unitName;
    }

    public String getEnrollmentKey() { return enrollmentKey;
    }

    public void setEnrollmentKey(String enrollmentKey) { this.enrollmentKey = enrollmentKey;
    }

    private unit() {
    }

    public Long getId() { return id;
    }

    public void setId(Long id) { this.id = id;
    }

    public String getUnitName() { return unitName;
    }

    public void setUnitName(String unitName) { this.unitName = unitName;
    }

    @Override
    public String toString() {
        return "unit{" +
                "id=" + id +
                ", unitName='" + unitName + '\'' +
                '}';
    }
}
