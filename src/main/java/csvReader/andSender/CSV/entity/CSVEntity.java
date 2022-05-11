package csvReader.andSender.CSV.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CSVEntity implements Serializable {

    private String phoneNumber;
    private String name;
    private String orderId;
    private String link;

    @Override
    public String toString() {
        return "CSVEntity{" +
                "phoneNumber='" + phoneNumber + '\'' +
                ", name='" + name + '\'' +
                ", orderId='" + orderId + '\'' +
                ", link='" + link + '\'' +
                '}';
    }
}
