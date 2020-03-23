package rez.school.rez;

import javax.validation.constraints.NotBlank;

public class Rez {
    @NotBlank(message = "need required")
    private String rez;

    public String getRez() {
        return rez;
    }

    public void setRez(String rez) {
        this.rez = rez;
    }
}
