package gr.projectFuruture.acmeFlix2.transfer;

import lombok.Value;

@Value
public class ApiError {
    Integer status;
    String message;
    String path;
}
