package com.example.server.response;

import com.example.server.entity.BookEntity;
import lombok.Data;

@Data
public class BookResponse extends BaseResponse {
    private BookEntity data;
    public BookResponse(boolean success,String message,BookEntity data){
        super(success,message);
        this.data = data;
    }
}
