package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import org.springframework.format.annotation.DateTimeFormat;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * WorkTime
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-09-15T18:52:56.718999500+02:00[Europe/Rome]")
public class WorkTime {

  @JsonProperty("id")
  private Long id;

  @JsonProperty("projectId")
  private Long projectId;

  @JsonProperty("employeeId")
  private Long employeeId;

  @JsonProperty("startTime")
  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime startTime;

  @JsonProperty("endTime")
  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime endTime;

  @JsonProperty("approvedBy")
  private String approvedBy;

  @JsonProperty("approvedDate")
  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private LocalDate approvedDate;

  public WorkTime id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  */
  
  @Schema(name = "id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public WorkTime projectId(Long projectId) {
    this.projectId = projectId;
    return this;
  }

  /**
   * Get projectId
   * @return projectId
  */
  
  @Schema(name = "projectId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public Long getProjectId() {
    return projectId;
  }

  public void setProjectId(Long projectId) {
    this.projectId = projectId;
  }

  public WorkTime employeeId(Long employeeId) {
    this.employeeId = employeeId;
    return this;
  }

  /**
   * Get employeeId
   * @return employeeId
  */
  
  @Schema(name = "employeeId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public Long getEmployeeId() {
    return employeeId;
  }

  public void setEmployeeId(Long employeeId) {
    this.employeeId = employeeId;
  }

  public WorkTime startTime(OffsetDateTime startTime) {
    this.startTime = startTime;
    return this;
  }

  /**
   * Get startTime
   * @return startTime
  */
  @Valid 
  @Schema(name = "startTime", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public OffsetDateTime getStartTime() {
    return startTime;
  }

  public void setStartTime(OffsetDateTime startTime) {
    this.startTime = startTime;
  }

  public WorkTime endTime(OffsetDateTime endTime) {
    this.endTime = endTime;
    return this;
  }

  /**
   * Get endTime
   * @return endTime
  */
  @Valid 
  @Schema(name = "endTime", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public OffsetDateTime getEndTime() {
    return endTime;
  }

  public void setEndTime(OffsetDateTime endTime) {
    this.endTime = endTime;
  }

  public WorkTime approvedBy(String approvedBy) {
    this.approvedBy = approvedBy;
    return this;
  }

  /**
   * Get approvedBy
   * @return approvedBy
  */
  
  @Schema(name = "approvedBy", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getApprovedBy() {
    return approvedBy;
  }

  public void setApprovedBy(String approvedBy) {
    this.approvedBy = approvedBy;
  }

  public WorkTime approvedDate(LocalDate approvedDate) {
    this.approvedDate = approvedDate;
    return this;
  }

  /**
   * Start date
   * @return approvedDate
  */
  @Valid @Pattern(regexp = "YYYY-MM-DD") @Size(min = 0, max = 10) 
  @Schema(name = "approvedDate", example = "Sun Jan 01 01:00:00 CET 2017", description = "Start date", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public LocalDate getApprovedDate() {
    return approvedDate;
  }

  public void setApprovedDate(LocalDate approvedDate) {
    this.approvedDate = approvedDate;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorkTime workTime = (WorkTime) o;
    return Objects.equals(this.id, workTime.id) &&
        Objects.equals(this.projectId, workTime.projectId) &&
        Objects.equals(this.employeeId, workTime.employeeId) &&
        Objects.equals(this.startTime, workTime.startTime) &&
        Objects.equals(this.endTime, workTime.endTime) &&
        Objects.equals(this.approvedBy, workTime.approvedBy) &&
        Objects.equals(this.approvedDate, workTime.approvedDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, projectId, employeeId, startTime, endTime, approvedBy, approvedDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkTime {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
    sb.append("    employeeId: ").append(toIndentedString(employeeId)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    approvedBy: ").append(toIndentedString(approvedBy)).append("\n");
    sb.append("    approvedDate: ").append(toIndentedString(approvedDate)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

