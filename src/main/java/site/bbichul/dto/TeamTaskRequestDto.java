package site.bbichul.dto;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class TeamTaskRequestDto {
    private Long id;
    private String task;
    private Boolean done;
}
