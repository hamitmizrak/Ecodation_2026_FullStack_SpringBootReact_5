package com.hamitmizrak.audit;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

// LOMBOK
@Getter
@Setter

/**
 Sisteme giriş yapmış kişinin bir tabloya ekleme, güncelleme yaptığında
 Database eklenecek kısımdır.
 */
abstract public class AuditingAwareBaseDto {

    // Kim Ekledi ?
    protected String createdBy;

    // Kim Ne zaman Ekledi ?
    protected Date createdDate;

    // Kim Güncelledi ?
    protected String lastUserBy;

    // Kim Ne Zaman Güncelledi ?
    protected Date lastUserDate;
}
