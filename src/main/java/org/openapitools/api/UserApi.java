/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (4.3.1).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package org.openapitools.api;

import org.openapitools.model.UserModel;
import io.swagger.annotations.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;
import java.util.Optional;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-07-12T11:33:32.539-05:00[America/Chicago]")

@Validated
@Api(value = "user", description = "the user API")
public interface UserApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * GET /user/getAllUser : getAllUser
     * Operation to get all users
     *
     * @param body  (optional)
     * @return OK (status code 200)
     */
    @ApiOperation(value = "getAllUser", nickname = "getUserGetAllUser", notes = "Operation to get all users", response = UserModel.class, responseContainer = "List", tags={ "operations", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = UserModel.class, responseContainer = "List") })
    @RequestMapping(value = "/user/getAllUser",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.GET)
    default ResponseEntity<List<UserModel>> getUserGetAllUser(@ApiParam(value = ""  )  @Valid @RequestBody(required = false) Object body) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"firstName\" : \"Amal\", \"lastName\" : \"raj\", \"role\" : \"manager\", \"id\" : \"id\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.OK);

    }


    /**
     * POST /user/createUser : createUser
     * create a user
     *
     * @param userModel  (optional)
     * @return OK (status code 200)
     */
    @ApiOperation(value = "createUser", nickname = "postUserCreateUser", notes = "create a user", response = UserModel.class, tags={ "operations", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = UserModel.class) })
    @RequestMapping(value = "/user/createUser",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    default ResponseEntity<UserModel> postUserCreateUser(@ApiParam(value = ""  )  @Valid @RequestBody(required = false) UserModel userModel) {
		/*
		 * getRequest().ifPresent(request -> { for (MediaType mediaType:
		 * MediaType.parseMediaTypes(request.getHeader("Accept"))) { if
		 * (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) { String
		 * exampleString =
		 * "{ \"firstName\" : \"Amal\", \"lastName\" : \"raj\", \"role\" : \"role\", \"id\" : \"id\" }"
		 * ; ApiUtil.setExampleResponse(request, "application/json", exampleString);
		 * break; } } });
		 */
       // return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    	return ResponseEntity.ok().body(userModel);
        

    }

}