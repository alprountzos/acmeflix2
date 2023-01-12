package gr.projectFuruture.acmeFlix2.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;


import java.util.Date;

@Data
@SuperBuilder
@Entity
@NoArgsConstructor
public class Backup extends BaseModel{

    @Column(nullable = false)
    private String path;

    @Temporal(TemporalType.DATE)
    @Column(nullable = false)
    private Date date;
}
