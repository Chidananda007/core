package core.core.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Entity {
    private int id;

    @JsonProperty("Name")
    private String name;

    @JsonProperty("name")
    private String assetName;

    @JsonProperty("Status")
    private String status;

    private String slug;

    @JsonProperty("Icon")
    private List<String> icons;

    @JsonProperty("order")
    private Integer order;

    @JsonProperty("edu_board")
    private Entity eduBoardForChapter;

    @JsonProperty("grade")
    private Entity gradeForChapter;
}