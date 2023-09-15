/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (6.3.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package org.openapitools.api;

import org.openapitools.model.WorkTime;
import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.Parameters;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Generated;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-09-15T18:52:56.718999500+02:00[Europe/Rome]")
@Validated
@Tag(name = "workTime", description = "the workTime API")
public interface WorkTimeApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * POST /workTime : Add new WorkTime
     * Add a new WorkTime
     *
     * @param workTime Create a new Worktime (required)
     * @return Successful operation (status code 200)
     *         or Invalid input (status code 405)
     */
    @Operation(
        operationId = "addWorkTime",
        summary = "Add new WorkTime",
        description = "Add a new WorkTime",
        responses = {
            @ApiResponse(responseCode = "200", description = "Successful operation", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = WorkTime.class)),
                @Content(mediaType = "application/xml", schema = @Schema(implementation = WorkTime.class))
            }),
            @ApiResponse(responseCode = "405", description = "Invalid input")
        }
    )
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/workTime",
        produces = { "application/json", "application/xml" },
        consumes = { "application/json", "application/xml", "application/x-www-form-urlencoded" }
    )
    default ResponseEntity<WorkTime> addWorkTime(
        @Parameter(name = "WorkTime", description = "Create a new Worktime", required = true) @Valid @RequestBody WorkTime workTime
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"approvedDate\" : \"2017-01-01T00:00:00.000+00:00\", \"approvedBy\" : \"approvedBy\", \"employeeId\" : 1, \"startTime\" : \"2000-01-23T04:56:07.000+00:00\", \"id\" : 0, \"endTime\" : \"2000-01-23T04:56:07.000+00:00\", \"projectId\" : 6 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/xml"))) {
                    String exampleString = "<null> <id>123456789</id> <projectId>123456789</projectId> <employeeId>123456789</employeeId> <startTime>2000-01-23T04:56:07.000Z</startTime> <endTime>2000-01-23T04:56:07.000Z</endTime> <approvedBy>aeiou</approvedBy> <approvedDate>Sun Jan 01 01:00:00 CET 2017</approvedDate> </null>";
                    ApiUtil.setExampleResponse(request, "application/xml", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * DELETE /workTime/{workTimeId} : Deletes a WorkTime
     * delete a workTime
     *
     * @param workTimeId WorkTime id to delete (required)
     * @param apiKey  (optional)
     * @return Invalid workTime value (status code 400)
     */
    @Operation(
        operationId = "deleteWorkTime",
        summary = "Deletes a WorkTime",
        description = "delete a workTime",
        responses = {
            @ApiResponse(responseCode = "400", description = "Invalid workTime value")
        }
    )
    @RequestMapping(
        method = RequestMethod.DELETE,
        value = "/workTime/{workTimeId}"
    )
    default ResponseEntity<Void> deleteWorkTime(
        @Parameter(name = "workTimeId", description = "WorkTime id to delete", required = true, in = ParameterIn.PATH) @PathVariable("workTimeId") Long workTimeId,
        @Parameter(name = "api_key", description = "", in = ParameterIn.HEADER) @RequestHeader(value = "api_key", required = false) String apiKey
    ) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /workTime/{workTimeId} : Find WorkTime by ID
     * Returns a single WorkTime
     *
     * @param workTimeId ID of workTime to return (required)
     * @return successful operation (status code 200)
     *         or Invalid ID supplied (status code 400)
     *         or WorkTime not found (status code 404)
     */
    @Operation(
        operationId = "getWorkTimeById",
        summary = "Find WorkTime by ID",
        description = "Returns a single WorkTime",
        responses = {
            @ApiResponse(responseCode = "200", description = "successful operation", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = WorkTime.class)),
                @Content(mediaType = "application/xml", schema = @Schema(implementation = WorkTime.class))
            }),
            @ApiResponse(responseCode = "400", description = "Invalid ID supplied"),
            @ApiResponse(responseCode = "404", description = "WorkTime not found")
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/workTime/{workTimeId}",
        produces = { "application/json", "application/xml" }
    )
    default ResponseEntity<WorkTime> getWorkTimeById(
        @Parameter(name = "workTimeId", description = "ID of workTime to return", required = true, in = ParameterIn.PATH) @PathVariable("workTimeId") Long workTimeId
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"approvedDate\" : \"2017-01-01T00:00:00.000+00:00\", \"approvedBy\" : \"approvedBy\", \"employeeId\" : 1, \"startTime\" : \"2000-01-23T04:56:07.000+00:00\", \"id\" : 0, \"endTime\" : \"2000-01-23T04:56:07.000+00:00\", \"projectId\" : 6 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/xml"))) {
                    String exampleString = "<WorkTime> <id>123456789</id> <projectId>123456789</projectId> <employeeId>123456789</employeeId> <startTime>2000-01-23T04:56:07.000Z</startTime> <endTime>2000-01-23T04:56:07.000Z</endTime> <approvedBy>aeiou</approvedBy> <approvedDate>Sun Jan 01 01:00:00 CET 2017</approvedDate> </WorkTime>";
                    ApiUtil.setExampleResponse(request, "application/xml", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * POST /workTime/{workTimeId} : Updates a workTime
     * 
     *
     * @param workTimeId ID of workTime that needs to be updated (required)
     * @param startTime StartTime of project that needs to be updated (optional)
     * @param endTime EndTime of project that needs to be updated (optional)
     * @param approvedDate ApprovedDate of project that needs to be updated (optional)
     * @return Invalid input (status code 405)
     */
    @Operation(
        operationId = "updateWorkTime",
        summary = "Updates a workTime",
        description = "",
        responses = {
            @ApiResponse(responseCode = "405", description = "Invalid input")
        }
    )
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/workTime/{workTimeId}"
    )
    default ResponseEntity<Void> updateWorkTime(
        @Parameter(name = "workTimeId", description = "ID of workTime that needs to be updated", required = true, in = ParameterIn.PATH) @PathVariable("workTimeId") Long workTimeId,
        @Parameter(name = "StartTime", description = "StartTime of project that needs to be updated", in = ParameterIn.QUERY) @Valid @RequestParam(value = "StartTime", required = false) String startTime,
        @Parameter(name = "EndTime", description = "EndTime of project that needs to be updated", in = ParameterIn.QUERY) @Valid @RequestParam(value = "EndTime", required = false) String endTime,
        @Parameter(name = "ApprovedDate", description = "ApprovedDate of project that needs to be updated", in = ParameterIn.QUERY) @Valid @RequestParam(value = "ApprovedDate", required = false) String approvedDate
    ) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}