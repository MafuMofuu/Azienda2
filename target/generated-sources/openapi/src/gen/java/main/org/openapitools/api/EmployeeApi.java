/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (6.3.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package org.openapitools.api;

import org.openapitools.model.Employee;
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
@Tag(name = "employee", description = "the employee API")
public interface EmployeeApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * POST /employee : Add a new Employee
     * Add a new Employee
     *
     * @param employee Create a new Employee (required)
     * @return Successful operation (status code 200)
     *         or Invalid input (status code 405)
     */
    @Operation(
        operationId = "addEmployee",
        summary = "Add a new Employee",
        description = "Add a new Employee",
        responses = {
            @ApiResponse(responseCode = "200", description = "Successful operation", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Employee.class)),
                @Content(mediaType = "application/xml", schema = @Schema(implementation = Employee.class))
            }),
            @ApiResponse(responseCode = "405", description = "Invalid input")
        }
    )
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/employee",
        produces = { "application/json", "application/xml" },
        consumes = { "application/json", "application/xml", "application/x-www-form-urlencoded" }
    )
    default ResponseEntity<Employee> addEmployee(
        @Parameter(name = "Employee", description = "Create a new Employee", required = true) @Valid @RequestBody Employee employee
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"role\" : \"role\", \"name\" : \"name\", \"id\" : 0 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/xml"))) {
                    String exampleString = "<Employee> <id>123456789</id> <name>aeiou</name> <role>aeiou</role> </Employee>";
                    ApiUtil.setExampleResponse(request, "application/xml", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * DELETE /employee/{employeeId} : Deletes an employee
     * delete an employee
     *
     * @param employeeId Employee id to delete (required)
     * @param apiKey  (optional)
     * @return Invalid employee value (status code 400)
     */
    @Operation(
        operationId = "deleteEmployee",
        summary = "Deletes an employee",
        description = "delete an employee",
        responses = {
            @ApiResponse(responseCode = "400", description = "Invalid employee value")
        }
    )
    @RequestMapping(
        method = RequestMethod.DELETE,
        value = "/employee/{employeeId}"
    )
    default ResponseEntity<Void> deleteEmployee(
        @Parameter(name = "employeeId", description = "Employee id to delete", required = true, in = ParameterIn.PATH) @PathVariable("employeeId") Long employeeId,
        @Parameter(name = "api_key", description = "", in = ParameterIn.HEADER) @RequestHeader(value = "api_key", required = false) String apiKey
    ) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /employee/{employeeId} : Find Employee by ID
     * Returns a single Employee
     *
     * @param employeeId ID of employee to return (required)
     * @return successful operation (status code 200)
     *         or Invalid ID supplied (status code 400)
     *         or Employee not found (status code 404)
     */
    @Operation(
        operationId = "getEmployeeById",
        summary = "Find Employee by ID",
        description = "Returns a single Employee",
        responses = {
            @ApiResponse(responseCode = "200", description = "successful operation", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Employee.class)),
                @Content(mediaType = "application/xml", schema = @Schema(implementation = Employee.class))
            }),
            @ApiResponse(responseCode = "400", description = "Invalid ID supplied"),
            @ApiResponse(responseCode = "404", description = "Employee not found")
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/employee/{employeeId}",
        produces = { "application/json", "application/xml" }
    )
    default ResponseEntity<Employee> getEmployeeById(
        @Parameter(name = "employeeId", description = "ID of employee to return", required = true, in = ParameterIn.PATH) @PathVariable("employeeId") Long employeeId
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"role\" : \"role\", \"name\" : \"name\", \"id\" : 0 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/xml"))) {
                    String exampleString = "<Employee> <id>123456789</id> <name>aeiou</name> <role>aeiou</role> </Employee>";
                    ApiUtil.setExampleResponse(request, "application/xml", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * PUT /employee : Update an existing Employee
     * Update an existing Employee by Id
     *
     * @param employee Update an existent Employee (required)
     * @return Successful operation (status code 200)
     *         or Invalid ID supplied (status code 400)
     *         or Employee not found (status code 404)
     *         or Validation exception (status code 405)
     */
    @Operation(
        operationId = "updateEmployee",
        summary = "Update an existing Employee",
        description = "Update an existing Employee by Id",
        responses = {
            @ApiResponse(responseCode = "200", description = "Successful operation", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Employee.class)),
                @Content(mediaType = "application/xml", schema = @Schema(implementation = Employee.class))
            }),
            @ApiResponse(responseCode = "400", description = "Invalid ID supplied"),
            @ApiResponse(responseCode = "404", description = "Employee not found"),
            @ApiResponse(responseCode = "405", description = "Validation exception")
        }
    )
    @RequestMapping(
        method = RequestMethod.PUT,
        value = "/employee",
        produces = { "application/json", "application/xml" },
        consumes = { "application/json", "application/xml", "application/x-www-form-urlencoded" }
    )
    default ResponseEntity<Employee> updateEmployee(
        @Parameter(name = "Employee", description = "Update an existent Employee", required = true) @Valid @RequestBody Employee employee
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"role\" : \"role\", \"name\" : \"name\", \"id\" : 0 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/xml"))) {
                    String exampleString = "<null> <id>123456789</id> <name>aeiou</name> <role>aeiou</role> </null>";
                    ApiUtil.setExampleResponse(request, "application/xml", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * POST /employee/{employeeId} : Updates a employee  with form data
     * 
     *
     * @param employeeId ID of employee that needs to be updated (required)
     * @param name Name of employee that needs to be updated (optional)
     * @param role Role of employee that needs to be updated (optional)
     * @return Invalid input (status code 405)
     */
    @Operation(
        operationId = "updateEmployeeWithForm",
        summary = "Updates a employee  with form data",
        description = "",
        responses = {
            @ApiResponse(responseCode = "405", description = "Invalid input")
        }
    )
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/employee/{employeeId}"
    )
    default ResponseEntity<Void> updateEmployeeWithForm(
        @Parameter(name = "employeeId", description = "ID of employee that needs to be updated", required = true, in = ParameterIn.PATH) @PathVariable("employeeId") Long employeeId,
        @Parameter(name = "name", description = "Name of employee that needs to be updated", in = ParameterIn.QUERY) @Valid @RequestParam(value = "name", required = false) String name,
        @Parameter(name = "role", description = "Role of employee that needs to be updated", in = ParameterIn.QUERY) @Valid @RequestParam(value = "role", required = false) String role
    ) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}