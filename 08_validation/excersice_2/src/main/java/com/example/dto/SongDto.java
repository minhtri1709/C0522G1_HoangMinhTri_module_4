package com.example.dto;

import org.springframework.validation.Validator;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class SongDto {

    @NotBlank(message = "Không được để trống")
    @Size(max = 800, message = "Không vượt quá 800 ký tự")
    @Pattern(regexp = "^[a-zA-Z0-9 \\+]*$", message = "Không chứa các kí tự đặc biệt như @ ; , . = - + , ….")
    private String singer;

    @NotBlank(message = "Không được để trống")
    @Size(max = 1000,message = "Không vượt quá 1000 ký tự")
    @Pattern(regexp = "^[a-zA-Z0-9, \\+]*$", message = "Không chứa các kí tự đặc biệt như @ ; , . = - + , ….")
    private String category;

    private String link;

    @NotBlank(message = "Không được để trống")
    @Size(max = 300 ,message = "Không vượt quá 300 ký tự")
    @Pattern(regexp = "^[a-zA-Z0-9, \\+]*$", message = "Không chứa các kí tự đặc biệt như @ ; . = - + , ….")
    private String name;

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
