package edu.upc.eetac.dsa.beeter.entity;

import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * Created by Panos on 08-Mar-16.
 */

@JsonInclude(JsonInclude.Include.NON_NULL)
public class BeeterError {
    private int status;
    private String reason;

    public BeeterError() {
    }

    public BeeterError(int status, String reason) {
        this.reason = reason;
        this.status = status;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }
}
