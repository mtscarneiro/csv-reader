package csvReader.andSender.rabbitProducer.entity;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
public class PayloadTemplate implements Serializable {

    private String Template;
    private List<Users> Users;

}