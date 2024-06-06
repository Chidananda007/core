package core.core.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_DEFAULT)
@JsonIgnoreProperties(ignoreUnknown = true)
public class SubjectDetailResponse {
    @JsonProperty("subject_id")
    private Long subjectId;

    @JsonProperty("subject_slug")
    private String subjectSlug;

    @JsonProperty("subject_name")
    private String subjectName;

    @JsonProperty("board_slug")
    private String boardSlug;

    @JsonProperty("board_name")
    private String boardName;

    @JsonProperty("grade_slug")
    private String gradeSlug;

    @JsonProperty("grade_name")
    private String gradeName;

    @JsonProperty("status")
    private String status;
}
