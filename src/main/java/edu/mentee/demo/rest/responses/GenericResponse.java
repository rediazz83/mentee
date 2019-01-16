package edu.mentee.demo.rest.responses;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class GenericResponse {

    private ServiceStatus status;
    private Object data;

    public GenericResponse(ServiceStatus status, Object data) {
        this.status = status;
        this.data = data;
    }

    public ServiceStatus getStatus() {
        return status;
    }

    public void setStatus(ServiceStatus status) {
        this.status = status;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "GenericResponse{" +
                "status=" + status +
                ", data=" + data +
                '}';
    }
}
