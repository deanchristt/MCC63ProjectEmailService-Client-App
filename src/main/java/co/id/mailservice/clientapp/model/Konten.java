/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.id.mailservice.clientapp.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 *
 * @author Deanchristt
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Konten {

    private Long id;
    private String subject;
    private String body;
    private String footer;
    private String attachment;
    private List<ScheduleEmail> scheduleEmails;
    private Template template;
}
