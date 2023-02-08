package com.minal.app;

import com.minal.app.model.Hospital;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamApp {

    private static Hospital[] arrayOfHospitals = {
            new Hospital("1","Apollo","NewYork"),
            new Hospital("2","Icon","Florida"),
            new Hospital("3","Ozone","Indiana")
    };
    public Stream<Hospital> getHospitalArray(){
        return Stream.of(arrayOfHospitals);
    }
    public Stream<Hospital>getHospitalList(){
        List<Hospital> HList = Arrays.asList(arrayOfHospitals);
        return HList.stream();
    }
    public Stream<Hospital> getHospitalData(){
        return  Stream.of(arrayOfHospitals[0], arrayOfHospitals[1], arrayOfHospitals[2]);
    }

    public Stream<Hospital> getHospitalStreamBuilder(){
        Stream.Builder<Hospital> HosStreamBuilder = Stream.builder();

        HosStreamBuilder.accept(arrayOfHospitals[0]);
        HosStreamBuilder.accept(arrayOfHospitals[1]);
        HosStreamBuilder.accept(arrayOfHospitals[2]);

        Stream<Hospital> hosStream = HosStreamBuilder.build();
        return  hosStream;
    }
}
