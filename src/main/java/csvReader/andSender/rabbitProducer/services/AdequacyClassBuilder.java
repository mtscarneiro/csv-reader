package csvReader.andSender.rabbitProducer.services;

import csvReader.andSender.CSV.entity.CSVEntity;
import csvReader.andSender.rabbitProducer.entity.PayloadTemplate;
import csvReader.andSender.rabbitProducer.entity.Users;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class AdequacyClassBuilder {

    public PayloadTemplate build(CSVEntity csvEntity) {
        if (Objects.equals(csvEntity.getOrderId(), "") || Objects.equals(csvEntity.getPhoneNumber(), "")) {
            return null;
        }

        return new PayloadTemplate("pesquisa_nps_1",
                List.of(
                        new Users(csvEntity.getPhoneNumber(),
                                csvEntity.getName(),
                                csvEntity.getOrderId(),
                                csvEntity.getLink()))
        );
    }
}
