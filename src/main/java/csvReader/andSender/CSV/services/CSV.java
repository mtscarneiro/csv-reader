package csvReader.andSender.CSV.services;

import csvReader.andSender.CSV.entity.CSVEntity;
import csvReader.andSender.rabbitProducer.services.AdequacyClassBuilder;
import csvReader.andSender.rabbitProducer.services.Producer;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CSV {

    private AdequacyClassBuilder adequacyClassBuilder;
    private Producer producer;

    public CSV(AdequacyClassBuilder adequacyClassBuilder, Producer producer) {
        this.adequacyClassBuilder = adequacyClassBuilder;
        this.producer = producer;
    }

    public CSVEntity readAndSendData() {
        CSVEntity csvEntity = new CSVEntity();
        String line = "";
        String byCommas = ",";

        try {

            BufferedReader reader = new BufferedReader(new FileReader(""));
            while ((line = reader.readLine()) != null) {

                String[] data = line.split(byCommas);
                csvEntity.setPhoneNumber(data[0]);
                csvEntity.setName(data[1]);
                csvEntity.setOrderId(data[2]);
                csvEntity.setLink(data[3]);

                var payload = adequacyClassBuilder.build(csvEntity);
               // producer.produce(payload);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return csvEntity;
    }
}
